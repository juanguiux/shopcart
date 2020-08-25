package com.shopcart.basket.service;

import com.shopcart.basket.common.BasketItemNotFoundException;
import com.shopcart.basket.model.BasketItem;
import com.shopcart.basket.repository.BasketItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

@Service("basketService")
public class BasketItemService implements IBasketItemService {


    BasketItemRepository basketItemRepository;

    @Autowired
    public void setBasketItemRepository(@Qualifier("basketItemRepository") BasketItemRepository basketItemRepository) {
        this.basketItemRepository = basketItemRepository;
    }

    @Override
    public List<BasketItem> findAll() {
        return basketItemRepository.findAll();
    }

    @Override
    public BasketItem findById(Long basketItemId) throws BasketItemNotFoundException {
        Optional<BasketItem> basketItemOptional = basketItemRepository.findById(basketItemId);
        return basketItemOptional.orElseThrow(BasketItemNotFoundException::new);
    }

    @Override
    public CompletionStage<BasketItem> save(BasketItem basketItem) {
        return CompletableFuture.supplyAsync(() -> basketItemRepository.save(basketItem));
    }

    @Override
    public BasketItem update(Long id, BasketItem basketItem) throws BasketItemNotFoundException {
        BasketItem basketItemOriginal = findById(id);
        basketItemOriginal.setQuantity(basketItem.getQuantity());
        return basketItemRepository.save(basketItemOriginal);
    }

    @Override
    public boolean delete(Long basketItemId) {
        boolean deleted = true;
        basketItemRepository.deleteById(basketItemId);
        try {
            BasketItem basketItem = findById(basketItemId);
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
