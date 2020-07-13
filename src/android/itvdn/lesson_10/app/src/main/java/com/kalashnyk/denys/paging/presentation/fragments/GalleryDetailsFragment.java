package com.kalashnyk.denys.paging.presentation.fragments;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kalashnyk.denys.paging.App;
import com.kalashnyk.denys.paging.R;
import com.kalashnyk.denys.paging.databinding.GalleryFragmentBinding;
import com.kalashnyk.denys.paging.presentation.adapters.ProductDetailsGalleryViewPagerAdapter;
import com.kalashnyk.denys.paging.domain.ProductDetailsViewModel;
import com.kalashnyk.denys.paging.repository.database.entities.ProductEntity;

import java.util.Objects;

import javax.inject.Inject;

public class GalleryDetailsFragment extends Fragment {

    @Inject
    ProductDetailsViewModel mViewModel;

    private GalleryFragmentBinding mBinding;
    private String mTitle;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((App) Objects.requireNonNull(getActivity()).getApplication()).getViewModelComponent().inject(this);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_gallery, container, false);
        mViewModel = ViewModelProviders.of(getActivity()).get(ProductDetailsViewModel.class);
        View view = mBinding.getRoot();
        mViewModel.getProduct().observe(this, this::setupBinding);
        return view;
    }

    private void setupBinding(ProductEntity productEntity) {
        mBinding.pagerGalleryDetail.setAdapter(new ProductDetailsGalleryViewPagerAdapter(productEntity.getImg()));
        mBinding.pagerGalleryIndicatorDetail.attachToViewPager(mBinding.pagerGalleryDetail);
        mTitle = productEntity.getTitle();
    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().setTitle(mTitle);
    }
}
