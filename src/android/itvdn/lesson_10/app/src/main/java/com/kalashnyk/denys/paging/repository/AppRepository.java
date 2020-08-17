package com.kalashnyk.denys.paging.repository;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MediatorLiveData;
import android.arch.paging.PagedList;
import android.util.Log;

import com.kalashnyk.denys.paging.repository.server.ServerCommunicator;
import com.kalashnyk.denys.paging.repository.server.paging.NetProductsDataSourceFactory;
import com.kalashnyk.denys.paging.repository.database.ProductsDatabase;
import com.kalashnyk.denys.paging.repository.database.entities.ProductEntity;
import com.kalashnyk.denys.paging.repository.database.state.NetworkState;

import rx.schedulers.Schedulers;

public class AppRepository {

    private static final String TAG = AppRepository.class.getSimpleName();
    final private ServerCommunicator mCommunicator;
    final private ProductsDatabase mDatabase;
    final private MediatorLiveData mLiveDataMerger;

    public AppRepository(ServerCommunicator communicator, ProductsDatabase database) {

        NetProductsDataSourceFactory dataSourceFactory = new NetProductsDataSourceFactory();

        mCommunicator = communicator;
        mDatabase = database;

        mLiveDataMerger = new MediatorLiveData<>();
        mLiveDataMerger.addSource(mCommunicator.getPagedProducts(), value -> {
            mLiveDataMerger.setValue(value);
            Log.d(TAG, value.toString());
        });

        dataSourceFactory.getProducts().
                observeOn(Schedulers.io()).
                subscribe(product -> {
                    mDatabase.productDao().insertProduct(product);
                });
    }

    private PagedList.BoundaryCallback<ProductEntity> boundaryCallback = new PagedList.BoundaryCallback<ProductEntity>() {
        @Override
        public void onZeroItemsLoaded() {
            super.onZeroItemsLoaded();
            mLiveDataMerger.addSource(mDatabase.getProducts(), value -> {
                mLiveDataMerger.setValue(value);
                mLiveDataMerger.removeSource(mDatabase.getProducts());
            });
        }
    };

    public LiveData<PagedList<ProductEntity>> getProducts(){
        return mLiveDataMerger;
    }

    public LiveData<NetworkState> getNetworkState() {
        return mCommunicator.getNetworkState();
    }
}
