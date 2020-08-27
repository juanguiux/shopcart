package com.productms.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productms.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{

	 List<Producto> findAllByNameContains(String name);
	List<Producto> findAllByDescriptionContains(String description);
}
