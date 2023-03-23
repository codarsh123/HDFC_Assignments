package com.demo.jackson.entity;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Laptop {

	@Min(10) @Max(999)
	private int id;
	
	@NotNull
	@NotEmpty
	@Pattern(regexp = "[A-Z][a-z]{3}",message ="invalid Brand name")
	private String brand;
	
	@Min(value = 5000)
	@Max(value = 99000)
	private double price;
}
