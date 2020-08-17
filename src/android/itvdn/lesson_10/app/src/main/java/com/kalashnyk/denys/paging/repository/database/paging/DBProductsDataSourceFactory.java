package com.kalashnyk.denys.paging.repository.database.paging;

import android.arch.paging.DataSource;

import com.kalashnyk.denys.paging.repository.database.dao.ProductDao;

public class DBProductsDataSourceFactory extends DataSource.Factory {

    private static final String TAG = DBProductsDataSourceFactory.class.getSimpleName();
    private DBProductsPageKeyedDataSource productsPageKeyedDataSource;
    public DBProductsDataSourceFactory(ProductDao dao) {
        productsPageKeyedDataSource = new DBProductsPageKeyedDataSource(dao);
    }

    @Override
    public DataSource create() {
        return productsPageKeyedDataSource;
    }

}
