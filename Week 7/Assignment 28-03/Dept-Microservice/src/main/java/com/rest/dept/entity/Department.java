package com.rest.dept.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter


@Entity
public class Department {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private long departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
}
