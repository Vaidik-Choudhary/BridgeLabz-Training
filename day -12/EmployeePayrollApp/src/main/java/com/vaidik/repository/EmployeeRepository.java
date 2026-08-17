package com.vaidik.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.vaidik.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	@Query("SELECT e FROM Employee e WHERE e.salary >= :salary")
	List<Employee> findEmployeesWithSalaryAbove(@Param("salary") BigDecimal salary);
}