package com.demo.resttemp.entity;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data

public class Book {

	
	private int id;
	private String title;
	private double price;
	private String author;
	private LocalDate publishDate;
}
