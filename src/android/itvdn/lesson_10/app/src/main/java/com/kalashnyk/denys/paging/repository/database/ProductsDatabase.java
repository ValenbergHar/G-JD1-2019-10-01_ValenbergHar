package com.kalashnyk.denys.paging.repository.database;

import android.arch.lifecycle.LiveData;
import android.arch.paging.LivePagedListBuilder;
import android.arch.paging.PagedList;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.kalashnyk.denys.paging.repository.database.dao.ProductDao;
import com.kalashnyk.denys.paging.repository.database.entities.ProductEntity;
import com.kalashnyk.denys.paging.repository.database.paging.DBProductsDataSourceFactory;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import static com.kalashnyk.denys.paging.utils.Constants.DATA_BASE_NAME;
import static com.kalashnyk.denys.paging.utils.Constants.NUMBER_OF_THREADS;

@Database(entities = {ProductEntity.class}, version = 2)
public abstract class ProductsDatabase extends RoomDatabase {

    private static ProductsDatabase instance;
    public abstract ProductDao productDao();
    private static final Object mLock = new Object();
    private LiveData<PagedList<ProductEntity>> mProductsPaged;

    public static ProductsDatabase getInstance(Context context) {
        synchronized (mLock) {
            if (instance == null) {
                instance = Room.databaseBuilder(context.getApplicationContext(),
                        ProductsDatabase.class, DATA_BASE_NAME)
                        .build();
                instance.init();

            }
            return instance;
        }
    }

    public void init() {
        PagedList.Config pagedListConfig = (new PagedList.Config.Builder())
                .setEnablePlaceholders(false)
                .setInitialLoadSizeHint(Integer.MAX_VALUE)
                .setPageSize(Integer.MAX_VALUE)
                .build();
        Executor executor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);
        DBProductsDataSourceFactory dataSourceFactory = new DBProductsDataSourceFactory(productDao());
        LivePagedListBuilder livePagedListBuilder = new LivePagedListBuilder(dataSourceFactory, pagedListConfig);
        mProductsPaged = livePagedListBuilder.setFetchExecutor(executor).build();
    }

    public LiveData<PagedList<ProductEntity>> getProducts() {
        return mProductsPaged;
    }
}
