package com.mongodb.assignment.service;

import java.util.List;

import com.mongodb.assignment.entity.Mobile;

public interface IMobileService {

	public Mobile addmobile(Mobile mobile);
	
	public Mobile updatemobile(Mobile mobile);
	
	public List<Mobile> getAllMobile();
	
	public Mobile getMobileById(int id);
	
	public void deleteById(int id);
	
	public List<Mobile> findByBrand(String brand);
}
