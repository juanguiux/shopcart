package com.shopcart.basket.service;

import com.shopcart.basket.common.BasketItemNotFoundException;
import com.shopcart.basket.model.BasketItem;
import com.shopcart.basket.model.CustomerBasket;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletionStage;

public interface IBasketItemService {
    List<CustomerBasket> findAll();

    CustomerBasket findById(UUID basketItemId) throws BasketItemNotFoundException;

    CompletionStage<CustomerBasket> save(CustomerBasket basketItem);

    CustomerBasket update(UUID basketItemId, CustomerBasket basketItem) throws BasketItemNotFoundException;

    boolean delete(UUID basketItemId);
}
