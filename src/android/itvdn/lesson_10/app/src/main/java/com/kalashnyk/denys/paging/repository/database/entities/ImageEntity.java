package com.kalashnyk.denys.paging.repository.database.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;

import com.google.gson.annotations.SerializedName;
import com.kalashnyk.denys.paging.repository.database.converter.RoomConverter;

@Entity(tableName = "images")
@TypeConverters(RoomConverter.class)
public class ImageEntity {

    @PrimaryKey()
    @ColumnInfo(name = "url")
    @SerializedName("url")
    private String mUrl;

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        this.mUrl = url;
    }

}
