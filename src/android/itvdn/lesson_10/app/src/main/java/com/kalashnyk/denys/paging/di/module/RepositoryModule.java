package com.kalashnyk.denys.paging.di.module;

import com.kalashnyk.denys.paging.di.scope.RepositoryScope;
import com.kalashnyk.denys.paging.repository.AppRepository;
import com.kalashnyk.denys.paging.repository.database.ProductsDatabase;
import com.kalashnyk.denys.paging.repository.server.ServerCommunicator;

import dagger.Module;
import dagger.Provides;

@Module
public class RepositoryModule {

    @RepositoryScope
    @Provides
    AppRepository providesProductRepository(ServerCommunicator communicator, ProductsDatabase database) {
        return new AppRepository(communicator, database);
    }
}
