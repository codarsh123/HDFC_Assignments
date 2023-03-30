package com.rest.dept.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class DepartmentDto {

	private long departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
}
