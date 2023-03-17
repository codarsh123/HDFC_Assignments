package com.mongodb.assignment.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.mongodb.assignment.entity.Mobile;
@SpringBootTest
class MobileRestControllerTest {

	@Autowired
	RestTemplate resttemp;
	
	@Test
	//@Disabled
	void testAddmobile() {
		
		Mobile mobile =new Mobile(120, "micro-max", 3000);
		Mobile mobile1=resttemp.postForObject("http://localhost:8080/api/mobiles/add", mobile, Mobile.class);
		assertNotNull(mobile1);
	}

	@Test
	@Disabled
	void testUpdatemobile() {
		Mobile mobile =new Mobile(120, "micro-max", 3000);
//		Mobile mobile1=resttemp.postForObject("http://localhost:8080/api/mobiles/add", mobile, Mobile.class);
		//Mobile mobile1=resttemp.put(null, mobile);
		//assertNotNull(mobile1);
	}

	@Test
//	@Disabled
	void testGetAllMobile() {
		ResponseEntity<List> response =resttemp.getForEntity("http://localhost:8080/api/mobiles/getall", List.class);
		List<Mobile> mobiles=response.getBody();
		assertNotNull(mobiles);
	}

	@Test
//	@Disabled
	void testGetMobileById() {

		int id =103;
		ResponseEntity<Mobile> response= resttemp.getForEntity("http://localhost:8080/api/mobiles/get/"+id, Mobile.class);
		Mobile mobile =response.getBody();
		assertEquals(mobile.getPrice(), 4000);
		}

//	@Test
//	@Disabled
//	void testDeleteById() {
//		int id =120;
//		//Mobile mobile = resttemp.delete("http://localhost:8080/api/mobiles/delete/"+id,Mobile.class);
//		//Mobile mobile =response.getBody();
//		assertTrue(false);
//	}

}
