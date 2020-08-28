package com.shopcart.basket.repository;

import com.shopcart.basket.model.CustomerBasket;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

/**
 * Utility class for handling all CRUD Operations.
 * @author Ranga Reddy
 * @version 1.0
 */
public interface CustomBasketRepository extends CassandraRepository<CustomerBasket, UUID> {

}