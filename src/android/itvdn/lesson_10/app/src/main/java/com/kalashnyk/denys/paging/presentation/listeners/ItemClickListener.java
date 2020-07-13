package com.kalashnyk.denys.paging.presentation.listeners;

import com.kalashnyk.denys.paging.repository.database.entities.ProductEntity;

public interface ItemClickListener {
    void OnItemClick(ProductEntity productEntity);
}
