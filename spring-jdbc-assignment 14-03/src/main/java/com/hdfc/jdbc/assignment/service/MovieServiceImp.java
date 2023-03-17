package com.hdfc.jdbc.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.jdbc.assignment.dao.IMovieDAO;
import com.hdfc.jdbc.assignment.dao.MovieDaoImp;
import com.hdfc.jdbc.assignment.entity.Movie;
@Service
public class MovieServiceImp implements IMovieService {

	@Autowired
	private IMovieDAO dao;
	
	
	@Override
	public int addMovie(Movie mov) {
		// TODO Auto-generated method stub
		return dao.addMovie(mov);
	}

	@Override
	public int updateMovie(Movie mov) {
		// TODO Auto-generated method stub
		return dao.updateMovie(mov);
	}

	@Override
	public Movie selectMovieById(int seatNo) {
		// TODO Auto-generated method stub
		return dao.selectMovieById(seatNo);
	}
	
	@Override
	public int deleteMovieById(int seatNo) {
		// TODO Auto-generated method stub
		return dao.deleteMovieById(seatNo);
	}

	@Override
	public List<Movie> getAllMovies() {
		// TODO Auto-generated method stub
		return dao.getAllMovies();
	}
	
	

}
