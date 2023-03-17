package com.mongodb.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.assignment.entity.Mobile;
import com.mongodb.assignment.reposotory.MobileReposotory;
@Service
public class MobileServiceImp implements IMobileService {

	@Autowired
	MobileReposotory repo;
	
	@Override
	public Mobile addmobile(Mobile mobile) {
		return repo.save(mobile);
	}

	@Override
	public Mobile updatemobile(Mobile mobile) {
		// TODO Auto-generated method stub
		return repo.save(mobile);
	}

	@Override
	public List<Mobile> getAllMobile() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Mobile getMobileById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public void deleteById(int id) {

		repo.deleteById(id);
		
	}

	@Override
	public List<Mobile> findByBrand(String brand) {
		// TODO Auto-generated method stub
		return repo.findByBrand(brand);
	}

}
