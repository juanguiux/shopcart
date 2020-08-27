package com.productms.api;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.productms.model.Producto;
import com.productms.repository.ProductoRepository;
import com.productms.services.ProductServices;

@RestController
@RequestMapping("/v1/api/productos")
public class ProductoController extends BaseController {

	 
	 final ProductServices productsService;
	 
	    public ProductoController(ProductServices productsService) {
	        this.productsService = productsService;
	    }
	 
	   @GetMapping("/{id}")
	    private CompletionStage<Producto> getProduct(@PathVariable("id") Long id) {
	        return CompletableFuture.supplyAsync(() -> productsService.findById(id));
	    }

	    @GetMapping("/description/{searchTerm}")
	    private CompletionStage<List<Producto>> getProductByDesc(@PathVariable("searchTerm") String searchTerm) {
	        return CompletableFuture.supplyAsync(() -> productsService.findAllByDescriptionLike(searchTerm));
	    }

	    @GetMapping("/name/{searchTerm}")
	    private CompletionStage<List<Producto>> getProductByName(@PathVariable("searchTerm") String searchTerm) {
	        return CompletableFuture.supplyAsync(() -> productsService.findAllWithNameLike(searchTerm));
	    }

	    @GetMapping
	    private CompletionStage<List<Producto>> getProducts() {
	        return CompletableFuture.supplyAsync(productsService::findAll);
	    }

	    @PostMapping
	    private CompletionStage<ResponseEntity<Producto>> save(@RequestBody Producto product) {
	        return CompletableFuture.supplyAsync(() -> productsService.save(product)).thenApply(createdProduct ->
	                noCache(createdProduct, HttpStatus.CREATED));
	    }

	    @PutMapping("/{id}")
	    private CompletionStage<ResponseEntity<Producto>> update(@PathVariable("id") Long id, @RequestBody Producto product) {
	        return CompletableFuture.supplyAsync(() -> productsService.update(id, product)).thenApply(createdProduct ->
	                noCache(createdProduct, HttpStatus.OK));
	    }
	 
	 

}
