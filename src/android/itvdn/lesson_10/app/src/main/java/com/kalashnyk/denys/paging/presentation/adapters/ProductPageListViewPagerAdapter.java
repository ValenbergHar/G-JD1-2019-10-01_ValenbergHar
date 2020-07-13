package com.kalashnyk.denys.paging.presentation.adapters;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kalashnyk.denys.paging.R;
import com.kalashnyk.denys.paging.databinding.ProductItemImageBinding;
import com.kalashnyk.denys.paging.repository.database.entities.ImageEntity;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ProductPageListViewPagerAdapter extends PagerAdapter {

    private List<ImageEntity> mImages;
    private ProductItemImageBinding mBinding;
    private View.OnClickListener mClickListener;

    public ProductPageListViewPagerAdapter(List<ImageEntity> images, View.OnClickListener listener) {
        mImages = images;
        mClickListener = listener;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater = LayoutInflater.from(container.getContext());
        mBinding = DataBindingUtil.inflate(layoutInflater, R.layout.item_product_image, container, false);
        View imageLayout = mBinding.getRoot();
        Picasso.get().load(mImages.get(position).getUrl()).into(mBinding.ivProductItemImage);
        container.addView(imageLayout, 0);
        mBinding.ivProductItemImage.setOnClickListener(mClickListener);
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
