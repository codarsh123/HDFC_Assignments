package com.hdfc.jdbc.assignment.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.jdbc.assignment.entity.Movie;
import com.hdfc.jdbc.assignment.service.IMovieService;

@RestController
@RequestMapping("/api/jdbc")
public class MovieRestController {

	@Autowired
	IMovieService service;
	
	@PostMapping("/add")
	public String addMovie(@RequestBody Movie mov) {
	
		String msg =null;
		int count =service.addMovie(mov);
		if(count>0) {
			msg =count+" record Inserted";
		}
		else {
			msg ="Insert Failed";
		}
		return msg;
	}
	
	@GetMapping("/getall")
	public List<Movie>getAll(){
	 List<Movie> list = service.getAllMovies();
	return list;
	}
	
	@GetMapping("/get/{seatNo}")
	 public Movie getMovieBySeat(@PathVariable int seatNo) {
		 return service.selectMovieById(seatNo);
	 }
	 
	
	
}
