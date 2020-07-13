package com.kalashnyk.denys.paging.repository.database.paging;

import android.arch.paging.PageKeyedDataSource;
import android.support.annotation.NonNull;
import android.util.Log;

import com.kalashnyk.denys.paging.repository.database.dao.ProductDao;
import com.kalashnyk.denys.paging.repository.database.entities.ProductEntity;

import java.util.List;

public class DBProductsPageKeyedDataSource extends PageKeyedDataSource<String, ProductEntity> {

    public static final String TAG = DBProductsPageKeyedDataSource.class.getSimpleName();
    private final ProductDao mProductDao;
    public DBProductsPageKeyedDataSource(ProductDao dao) {
        mProductDao = dao;
    }

    @Override
    public void loadInitial(@NonNull LoadInitialParams<String> params, @NonNull final LoadInitialCallback<String, ProductEntity> callback) {
        Log.i(TAG, "Loading Initial Rang, Count " + params.requestedLoadSize);
        List<ProductEntity> productEntities = mProductDao.getProducts();
        if(productEntities.size() != 0) {
            callback.onResult(productEntities, "0", "1");
        }
    }

    @Override
    public void loadAfter(@NonNull LoadParams<String> params, final @NonNull LoadCallback<String, ProductEntity> callback) {
    }

    @Override
    public void loadBefore(@NonNull LoadParams<String> params, @NonNull LoadCallback<String, ProductEntity> callback) {
    }
}
