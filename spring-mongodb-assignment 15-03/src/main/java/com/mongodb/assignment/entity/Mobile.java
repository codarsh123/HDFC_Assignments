package com.mongodb.assignment.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "mobiles")
public class Mobile {

	@Id
	private int id;
	private String brand; 
	private double price;
	
	public Mobile(int id, String brand, double price) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
	}
	public Mobile() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
