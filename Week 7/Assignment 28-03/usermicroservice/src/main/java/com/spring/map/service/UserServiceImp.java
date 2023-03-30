package com.spring.map.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.spring.map.dto.UserDTO;
import com.spring.map.entity.User;
import com.spring.map.repository.UserRepository;
import com.spring.map.vo.Department;
import com.spring.map.vo.UserDept;
@Service
public class UserServiceImp implements IUserService {

	@Autowired
	UserRepository repo;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public User addUser(UserDTO dto) {

		User user =new User();
		
		user.setUserId(dto.getUserId());
		user.setUserName(dto.getUserName());
		user.setEmail(dto.getEmail());
		user.setDeptId(dto.getDeptId());
		return repo.save(user);
	}

	@Override
	public User getUserById(long uid) {
		// TODO Auto-generated method stub
		return repo.findById(uid).orElse(null);
	}

	@Override
	public UserDept getUserByIdWithDept(long uid) {
		
		User user =getUserById(uid);
		long deptId =user.getDeptId();
		
		Department department =  restTemplate.getForObject("http://localhost:8282/api/v1/dept/get/"+deptId, Department.class);
		
		UserDept userDept =new UserDept(user, department);
		return userDept;
	}

	@Override
	public Department addDept(Department dept) {

		Department depart =restTemplate.postForObject("http://localhost:8282/api/v1/dept/add", dept, Department.class);
		return depart;
	}

}
