package com.spring.map.service;

import com.spring.map.dto.UserDTO;
import com.spring.map.entity.User;
import com.spring.map.vo.Department;
import com.spring.map.vo.UserDept;

public interface IUserService {

	public User addUser(UserDTO dto);
	
	public User getUserById(long uid);
	
	public UserDept getUserByIdWithDept(long uid);
	
	public Department addDept(Department dept);
}
