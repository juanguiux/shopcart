package com.shopcart.basket.repository;

import com.shopcart.basket.model.CustomerBasket;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface CustomBasketRepository extends CassandraRepository<CustomerBasket> {
}
