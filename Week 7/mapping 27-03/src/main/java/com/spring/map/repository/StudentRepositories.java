package com.spring.map.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.map.entity.Student;
@Repository
public interface StudentRepositories extends  JpaRepository<Student, Integer>{

}
