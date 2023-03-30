package com.spring.map.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	private int sid;
	private String sname;
	@OneToOne
	private Address addr;
}
