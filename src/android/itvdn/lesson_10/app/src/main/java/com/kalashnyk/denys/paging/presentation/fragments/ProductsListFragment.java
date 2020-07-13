package com.kalashnyk.denys.paging.presentation.fragments;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kalashnyk.denys.paging.App;
import com.kalashnyk.denys.paging.R;
import com.kalashnyk.denys.paging.databinding.FragmentProductsBinding;
import com.kalashnyk.denys.paging.repository.database.entities.ProductEntity;
import com.kalashnyk.denys.paging.presentation.adapters.ProductsPageListAdapter;
import com.kalashnyk.denys.paging.presentation.listeners.ItemClickListener;
import com.kalashnyk.denys.paging.domain.ProductDetailsViewModel;
import com.kalashnyk.denys.paging.domain.ProductsListViewModel;
import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.Objects;

import javax.inject.Inject;

public class ProductsListFragment extends Fragment implements ItemClickListener {

    @Inject
    ProductsListViewModel mProductsViewModel;
    @Inject
    ProductDetailsViewModel mDetailsViewModel;

    private FragmentProductsBinding mBinding;
    private ProductsPageListAdapter mAdapter;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((App) Objects.requireNonNull(getActivity()).getApplication()).getViewModelComponent().inject(this);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_products, container, false);
        View view = mBinding.getRoot();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mBinding.productsRecyclerView.setLayoutManager(linearLayoutManager);
        mAdapter = new ProductsPageListAdapter(this);
        observersRegisters();
        return view;
    }

    private void observersRegisters() {
        mProductsViewModel.getProducts().observe(this, mAdapter::submitList);
        mProductsViewModel.getNetworkState().observe(this, networkState -> {
            mAdapter.setNetworkState(networkState);
        });
        mBinding.productsRecyclerView.setAdapter(mAdapter);
        mDetailsViewModel = ViewModelProviders.of(getActivity()).get(ProductDetailsViewModel.class);
    }

    @Override
    public void OnItemClick(ProductEntity productEntity) {
        mDetailsViewModel.getProduct().postValue(productEntity);
        if (!mDetailsViewModel.getProduct().hasActiveObservers()) {
            ProductDetailsFragment detailsFragment = new ProductDetailsFragment();
            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragmentsContainer, detailsFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().setTitle(R.string.app_name);
    }

    @BindingAdapter("android:src")
    public static void setImageUrl(ImageView view, String url) {
        if(url != null) {
            Picasso.get().load(url).into(view);
        }
    }

    @BindingAdapter("android:src")
    public static void setImageList(ImageView view, List<String> listUrl) {
        if (listUrl != null) {
            Picasso.get().load(listUrl.get(0)).into(view);
        }
    }

    @BindingAdapter("android:text")
    public static void setText(TextView view, Object text) {
        if (text != null) {
            view.setText(String.valueOf(text));
        }
    }
}
