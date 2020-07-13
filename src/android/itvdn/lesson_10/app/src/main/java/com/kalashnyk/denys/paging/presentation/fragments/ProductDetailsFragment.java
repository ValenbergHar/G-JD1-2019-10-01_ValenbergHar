package com.kalashnyk.denys.paging.presentation.fragments;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kalashnyk.denys.paging.App;
import com.kalashnyk.denys.paging.presentation.adapters.ProductPageListViewPagerAdapter;
import com.kalashnyk.denys.paging.repository.database.entities.ProductEntity;
import com.squareup.picasso.Picasso;
import com.kalashnyk.denys.paging.R;
import com.kalashnyk.denys.paging.databinding.FragmentDetailsBinding;
import com.kalashnyk.denys.paging.domain.ProductDetailsViewModel;

import java.util.Objects;

import javax.inject.Inject;

public class ProductDetailsFragment extends Fragment implements View.OnClickListener {

    @Inject
    ProductDetailsViewModel mViewModel;

    private FragmentDetailsBinding mBinding;
    private String mTitle;
    private ProductEntity mProduct;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((App) Objects.requireNonNull(getActivity()).getApplication()).getViewModelComponent().inject(this);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_details, container, false);
        mViewModel = ViewModelProviders.of(getActivity()).get(ProductDetailsViewModel.class);
        View view = mBinding.getRoot();
        mViewModel.getProduct().observe(this, this::setupBinding);
        return view;
    }

    private void setupBinding(ProductEntity productEntity) {
        mProduct = productEntity;
        mBinding.setProductEntity(productEntity);
        mBinding.productPager.setAdapter(new ProductPageListViewPagerAdapter(productEntity.getImg(), this));
        mBinding.productPagerIndicator.attachToViewPager(mBinding.productPager);
        mTitle = productEntity.getTitle();
    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().setTitle(mTitle);
    }

    @BindingAdapter("android:src")
    public static void setImageUrl(ImageView view, String url) {
        if (url != null) {
            Picasso.get().load(url).into(view);
        }
    }

    @BindingAdapter("android:text")
    public static void setText(TextView view, Object text) {
        if (text != null) {
            view.setText(String.valueOf(text));
        }
    }

    @Override
    public void onClick(View view) {
        mViewModel.getProduct().postValue(mProduct);
        GalleryDetailsFragment galleryDetailsFragment = new GalleryDetailsFragment();
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentsContainer, galleryDetailsFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
