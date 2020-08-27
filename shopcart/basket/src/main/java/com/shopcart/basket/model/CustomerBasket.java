package com.shopcart.basket.model;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "customer_basket")
public class CustomerBasket {
    @Id
    private String customerId;

    @OneToMany(mappedBy = "customerBasket")
    private List<BasketItem> basketItemList;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public List<BasketItem> getBasketItemList() {
        return basketItemList;
    }

    public void setBasketItemList(List<BasketItem> basketItemList) {
        this.basketItemList = basketItemList;
    }
}
