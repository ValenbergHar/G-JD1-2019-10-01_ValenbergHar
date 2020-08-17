package com.kalashnyk.denys.paging.presentation.adapters;

import android.arch.paging.PagedListAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kalashnyk.denys.paging.R;
import com.kalashnyk.denys.paging.databinding.NetworkStateItemBinding;
import com.kalashnyk.denys.paging.databinding.ProductItemBinding;
import com.kalashnyk.denys.paging.repository.database.entities.ProductEntity;
import com.kalashnyk.denys.paging.repository.database.state.NetworkState;
import com.kalashnyk.denys.paging.presentation.listeners.ItemClickListener;
import com.kalashnyk.denys.paging.presentation.items.ProductViewHolder;
import com.kalashnyk.denys.paging.presentation.items.NetworkStateItemViewHolder;

public class ProductsPageListAdapter extends PagedListAdapter<ProductEntity, RecyclerView.ViewHolder> {

    private NetworkState networkState;
    private ItemClickListener mItemClickListener;

    public ProductsPageListAdapter(ItemClickListener itemClickListener) {
        super(ProductEntity.DIFF_CALLBACK);
        this.mItemClickListener = itemClickListener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        if (viewType == R.layout.product_item) {
            ProductItemBinding itemBinding = ProductItemBinding.inflate(layoutInflater, parent, false);
            ProductViewHolder viewHolder = new ProductViewHolder(itemBinding, mItemClickListener);
            return viewHolder;
        } else if (viewType == R.layout.network_state_item) {
            View view = layoutInflater.inflate(R.layout.network_state_item, parent, false);
            NetworkStateItemBinding itemBinding = NetworkStateItemBinding.inflate(layoutInflater, parent, false);
            NetworkStateItemViewHolder viewHolder = new NetworkStateItemViewHolder(itemBinding);
            return viewHolder;
        } else {
            throw new IllegalArgumentException("unknown view type");
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (getItemViewType(position)) {
            case R.layout.product_item:
                ((ProductViewHolder) holder).bindTo(getItem(position));
                break;
            case R.layout.network_state_item:
                ((NetworkStateItemViewHolder) holder).bindView(networkState);
                break;
        }
    }

    private boolean hasExtraRow() {
        if (networkState != null && networkState != NetworkState.LOADED) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (hasExtraRow() && position == getItemCount() - 1) {
            return R.layout.network_state_item;
        } else {
            return R.layout.product_item;
        }
    }

    public void setNetworkState(NetworkState newNetworkState) {
        NetworkState previousState = this.networkState;
        boolean previousExtraRow = hasExtraRow();
        this.networkState = newNetworkState;
        boolean newExtraRow = hasExtraRow();
        if (previousExtraRow != newExtraRow) {
            if (previousExtraRow) {
                notifyItemRemoved(getItemCount());
            } else {
                notifyItemInserted(getItemCount());
            }
        } else if (newExtraRow && previousState != newNetworkState) {
            notifyItemChanged(getItemCount() - 1);
        }
    }
}
