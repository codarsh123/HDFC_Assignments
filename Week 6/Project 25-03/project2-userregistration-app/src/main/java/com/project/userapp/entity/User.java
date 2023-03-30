package com.project.userapp.entity;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection ="users")
public class User {

	@Id
	private long userId;
	@NotNull
	@NotEmpty
	private String username;
	private String password;
	private String email;
	private LocalDate dob;
	private String contact;
}
