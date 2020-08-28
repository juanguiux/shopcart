package com.shopcart.basket.model;



import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Table
public class CustomerBasket {

    @PrimaryKeyColumn(name = "id", ordinal = 0, type = PrimaryKeyType.CLUSTERED, ordering = Ordering.DESCENDING)
    private UUID id;

    @PrimaryKeyColumn(name = "customer_id", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
    private Long customerId;

    @Column
    private Set<UUID> basketItems = new HashSet<>();

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Set<UUID> getBasketItems() {
        return basketItems;
    }

    public void setBasketItems(Set<UUID> basketItems) {
        this.basketItems = basketItems;
    }

    @Override
    public String toString() {
        return "CustomerBasket{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", basketItems=" + basketItems +
                '}';
    }
}
