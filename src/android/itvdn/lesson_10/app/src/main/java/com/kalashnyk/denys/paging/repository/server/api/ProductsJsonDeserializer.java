package com.kalashnyk.denys.paging.repository.server.api;

import android.util.Log;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.kalashnyk.denys.paging.utils.Constants;
import com.kalashnyk.denys.paging.repository.database.entities.ProductEntity;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class ProductsJsonDeserializer implements JsonDeserializer {

    private static String TAG = ProductsJsonDeserializer.class.getSimpleName();

    @Override
    public Object deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        ArrayList<ProductEntity> productEntities = null;
        try {
            JsonObject jsonObject = json.getAsJsonObject();
            JsonArray productsJsonArray = jsonObject.getAsJsonArray(Constants.PRODUCTS_ARRAY_DATA_TAG);
            productEntities = new ArrayList<>(productsJsonArray.size());
            for (int i = 0; i < productsJsonArray.size(); i++) {
                ProductEntity dematerialized = context.deserialize(productsJsonArray.get(i), ProductEntity.class);
                productEntities.add(dematerialized);
            }
        } catch (JsonParseException e) {
            Log.e(TAG, String.format("Could not deserialize ProductEntity element: %s", json.toString()));
        }
        return productEntities;
    }
}
