package com.demo.project.entity;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection ="books")
public class Book {

	@Id
	private int id;
	private String title;
	private double price;
	private String author;
	private LocalDate publishDate;
}
