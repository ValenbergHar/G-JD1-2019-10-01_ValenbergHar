package com.kalashnyk.denys.paging.di.module;

import android.app.Application;

import com.kalashnyk.denys.paging.App;
import com.kalashnyk.denys.paging.di.scope.ViewModelScope;
import com.kalashnyk.denys.paging.domain.ProductDetailsViewModel;
import com.kalashnyk.denys.paging.domain.ProductsListViewModel;
import com.kalashnyk.denys.paging.repository.AppRepository;

import dagger.Module;
import dagger.Provides;

@Module
public class ViewModelModule {

    Application mApp;

    public ViewModelModule(App app) {
        mApp = app;
    }

    @ViewModelScope
    @Provides
    ProductsListViewModel providesProductsListViewModel(AppRepository repository) {
        return new ProductsListViewModel(mApp, repository);
    }

    @ViewModelScope
    @Provides
    ProductDetailsViewModel providesDetailsViewModel() {
        return new ProductDetailsViewModel();
    }

}