package com.kalashnyk.denys.paging.repository.server.paging;

import android.arch.lifecycle.MutableLiveData;
import android.arch.paging.DataSource;

import com.kalashnyk.denys.paging.repository.database.entities.ProductEntity;

import rx.subjects.ReplaySubject;

public class NetProductsDataSourceFactory extends DataSource.Factory {


    private MutableLiveData<NetProductsPageKeyedDataSource> mNetworkStatus;
    private NetProductsPageKeyedDataSource mProductsPageKeyedDataSource;
    public NetProductsDataSourceFactory() {
        this.mNetworkStatus = new MutableLiveData<>();
        mProductsPageKeyedDataSource = new NetProductsPageKeyedDataSource();
    }

    @Override
    public DataSource create() {
        mNetworkStatus.postValue(mProductsPageKeyedDataSource);
        return mProductsPageKeyedDataSource;
    }

    public MutableLiveData<NetProductsPageKeyedDataSource> getNetworkStatus() {
        return mNetworkStatus;
    }

    public ReplaySubject<ProductEntity> getProducts() {
        return mProductsPageKeyedDataSource.getProducts();
    }

}
