package com.kalashnyk.denys.paging;

import android.app.Application;

import com.kalashnyk.denys.paging.di.component.ApiComponent;
import com.kalashnyk.denys.paging.di.component.DaggerApiComponent;
import com.kalashnyk.denys.paging.di.component.DaggerDatabaseComponent;
import com.kalashnyk.denys.paging.di.component.DaggerRepositoryComponent;
import com.kalashnyk.denys.paging.di.component.DaggerViewModelComponent;
import com.kalashnyk.denys.paging.di.component.DatabaseComponent;
import com.kalashnyk.denys.paging.di.component.RepositoryComponent;
import com.kalashnyk.denys.paging.di.component.ViewModelComponent;
import com.kalashnyk.denys.paging.di.module.ApiModule;
import com.kalashnyk.denys.paging.di.module.DatabaseModule;
import com.kalashnyk.denys.paging.di.module.RepositoryModule;
import com.kalashnyk.denys.paging.di.module.ViewModelModule;

public class App extends Application {

    private ViewModelComponent mViewModelComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initDagger();
    }

    private void initDagger() {
        ApiComponent apiComponent = DaggerApiComponent.builder()
                .apiModule(new ApiModule())
                .build();

        DatabaseComponent databaseComponent = DaggerDatabaseComponent.builder()
                .databaseModule(new DatabaseModule(getApplicationContext()))
                .build();

        RepositoryComponent repositoryComponent = DaggerRepositoryComponent.builder()
                .apiComponent(apiComponent)
                .databaseComponent(databaseComponent)
                .repositoryModule(new RepositoryModule())
                .build();

        mViewModelComponent = DaggerViewModelComponent.builder()
                .repositoryComponent(repositoryComponent)
                .viewModelModule(new ViewModelModule(this))
                .build();
    }

    public ViewModelComponent getViewModelComponent() {
        return mViewModelComponent;
    }
}
