package com.kalashnyk.denys.paging.repository.database.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.support.annotation.NonNull;
import android.support.v7.util.DiffUtil;

import com.google.gson.annotations.SerializedName;
import com.kalashnyk.denys.paging.repository.database.converter.RoomConverter;

import java.util.List;

@Entity(tableName = "products")
@TypeConverters(RoomConverter.class)
public class ProductEntity extends BaseObservable {

    @PrimaryKey()
    @ColumnInfo(name = "id")
    @SerializedName(value="id")
    private Integer mId;
    @ColumnInfo(name = "title")
    @SerializedName(value="title")
    private String mTitle;
    @ColumnInfo(name = "desc")
    @SerializedName(value="desc")
    private String mDesc;
    @ColumnInfo(name = "price")
    @SerializedName(value="price")
    private Integer mPrice;
    @ColumnInfo(name = "code")
    @SerializedName(value="code")
    private String mCode;
    @ColumnInfo(name = "scanned")
    @SerializedName(value="scanned")
    private Integer mScanned;
    @ColumnInfo(name = "img")
    @SerializedName(value = "img")
    private List<ImageEntity> mImg;

    public static DiffUtil.ItemCallback<ProductEntity> DIFF_CALLBACK = new DiffUtil.ItemCallback<ProductEntity>() {
        @Override
        public boolean areItemsTheSame(@NonNull ProductEntity oldItem, @NonNull ProductEntity newItem) {
            return oldItem.getId().equals(newItem.getId());
        }

        @Override
        public boolean areContentsTheSame(@NonNull ProductEntity oldItem, @NonNull ProductEntity newItem) {
            return oldItem.getId().equals(newItem.getId());
        }
    };

    @Bindable
    public Integer getId() {
        return mId;
    }

    public void setId(Integer id) {
        this.mId = id;
    }

    @Bindable
    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    @Bindable
    public String getDesc() {
        return mDesc;
    }

    public void setDesc(String desc) {
        this.mDesc = desc;
    }

    @Bindable
    public Integer getPrice() {
        return mPrice;
    }

    public void setPrice(Integer price) {
        this.mPrice = price;
    }

    @Bindable
    public String getCode() {
        return mCode;
    }

    public void setCode(String code) {
        this.mCode = code;
    }

    @Bindable
    public Integer getScanned() {
        return mScanned;
    }

    public void setScanned(Integer scanned) {
        this.mScanned = scanned;
    }

    public List<ImageEntity> getImg() {
        return mImg;
    }

    public void setImg(List<ImageEntity> img) {
        this.mImg = img;
    }
}
