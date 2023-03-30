package com.spring.map.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.spring.map.entity.Address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="Employees")
public class Employee {

	@Id
	private int eid;
	private String ename;
	private double salary;
	
	@OneToMany(mappedBy ="employee")
	private Department department;
}
