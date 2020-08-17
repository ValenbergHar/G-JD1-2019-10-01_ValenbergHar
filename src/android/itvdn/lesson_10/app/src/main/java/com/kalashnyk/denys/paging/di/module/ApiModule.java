package com.kalashnyk.denys.paging.di.module;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kalashnyk.denys.paging.di.scope.ApiScope;
import com.kalashnyk.denys.paging.repository.server.ServerCommunicator;
import com.kalashnyk.denys.paging.repository.server.api.ProductsAPI;
import com.kalashnyk.denys.paging.repository.server.api.ProductsJsonDeserializer;
import com.kalashnyk.denys.paging.repository.server.paging.NetProductsDataSourceFactory;
import com.kalashnyk.denys.paging.utils.Constants;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.kalashnyk.denys.paging.utils.Constants.PRODUCT_ARRAY_LIST_CLASS_TYPE;

@Module
public class ApiModule {

    private static final String API_URL = Constants.BASE_URL;

    @Provides
    @ApiScope
    public ServerCommunicator provideProductsCommunicator(NetProductsDataSourceFactory dataSourceFactory) {
        return new ServerCommunicator(dataSourceFactory);
    }

    @Provides
    @ApiScope
    public NetProductsDataSourceFactory provideDataSourceFactory() {
        return new NetProductsDataSourceFactory();
    }

    @Provides
    @ApiScope
    public ProductsAPI provideApiService(Retrofit retrofit) {
        return retrofit.create(ProductsAPI.class);
    }

    @Provides
    @ApiScope
    public Retrofit provideRetrofit(Retrofit.Builder builder) {
        return builder.baseUrl(API_URL).build();
    }

    @Provides
    @ApiScope
    public Retrofit.Builder provideRetrofitBuilder() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(PRODUCT_ARRAY_LIST_CLASS_TYPE, new ProductsJsonDeserializer())
                .create();

        Retrofit.Builder builder = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(client)
                .baseUrl(API_URL);

        return builder;
    }

}
