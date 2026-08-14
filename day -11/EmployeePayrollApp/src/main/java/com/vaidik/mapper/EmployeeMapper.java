package com.vaidik.mapper;

import org.springframework.stereotype.Component;

import com.vaidik.dto.EmployeeRequestDTO;
import com.vaidik.dto.EmployeeResponseDTO;
import com.vaidik.entity.Employee;

@Component
public class EmployeeMapper {

    public Employee toEntity(EmployeeRequestDTO request) {
        Employee employee = new Employee();
        employee.setName(request.getName());
        employee.setEmail(request.getEmail());
        employee.setPhone(request.getPhone());
        employee.setSalary(request.getSalary());

        return employee;
    }

    public EmployeeResponseDTO toResponseDTO(Employee employee) {
        return new EmployeeResponseDTO(employee.getId(), employee.getName(), employee.getEmail(), employee.getPhone(), employee.getSalary(), employee.getDepartment().getId());
    }
}