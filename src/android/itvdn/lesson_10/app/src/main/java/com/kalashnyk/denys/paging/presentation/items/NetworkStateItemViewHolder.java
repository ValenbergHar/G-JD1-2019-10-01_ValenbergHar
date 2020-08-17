package com.kalashnyk.denys.paging.presentation.items;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.kalashnyk.denys.paging.databinding.NetworkStateItemBinding;
import com.kalashnyk.denys.paging.repository.database.state.NetworkState;

public class NetworkStateItemViewHolder extends RecyclerView.ViewHolder {

    private NetworkStateItemBinding mBinding;

    public NetworkStateItemViewHolder(NetworkStateItemBinding binding) {
        super(binding.getRoot());
        mBinding = binding;
    }

    public void bindView(NetworkState networkState) {
        if (networkState != null && networkState.getStatus() == NetworkState.Status.RUNNING) {
            mBinding.progressBar.setVisibility(View.VISIBLE);
        } else {
            mBinding.progressBar.setVisibility(View.GONE);
        }

        if (networkState != null && networkState.getStatus() == NetworkState.Status.FAILED) {
            mBinding.errorMsg.setVisibility(View.VISIBLE);
            mBinding.errorMsg.setText(networkState.getMsg());
        } else {
            mBinding.errorMsg.setVisibility(View.GONE);
        }
    }
}