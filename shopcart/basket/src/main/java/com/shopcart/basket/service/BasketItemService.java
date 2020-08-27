package com.shopcart.basket.service;

import com.shopcart.basket.common.BasketItemNotFoundException;
import com.shopcart.basket.model.CustomerBasket;
import com.shopcart.basket.repository.CustomBasketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.repository.support.BasicMapId;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

@Service("basketService")
public class BasketItemService implements IBasketItemService {


    CustomBasketRepository customBasketRepository;

    @Override
    public List<CustomerBasket> findAll() {
        List<CustomerBasket> basketItemList = new ArrayList<>();
        customBasketRepository.findAll().iterator().forEachRemaining(basketItemList::add);
        return basketItemList;
    }

    @Override
    public CustomerBasket findById(UUID basketItemId) throws BasketItemNotFoundException {
        Optional<CustomerBasket> basketItemOptional = customBasketRepository.findById(BasicMapId.id("id", basketItemId));
        return basketItemOptional.orElseThrow(BasketItemNotFoundException::new);
    }

    @Override
    public CompletionStage<CustomerBasket> save(CustomerBasket basketItem) {
        return CompletableFuture.supplyAsync(() -> customBasketRepository.save(basketItem));
    }

    @Override
    public CustomerBasket update(UUID basketItemId, CustomerBasket basketItem) throws BasketItemNotFoundException {
        CustomerBasket customerBasket = findById(basketItemId);
        customerBasket.setBasketItems(basketItem.getBasketItems());
        return customBasketRepository.save(customerBasket);
    }

    @Override
    public boolean delete(UUID basketItemId) {
        boolean deleted = true;
        customBasketRepository.deleteById(BasicMapId.id("id", basketItemId));
        try {
            CustomerBasket basketItem = findById(basketItemId);
            if (basketItem != null) {
                deleted = false;
            }
        } catch (BasketItemNotFoundException e) {
            deleted = false;
            e.printStackTrace();
        }
        return deleted;
    }


}
