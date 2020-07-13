package com.kalashnyk.denys.paging.repository.server;

import android.arch.core.util.Function;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.Transformations;
import android.arch.paging.LivePagedListBuilder;
import android.arch.paging.PagedList;

import com.kalashnyk.denys.paging.repository.server.paging.NetProductsDataSourceFactory;
import com.kalashnyk.denys.paging.repository.server.paging.NetProductsPageKeyedDataSource;
import com.kalashnyk.denys.paging.repository.database.entities.ProductEntity;
import com.kalashnyk.denys.paging.repository.database.state.NetworkState;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import static com.kalashnyk.denys.paging.utils.Constants.LOADING_PAGE_SIZE;
import static com.kalashnyk.denys.paging.utils.Constants.NUMBER_OF_THREADS;

public class ServerCommunicator {

    final private LiveData<PagedList<ProductEntity>> mProductsPaged;
    final private LiveData<NetworkState> mNetworkState;

    public ServerCommunicator(NetProductsDataSourceFactory dataSourceFactory){
        PagedList.Config pagedListConfig = (new PagedList.Config.Builder())
                .setEnablePlaceholders(false)
                .setInitialLoadSizeHint(LOADING_PAGE_SIZE)
                .setPageSize(LOADING_PAGE_SIZE)
                .build();
        mNetworkState = Transformations.switchMap(dataSourceFactory.getNetworkStatus(),
                (Function<NetProductsPageKeyedDataSource, LiveData<NetworkState>>)
                        NetProductsPageKeyedDataSource::getNetworkState);
        Executor executor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);
        LivePagedListBuilder livePagedListBuilder = new LivePagedListBuilder(dataSourceFactory, pagedListConfig);
        mProductsPaged = livePagedListBuilder.
                setFetchExecutor(executor).
                build();
    }

    public LiveData<PagedList<ProductEntity>> getPagedProducts(){
        return mProductsPaged;
    }

    public LiveData<NetworkState> getNetworkState() {
        return mNetworkState;
    }

}
