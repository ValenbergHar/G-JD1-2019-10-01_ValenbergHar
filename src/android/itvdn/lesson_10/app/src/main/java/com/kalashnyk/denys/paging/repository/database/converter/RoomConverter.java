package com.kalashnyk.denys.paging.repository.database.converter;

import android.arch.persistence.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.kalashnyk.denys.paging.repository.database.entities.ImageEntity;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

public class RoomConverter {

    @TypeConverter
    public List<String> fromJson(String value) {
        Gson gson = new Gson();
        if (value == null) { return Collections.emptyList(); }
        Type listType = new TypeToken<List<String>>() {}.getType();
        return gson.fromJson(value, listType);
    }

    @TypeConverter
    public String toJson(List<String> list) {
        Gson gson = new Gson();
        return gson.toJson(list);
    }

    @TypeConverter
    public static List<ImageEntity> stringToImageEntity(String data) {
        if (data == null) {
            return null;
        }

        Type listType = new TypeToken<List<ImageEntity>>() {}.getType();
        Gson gson = new Gson();
        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public static String imageEntityToString(List<ImageEntity> object) {
        Gson gson = new Gson();
        return gson.toJson(object);
    }

}