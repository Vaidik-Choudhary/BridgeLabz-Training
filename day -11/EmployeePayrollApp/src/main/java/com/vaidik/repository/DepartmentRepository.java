package com.vaidik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaidik.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}