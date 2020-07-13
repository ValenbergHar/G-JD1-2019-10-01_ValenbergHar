package com.kalashnyk.denys.paging.di.component;

import com.kalashnyk.denys.paging.di.module.RepositoryModule;
import com.kalashnyk.denys.paging.di.scope.RepositoryScope;
import com.kalashnyk.denys.paging.repository.AppRepository;

import dagger.Component;

@RepositoryScope
@Component(modules = {RepositoryModule.class}, dependencies = {ApiComponent.class, DatabaseComponent.class})
public interface RepositoryComponent {

    AppRepository getProductsRepository();
}

