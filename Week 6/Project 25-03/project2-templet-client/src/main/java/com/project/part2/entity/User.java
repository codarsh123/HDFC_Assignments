package com.project.part2.entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class User {
	
	private long userId;	
	private String username;
	private String password;
	private String email;
	private LocalDate dob;
	private String contact;
}
