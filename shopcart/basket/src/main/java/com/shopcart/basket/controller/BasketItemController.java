package com.shopcart.basket.controller;

import com.shopcart.basket.common.BasketItemNotFoundException;
import com.shopcart.basket.model.BasketItem;
import com.shopcart.basket.service.IBasketItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CompletionStage;

@RestController
@RequestMapping("v1/api/basketItem")
public class BasketItemController {

    IBasketItemService basketItemService;

    @Autowired
    public void setBasketItemService(IBasketItemService basketItemService) {
        this.basketItemService = basketItemService;
    }

    @GetMapping("/{id}")
    public BasketItem findById(@PathVariable("id") Long id) throws BasketItemNotFoundException {
        return basketItemService.findById(id);
    }

    @GetMapping
    public List<BasketItem> findAll() {
        return basketItemService.findAll();
    }

    @PostMapping
    public CompletionStage<BasketItem> save(@RequestBody BasketItem basketItem) {
        return basketItemService.save(basketItem);
    }
}
