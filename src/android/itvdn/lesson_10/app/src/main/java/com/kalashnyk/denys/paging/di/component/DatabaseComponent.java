package com.kalashnyk.denys.paging.di.component;

import com.kalashnyk.denys.paging.di.module.DatabaseModule;
import com.kalashnyk.denys.paging.repository.database.ProductsDatabase;

import dagger.Component;

@Component(modules = {DatabaseModule.class})
public interface DatabaseComponent {

    ProductsDatabase getProductsDatabase();

}

