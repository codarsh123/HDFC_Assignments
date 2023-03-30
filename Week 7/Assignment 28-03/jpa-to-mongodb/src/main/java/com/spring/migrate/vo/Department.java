package com.spring.migrate.vo;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class Department {

	
	private long departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
}
