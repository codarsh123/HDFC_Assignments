package com.rest.dept.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.dept.entity.Department;
@Repository
public interface DepartRepository extends JpaRepository<Department, Long> {

}
