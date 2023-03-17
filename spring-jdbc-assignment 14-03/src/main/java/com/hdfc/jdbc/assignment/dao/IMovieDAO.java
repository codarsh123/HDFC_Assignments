package com.hdfc.jdbc.assignment.dao;

import java.util.List;

import com.hdfc.jdbc.assignment.entity.Movie;

public interface IMovieDAO {

	public  int   addMovie(Movie mov);
	
	public  int   updateMovie(Movie mov);
	
	public  Movie   selectMovieById(int seatNo);
	
	public  int   deleteMovieById(int seatNo);
	
	public List<Movie>  getAllMovies();
	
}
