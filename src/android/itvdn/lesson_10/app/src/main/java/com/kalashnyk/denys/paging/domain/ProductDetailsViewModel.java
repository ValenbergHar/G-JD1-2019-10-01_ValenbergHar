package com.kalashnyk.denys.paging.domain;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.kalashnyk.denys.paging.repository.database.entities.ProductEntity;

public class ProductDetailsViewModel extends ViewModel {

    final private MutableLiveData mProductMutableLiveDAta;

    public ProductDetailsViewModel() {
        mProductMutableLiveDAta = new MutableLiveData<ProductEntity>();
    }

    public MutableLiveData<ProductEntity> getProduct() {
        return mProductMutableLiveDAta;
    }
}
