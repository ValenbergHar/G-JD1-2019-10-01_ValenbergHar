package com.kalashnyk.denys.paging.repository.server.paging;

import android.arch.lifecycle.MutableLiveData;
import android.arch.paging.PageKeyedDataSource;
import android.support.annotation.NonNull;
import android.util.Log;

import com.kalashnyk.denys.paging.repository.server.api.ProductsAPI;
import com.kalashnyk.denys.paging.repository.server.api.ProductDbApiClient;
import com.kalashnyk.denys.paging.repository.database.entities.ProductEntity;
import com.kalashnyk.denys.paging.repository.database.state.NetworkState;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import rx.subjects.ReplaySubject;

public class NetProductsPageKeyedDataSource extends PageKeyedDataSource<String, ProductEntity> {

    private static final String TAG = NetProductsPageKeyedDataSource.class.getSimpleName();
    private final ProductsAPI mProductsService;
    private final MutableLiveData mNetworkState;
    private final ReplaySubject<ProductEntity> mProductsObservable;

    NetProductsPageKeyedDataSource() {
        mProductsService = ProductDbApiClient.getClient();
        mNetworkState = new MutableLiveData();
        mProductsObservable = ReplaySubject.create();
    }

    public MutableLiveData getNetworkState() {
        return mNetworkState;
    }

    public ReplaySubject<ProductEntity> getProducts() {
        return mProductsObservable;
    }

    @Override
    public void loadInitial(@NonNull LoadInitialParams<String> params, @NonNull final LoadInitialCallback<String, ProductEntity> callback) {
        Log.i(TAG, "Loading Initial Rang, Count " + params.requestedLoadSize);

        mNetworkState.postValue(NetworkState.LOADING);
        Call<ArrayList<ProductEntity>> callBack = mProductsService.getProducts();
        callBack.enqueue(new Callback<ArrayList<ProductEntity>>() {
            @Override
            public void onResponse(Call<ArrayList<ProductEntity>> call, Response<ArrayList<ProductEntity>> response) {
                if (response.isSuccessful()) {
                    callback.onResult(response.body(), Integer.toString(1), Integer.toString(2));
                    mNetworkState.postValue(NetworkState.LOADED);
                    response.body().forEach(mProductsObservable::onNext);
                } else {
                    Log.e("API CALL", response.message());
                    mNetworkState.postValue(new NetworkState(NetworkState.Status.FAILED, response.message()));
                }
            }

            @Override
            public void onFailure(Call<ArrayList<ProductEntity>> call, Throwable t) {
                String errorMessage;
                if (t.getMessage() == null) {
                    errorMessage = "unknown error";
                } else {
                    errorMessage = t.getMessage();
                }
                mNetworkState.postValue(new NetworkState(NetworkState.Status.FAILED, errorMessage));
                callback.onResult(new ArrayList<>(), Integer.toString(1), Integer.toString(2));
            }
        });
    }



    @Override
    public void loadAfter(@NonNull LoadParams<String> params, final @NonNull LoadCallback<String, ProductEntity> callback) {
        Log.i(TAG, "Loading page " + params.key );
        mNetworkState.postValue(NetworkState.LOADING);
        final AtomicInteger page = new AtomicInteger(0);
        try {
            page.set(Integer.parseInt(params.key));
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
        Call<ArrayList<ProductEntity>> callBack = mProductsService.getProducts();
        callBack.enqueue(new Callback<ArrayList<ProductEntity>>() {
            @Override
            public void onResponse(Call<ArrayList<ProductEntity>> call, Response<ArrayList<ProductEntity>> response) {
                if (response.isSuccessful()) {
                    callback.onResult(response.body(),Integer.toString(page.get()+1));
                    mNetworkState.postValue(NetworkState.LOADED);
                    response.body().forEach(mProductsObservable::onNext);
                } else {
                    mNetworkState.postValue(new NetworkState(NetworkState.Status.FAILED, response.message()));
                    Log.e("API CALL", response.message());
                }
            }

            @Override
            public void onFailure(Call<ArrayList<ProductEntity>> call, Throwable t) {
                String errorMessage;
                if (t.getMessage() == null) {
                    errorMessage = "unknown error";
                } else {
                    errorMessage = t.getMessage();
                }
                mNetworkState.postValue(new NetworkState(NetworkState.Status.FAILED, errorMessage));
                callback.onResult(new ArrayList<>(),Integer.toString(page.get()));
            }
        });
    }


    @Override
    public void loadBefore(@NonNull LoadParams<String> params, @NonNull LoadCallback<String, ProductEntity> callback) {

    }
}
