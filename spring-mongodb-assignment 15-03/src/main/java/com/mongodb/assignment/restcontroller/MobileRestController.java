package com.mongodb.assignment.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.assignment.entity.Mobile;
import com.mongodb.assignment.service.IMobileService;

@RestController
@RequestMapping("/api/mobiles")
public class MobileRestController {

	@Autowired
	IMobileService service;
	
	@PostMapping("/add")
	public Mobile addmobile(@RequestBody Mobile mobile) {
		return service.addmobile(mobile);
	}
	
	@PutMapping("/update")
	public Mobile updatemobile(@RequestBody Mobile mobile) {
		return service.updatemobile(mobile);
	}
	
	@GetMapping("/getall")
	public List<Mobile> getAllMobile(){
		return service.getAllMobile();
	}
	
	@GetMapping("/get/{id}")
	public Mobile getMobileById(@PathVariable int id) {
		return service.getMobileById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteById(int id) {
		service.deleteById(id);
		return new ResponseEntity<String>("Record Deleted ",HttpStatus.OK);
	}
	
	@GetMapping("/getbybrand/{brand}")
	public List<Mobile> findByBrand(@PathVariable String brand){
		return service.findByBrand(brand);
	}
}
