package com.kalashnyk.denys.paging.presentation.adapters;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kalashnyk.denys.paging.R;
import com.kalashnyk.denys.paging.databinding.ProductItemGalleryImageBinding;
import com.kalashnyk.denys.paging.repository.database.entities.ImageEntity;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ProductDetailsGalleryViewPagerAdapter extends PagerAdapter {

    private List<ImageEntity> mImages;
    private ProductItemGalleryImageBinding mBinding;

    public ProductDetailsGalleryViewPagerAdapter(List<ImageEntity> img) {
        mImages = img;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater = LayoutInflater.from(container.getContext());
        mBinding = DataBindingUtil.inflate(layoutInflater, R.layout.item_product_gallery_image, container, false);
        View imageLayout = mBinding.getRoot();
        Picasso.get().load(mImages.get(position).getUrl()).into(mBinding.ivGalleryImage);
        container.addView(imageLayout, 0);
        return imageLayout;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup collection, int position, @NonNull Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() { return mImages.size(); }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) { return view == object; }
}
