package com.vaidik.repository;

import org.springframework.data.repository.ListCrudRepository;

import com.vaidik.entity.Employee;

public interface EmployeeRepository extends ListCrudRepository<Employee, Long> {

}