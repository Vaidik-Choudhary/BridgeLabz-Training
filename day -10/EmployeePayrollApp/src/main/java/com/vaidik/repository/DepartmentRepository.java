package com.vaidik.repository;

import org.springframework.data.repository.ListCrudRepository;

import com.vaidik.entity.Department;

public interface DepartmentRepository extends ListCrudRepository<Department, Long> {

}