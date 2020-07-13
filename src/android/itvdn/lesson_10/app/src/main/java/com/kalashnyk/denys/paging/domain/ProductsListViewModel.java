package com.kalashnyk.denys.paging.domain;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.paging.PagedList;
import android.support.annotation.NonNull;

import com.kalashnyk.denys.paging.repository.AppRepository;
import com.kalashnyk.denys.paging.repository.database.entities.ProductEntity;
import com.kalashnyk.denys.paging.repository.database.state.NetworkState;

public class ProductsListViewModel extends AndroidViewModel {

    private AppRepository mRepository;

    public ProductsListViewModel(@NonNull Application application, AppRepository repository) {
        super(application);
        mRepository = repository;
    }

    public LiveData<PagedList<ProductEntity>> getProducts() {
        return mRepository.getProducts();
    }

    public LiveData<NetworkState> getNetworkState() { return mRepository.getNetworkState(); }

}
