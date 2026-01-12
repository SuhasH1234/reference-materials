package com.example.springBootWebApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springBootWebApp.model.Product;
import com.example.springBootWebApp.repository.ProductRepository;

@Service
public class ProductService {
	
	//eg:1  for static data
//	List<Product> products= new ArrayList<>(Arrays.asList(	//static data
//			new Product(101, "Oppo", 37000),
//			new Product(102, "Iphone", 137000),
//			new Product(103, "Mi", 17000)
//			));
	
//	public List<Product> getProducts() {
//		return products;	//for static data
//	}
//
//	public Product getProductbyId(int prodId) {
//		return products.stream()
//				.filter(p -> p.getProdId() == prodId)
//				.findFirst().orElse(new Product(0, "No Item Found", 0));
//	}
//
//	public void addProduct(Product prod) {
//		products.add(prod);
//	}
//
//	public void updateProduct(Product prod) {
//		int index= 0;
//		for(int i=0;i<products.size();i++) {
//			if(products.get(i).getProdId() == prod.getProdId()) {
//				index= i;
//			}
//		}
//		products.set(index, prod);
//		
//	}
//
//	public void deleteProduct(int prodId) {
//		int index= 0;
//		for(int i=0;i<products.size();i++) {
//			if(products.get(i).getProdId() == prodId) {
//				index= i;
//			}
//		}
//		products.remove(index);		
//	}
	
	//eg:2 dynamic data using jpa
	
	@Autowired
	ProductRepository repo;
	
	public List<Product> getProducts() {
		return repo.findAll();
	}
		
	public Product getProductbyId(int prodId) {
		return repo.findById(prodId).orElse(new Product());
	}

	public void addProduct(Product prod) {
		repo.save(prod);
	}

	public void updateProduct(Product prod) {
		repo.save(prod);
		
	}

	public void deleteProduct(int prodId) {
		repo.deleteById(prodId);	
	}
}
