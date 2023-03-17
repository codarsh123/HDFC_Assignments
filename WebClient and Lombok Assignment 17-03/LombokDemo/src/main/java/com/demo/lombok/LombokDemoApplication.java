package com.demo.lombok;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LombokDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokDemoApplication.class, args);
		
		for(int i=1;i<=10;i++) {
			Student st=new Student(i, "Science");
			Teacher t1 = new Teacher(132, "Maths",st);
			System.out.println(t1);
		}
		
//		Student std =new Student(1, "aron");
//		Teacher t1 = new Teacher(132, "Maths",std);
//		System.out.println(t1);
		
		
		


	}

}
