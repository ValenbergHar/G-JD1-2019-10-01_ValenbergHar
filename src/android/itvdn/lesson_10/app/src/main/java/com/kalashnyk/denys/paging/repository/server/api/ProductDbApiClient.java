package com.kalashnyk.denys.paging.repository.server.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.kalashnyk.denys.paging.utils.Constants.BASE_URL;
import static com.kalashnyk.denys.paging.utils.Constants.PRODUCT_ARRAY_LIST_CLASS_TYPE;

public class ProductDbApiClient {

    public static ProductsAPI getClient() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(PRODUCT_ARRAY_LIST_CLASS_TYPE, new ProductsJsonDeserializer())
                .create();

        Retrofit.Builder builder = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(client)
                .baseUrl(BASE_URL);

        return builder.build().create(ProductsAPI.class);
    }
}
