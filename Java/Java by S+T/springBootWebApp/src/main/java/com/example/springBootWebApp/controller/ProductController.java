package com.example.springBootWebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springBootWebApp.model.Product;
import com.example.springBootWebApp.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping("/products")
	public List<Product> getProducts() {
		return service.getProducts();
	}
	
	@GetMapping("/products/{prodId}")
	public Product getProductById(@PathVariable int prodId) {
		return service.getProductbyId(prodId);
	}
	
	@PostMapping("/postProducts")
	public void addProduct(@RequestBody Product prod) {
		service.addProduct(prod);
	}
	
	@PutMapping("/putProducts")
	public void updateProduct(@RequestBody Product prod) {
		service.updateProduct(prod);
	}
	
	@DeleteMapping("/deleteProducts/{prodId}")
	public void deleteProduct(@PathVariable int prodId) {
		service.deleteProduct(prodId);
	}
	
}
