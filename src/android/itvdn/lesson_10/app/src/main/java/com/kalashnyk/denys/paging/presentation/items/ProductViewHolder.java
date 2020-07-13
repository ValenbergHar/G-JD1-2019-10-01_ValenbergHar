package com.kalashnyk.denys.paging.presentation.items;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.kalashnyk.denys.paging.databinding.ProductItemBinding;
import com.kalashnyk.denys.paging.presentation.adapters.ProductPageListViewPagerAdapter;
import com.kalashnyk.denys.paging.repository.database.entities.ProductEntity;
import com.kalashnyk.denys.paging.presentation.listeners.ItemClickListener;

public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private ProductEntity mProductEntity;
    private ItemClickListener mItemClickListener;
    private ProductItemBinding mBinding;

    public ProductViewHolder(ProductItemBinding binding, ItemClickListener itemClickListener) {
        super(binding.getRoot());
        this.mBinding = binding;
        this.mItemClickListener = itemClickListener;
        this.mBinding.getRoot().setOnClickListener(this);
    }

    public void bindTo(ProductEntity productEntity) {
        this.mProductEntity = productEntity;
        mBinding.setProductEntity(productEntity);
        setupViewPager();
    }

    private void setupViewPager() {
        mBinding.productPager.setAdapter(new ProductPageListViewPagerAdapter(this.mProductEntity.getImg(), this));
        mBinding.productPagerIndicator.attachToViewPager(mBinding.productPager);
    }

    @Override
    public void onClick(View view) {
        if (mItemClickListener != null) {
            mItemClickListener.OnItemClick(mProductEntity);
        }
    }

}
