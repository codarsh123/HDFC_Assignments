package com.spring.map.onetomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="dept")
public class Department {

	@Id
	private int id;
	private String deptname;
	
	@OneToMany(mappedBy ="department")
	private Set<Employee> employees = new HashSet<Employee>();
}
