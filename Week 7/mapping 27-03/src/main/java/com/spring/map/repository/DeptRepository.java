package com.spring.map.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.map.onetomany.Department;

public interface DeptRepository extends JpaRepository<Department,Integer> {

}
