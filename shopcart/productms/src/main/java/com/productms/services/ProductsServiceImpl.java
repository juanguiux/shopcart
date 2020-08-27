package com.productms.services;


import org.springframework.stereotype.Service;

import com.productms.model.Producto;
import com.productms.repository.ProductoRepository;

import java.util.List;

@Service
public class ProductsServiceImpl implements ProductServices {

    final
    ProductoRepository repository;

    public ProductsServiceImpl(ProductoRepository repository) {
        this.repository = repository;
    }

    public Producto save(Producto product) {
        return repository.save(product);
    }

    public List<Producto> findAll() {
        return repository.findAll();
    }

    
    public Producto findById(Long id) {
        return repository.findById(id).get();
    }

    
    public Producto update(Long id, Producto product) {
        Producto productToUpdate = findById(id);
        if (productToUpdate != null) {
            //productToUpdate.setProductStatusId(product.getProductStatusId());
            productToUpdate.setPrice(product.getPrice());
            productToUpdate.setName(product.getName());
        }
        return repository.save(productToUpdate);
    }

    
    public List<Producto> findAllWithNameLike(String name) {
        return repository.findAllByNameContains(name);
    }

    
    public List<Producto> findAllByDescriptionLike(String description) {
        return repository.findAllByDescriptionContains(description);
    }
}
