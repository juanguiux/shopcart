package com.shopcart.basket.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "BasketItem")
public class BasketItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "product_id")
    private String productId;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "unit_price")
    private BigDecimal unitPrice;
    @Column(name = "old_unit_price")
    private BigDecimal oldUnitPrice;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "picture_url")
    private String pictureUrl;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="customer_basket_id")
    private CustomerBasket customerBasket;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getOldUnitPrice() {
        return oldUnitPrice;
    }

    public void setOldUnitPrice(BigDecimal oldUnitPrice) {
        this.oldUnitPrice = oldUnitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public CustomerBasket getCustomerBasket() {
        return customerBasket;
    }

    public void setCustomerBasket(CustomerBasket customerBasket) {
        this.customerBasket = customerBasket;
    }

    @Override
    public String toString() {
        return "BasketItem{" +
                "id='" + id + '\'' +
                ", productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", unitPrice=" + unitPrice +
                ", oldUnitPrice=" + oldUnitPrice +
                ", quantity=" + quantity +
                ", pictureUrl='" + pictureUrl + '\'' +
                '}';
    }
}
