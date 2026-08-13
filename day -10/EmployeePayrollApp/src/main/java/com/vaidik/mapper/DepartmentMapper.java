package com.vaidik.mapper;

import org.springframework.stereotype.Component;

import com.vaidik.dto.DepartmentRequestDTO;
import com.vaidik.dto.DepartmentResponseDTO;
import com.vaidik.entity.Department;

@Component
public class DepartmentMapper {

    public Department toEntity(DepartmentRequestDTO request) {
        Department department = new Department();
        department.setName(request.getName());
        return department;
    }

    public DepartmentResponseDTO toResponseDTO(Department department) {
        return new DepartmentResponseDTO(department.getId(), department.getName());
    }
}