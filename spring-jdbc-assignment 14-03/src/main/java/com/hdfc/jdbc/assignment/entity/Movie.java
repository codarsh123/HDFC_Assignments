package com.hdfc.jdbc.assignment.entity;

import java.sql.Date;

public class Movie {

	private String movieName;
	private int seatNo;
	private double price;
	private Date date;
	
	public Movie() {
		super();
	}
	public Movie(String movieName, int seatNo, double price, Date date) {
		super();
		this.movieName = movieName;
		this.seatNo = seatNo;
		this.price = price;
		this.date = date;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", seatNo=" + seatNo + ", price=" + price + ", date=" + date + "]";
	}
	
	
	
	
}
