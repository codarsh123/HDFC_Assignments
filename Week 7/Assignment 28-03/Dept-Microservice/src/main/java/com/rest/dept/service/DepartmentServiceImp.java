package com.rest.dept.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.dept.dto.DepartmentDto;
import com.rest.dept.entity.Department;
import com.rest.dept.repository.DepartRepository;
@Service
public class DepartmentServiceImp implements IDepartmentService {

	
	@Autowired
	DepartRepository repo;
	
	
	@Override
	public Department addDept(DepartmentDto deptDTO) {
		
		Department dept =new Department();

		dept.setDepartmentId(deptDTO.getDepartmentId());
		dept.setDepartmentName(deptDTO.getDepartmentName());
		dept.setDepartmentAddress(deptDTO.getDepartmentAddress());
		dept.setDepartmentCode(deptDTO.getDepartmentCode());
		return repo.save(dept);
	}


	@Override
	public Department getDeptById(long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

}
