package com.productms.services;

import java.util.List;

import com.productms.model.Producto;



public interface ProductServices {
    Producto save(Producto product);

    List<Producto> findAll();

    List<Producto> findAllWithNameLike(String name);
    
    List<Producto> findAllByDescriptionLike(String name);

    Producto findById(Long id);

    Producto update(Long id, Producto product);


}
