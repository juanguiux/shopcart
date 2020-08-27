package com.shopcart.basket.model;

import javax.persistence.*;

@Entity
@Table(name = "customer_basket")
public class CustomerBasket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "customer_id")
    private Long customerId;

    private Long basketId;


}
