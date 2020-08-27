package com.shopcart.basket.model;

import org.springframework.cassandra.core.Ordering;
import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.mapping.Table;

import java.math.BigDecimal;
import java.util.UUID;

@Table
public class BasketItem {
    @PrimaryKeyColumn(name = "id", ordinal = 0, type = PrimaryKeyType.CLUSTERED, ordering = Ordering.DESCENDING)
    private UUID id;
    @Column
    private String productId;
    @Column
    private String productName;
    @Column
    private BigDecimal unitPrice;
    @Column
    private BigDecimal oldUnitPrice;
    @Column
    private int quantity;
    @Column
    private String pictureUrl;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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

    @Override
    public String toString() {
        return "BasketItem{" +
                "id=" + id +
                ", productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", unitPrice=" + unitPrice +
                ", oldUnitPrice=" + oldUnitPrice +
                ", quantity=" + quantity +
                ", pictureUrl='" + pictureUrl + '\'' +
                '}';
    }
}
