package com.spring.map.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.map.onetomany.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
