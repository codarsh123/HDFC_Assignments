package com.rest.dept.service;

import com.rest.dept.dto.DepartmentDto;
import com.rest.dept.entity.Department;

public interface IDepartmentService {

	public Department addDept(DepartmentDto dept);
	
	public Department getDeptById(long id);
}
