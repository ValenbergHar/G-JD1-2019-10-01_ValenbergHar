package com.kalashnyk.denys.paging.repository.server.api;

import com.kalashnyk.denys.paging.repository.database.entities.ProductEntity;

import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ProductsAPI {

    @GET("/api/android/itvdn_10_paging/result.json")
    Call<ArrayList<ProductEntity>> getProducts();
}
