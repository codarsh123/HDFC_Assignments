package com.hdfc.jdbc.assignment.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hdfc.jdbc.assignment.entity.Movie;
@Repository
public class MovieDaoImp implements IMovieDAO {

	
	private Connection conn;
	
	public MovieDaoImp() {
		this.conn = DBUtil.getDBConnection();
	}
	
	
	@Override
	public int addMovie(Movie mov) {

		String insertQuery = "insert into Movie(movieName,seatNo,price,date) values(?,?,?,?)";		
		int count = 0;
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(insertQuery);
			pstmt.setString(1, mov.getMovieName());
			pstmt.setInt(2, mov.getSeatNo());
			pstmt.setDouble(3, mov.getPrice());
			pstmt.setDate(4, mov.getDate());
			
			count = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return count;
	}

	@Override
	public int updateMovie(Movie mov) {

		int count =0;
		String querry="update Movie set movieName=?,price=?,date=? where seatNo=?";
		
		
			try {
				PreparedStatement pstmt=conn.prepareStatement(querry);
				pstmt.setString(1, mov.getMovieName());
				pstmt.setDouble(2, mov.getPrice());
				pstmt.setDate(3, mov.getDate());
				pstmt.setInt(4, mov.getSeatNo());
				count=pstmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return count;
	}

	@Override
	public Movie selectMovieById(int seatNo) {
		String querry="select seatNo,movieName,price,date from movie where seatNo=?";
		Movie selectMovie=new Movie() ;
		try {
			PreparedStatement pstmt= conn.prepareStatement(querry);
			pstmt.setInt(1, seatNo);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				selectMovie.setMovieName(rs.getString("movieName"));
				selectMovie.setSeatNo(rs.getInt("seatNo"));
				selectMovie.setPrice(rs.getDouble("price"));
				selectMovie.setDate(rs.getDate("date"));			
			}
			else {
				System.out.println("Movie not Found");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return selectMovie;
	}
	
	@Override
	public int deleteMovieById(int seatNo) {

		int count=0;
		String querry="delete from movie where seatNo =?";
		try {
			PreparedStatement pstmt= conn.prepareStatement(querry);
			pstmt.setInt(1, seatNo);
			count=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
		
	}

	@Override
	public List<Movie> getAllMovies() {

		List<Movie> list =new ArrayList<Movie>();
		try {
			Statement stmt =conn.createStatement();
			String query = "select movieName,seatNo,price,date from movie";
			
			ResultSet rs =	stmt.executeQuery(query);
			while (rs.next()) {
				Movie mov =new Movie ();
				
				mov.setMovieName(rs.getString("movieName"));
				mov.setSeatNo(rs.getInt("seatNo"));
				mov.setPrice(rs.getDouble("price"));
				mov.setDate(rs.getDate("date"));
				list.add(mov);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}


	

}
