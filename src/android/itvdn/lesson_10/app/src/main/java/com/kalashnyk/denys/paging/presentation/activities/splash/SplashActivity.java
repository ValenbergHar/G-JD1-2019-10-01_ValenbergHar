package com.kalashnyk.denys.paging.presentation.activities.splash;

import android.databinding.DataBindingUtil;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kalashnyk.denys.paging.R;
import com.kalashnyk.denys.paging.databinding.SplashActivityBinding;
import com.kalashnyk.denys.paging.presentation.activities.products.ProductsActivity;

public class SplashActivity extends AppCompatActivity {

    private long SPLASH_TIMER = 3000L;
    private SplashActivityBinding mBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_splash);
        new Handler().postDelayed(() -> {
            startActivity(ProductsActivity.newInstance(this));
            finish();
        }, SPLASH_TIMER);
    }
}
