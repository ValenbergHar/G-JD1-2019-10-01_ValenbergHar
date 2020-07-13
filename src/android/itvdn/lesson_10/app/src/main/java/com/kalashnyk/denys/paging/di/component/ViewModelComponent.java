package com.kalashnyk.denys.paging.di.component;

import com.kalashnyk.denys.paging.di.module.ViewModelModule;
import com.kalashnyk.denys.paging.di.scope.ViewModelScope;
import com.kalashnyk.denys.paging.presentation.fragments.GalleryDetailsFragment;
import com.kalashnyk.denys.paging.presentation.fragments.ProductDetailsFragment;
import com.kalashnyk.denys.paging.presentation.fragments.ProductsListFragment;

import dagger.Component;

@ViewModelScope
@Component(modules = {ViewModelModule.class}, dependencies = {RepositoryComponent.class})
public interface ViewModelComponent {

    void inject(GalleryDetailsFragment fragment);
    void inject(ProductDetailsFragment fragment);
    void inject(ProductsListFragment fragment);
}