package com.example.springBootWebApp.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Product {
	
	@Id
	private int prodId;
	private String pname;
	private int price;
	
	public Product() {
		
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product(int prodId, String pname, int i) {
		super();
		this.prodId = prodId;
		this.pname = pname;
		this.price = i;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", pname=" + pname + ", price=" + price + "]";
	}
	
}
