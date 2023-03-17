package com.demo.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {

	
	private int Rollno;
	private String stream;
	//private Teacher teacher;
}
