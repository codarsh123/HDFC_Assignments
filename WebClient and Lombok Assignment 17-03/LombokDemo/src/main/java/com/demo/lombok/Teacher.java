package com.demo.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
//@Setter
//@Getter
//@ToString
@Data
public class Teacher {

	
	private int id;
	private String subject;
	private Student student;
}
