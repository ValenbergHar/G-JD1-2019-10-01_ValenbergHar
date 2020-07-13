package com.kalashnyk.denys.paging.repository.database.dao;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.kalashnyk.denys.paging.repository.database.entities.ProductEntity;

import java.util.List;

@Dao
public interface ProductDao {

    @Query("SELECT * FROM products")
    List<ProductEntity> getProducts();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertProduct(ProductEntity productEntity);

    @Query("DELETE FROM products")
    void deleteAllProducts();
}
