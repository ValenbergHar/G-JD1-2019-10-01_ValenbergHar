package com.kalashnyk.denys.paging.di.module;

import android.content.Context;

import com.kalashnyk.denys.paging.repository.database.ProductsDatabase;

import dagger.Module;
import dagger.Provides;

@Module
public class DatabaseModule {

    private Context mContext;

    public DatabaseModule(Context database) {
        mContext = database;
    }

    @Provides
    Context providesContext() {
        return mContext;
    }

    @Provides
    ProductsDatabase providesDatabase(Context context) {
        return ProductsDatabase.getInstance(context);
    }
}

