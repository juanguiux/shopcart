package com.shopcart.basket.service;

import com.shopcart.basket.common.BasketItemNotFoundException;
import com.shopcart.basket.model.BasketItem;

import java.util.List;
import java.util.concurrent.CompletionStage;

public interface IBasketItemService {
    List<BasketItem> findAll();

    BasketItem findById(Long basketItemId) throws BasketItemNotFoundException;

    CompletionStage<BasketItem> save(BasketItem basketItem);

    BasketItem update(Long id, BasketItem basketItem) throws BasketItemNotFoundException;

    boolean delete(Long basketItemId);
}
