package com.kalashnyk.denys.paging.utils;

import com.kalashnyk.denys.paging.repository.database.entities.ProductEntity;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class Constants {
    // NETWORKING
    public static final String PRODUCTS_ARRAY_DATA_TAG = "results";
    public static final Type PRODUCT_ARRAY_LIST_CLASS_TYPE = (new ArrayList<ProductEntity>()).getClass();
    public static final String BASE_URL = "https://dev.moroz.cc";
    public static final int LOADING_PAGE_SIZE = 15;
    // DATABASE
    public static final String DATA_BASE_NAME = "Paging.db";
    public static final int NUMBER_OF_THREADS = 3;
}
