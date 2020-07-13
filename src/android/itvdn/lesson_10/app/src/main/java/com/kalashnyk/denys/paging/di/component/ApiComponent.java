package com.kalashnyk.denys.paging.di.component;

import com.kalashnyk.denys.paging.di.module.ApiModule;
import com.kalashnyk.denys.paging.di.scope.ApiScope;
import com.kalashnyk.denys.paging.repository.server.ServerCommunicator;

import dagger.Component;

@ApiScope
@Component(modules = {ApiModule.class})
public interface ApiComponent {
    ServerCommunicator getProductsCommunicator();
}
