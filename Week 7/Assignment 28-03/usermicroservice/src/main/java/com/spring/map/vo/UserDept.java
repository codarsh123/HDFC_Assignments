package com.spring.map.vo;

import com.spring.map.entity.User;

public class UserDept {

	private User user;
	private Department dept;
	public UserDept() {
		super();
	}
	public UserDept(User user, Department dept) {
		super();
		this.user = user;
		this.dept = dept;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
}
