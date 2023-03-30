package com.spring.map.manytomany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	int pid;
	String pname;
	double price;
}
