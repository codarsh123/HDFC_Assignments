package com.spring.migrate.service;

import com.spring.migrate.dto.UserDTO;
import com.spring.migrate.entity.User;
import com.spring.migrate.vo.Department;
import com.spring.migrate.vo.UserDept;

public interface IUserService {

	public User addUser(UserDTO dto);
	
	public User getUserById(long uid);
	
	public  UserDept getUserByIdWithDept(long uid);
	
	public Department addDept(Department dept);
}
