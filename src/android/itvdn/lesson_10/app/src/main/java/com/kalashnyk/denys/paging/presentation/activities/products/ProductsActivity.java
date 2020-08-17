package com.kalashnyk.denys.paging.presentation.activities.products;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kalashnyk.denys.paging.R;
import com.kalashnyk.denys.paging.databinding.ProductsActivityBinding;
import com.kalashnyk.denys.paging.presentation.fragments.ProductsListFragment;

public class ProductsActivity extends AppCompatActivity {

    private ProductsActivityBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_products);

        if (mBinding.fragmentsContainer != null) {
            if (savedInstanceState != null) {
                return;
            }

            ProductsListFragment productsListFragment = new ProductsListFragment();
            productsListFragment.setArguments(getIntent().getExtras());

            getSupportFragmentManager().beginTransaction()
                    .add(mBinding.fragmentsContainer.getId(), productsListFragment).commit();

            getSupportFragmentManager().addOnBackStackChangedListener(() -> shouldDisplayHomeUp());
        }
    }

    public static Intent newInstance(Context context) {
        Intent intent = new Intent(context, ProductsActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        return intent;
    }

    public void shouldDisplayHomeUp(){
        boolean canback = getSupportFragmentManager().getBackStackEntryCount()>0;
        getSupportActionBar().setDisplayHomeAsUpEnabled(canback);
    }

    @Override
    public boolean onSupportNavigateUp() {
        getSupportFragmentManager().popBackStack();
        return true;
    }
}

