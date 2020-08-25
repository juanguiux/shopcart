package com.shopcart.basket.repository;

import com.shopcart.basket.model.BasketItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("basketItemRepository")
public interface BasketItemRepository extends JpaRepository<BasketItem, Long> {
}
