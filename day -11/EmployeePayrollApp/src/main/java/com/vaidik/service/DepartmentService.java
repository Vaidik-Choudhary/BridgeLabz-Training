package com.vaidik.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.vaidik.dto.DepartmentRequestDTO;
import com.vaidik.dto.DepartmentResponseDTO;

public interface DepartmentService {

    DepartmentResponseDTO createDepartment(DepartmentRequestDTO request);

    Page<DepartmentResponseDTO> getAllDepartments(Pageable pageable);

    DepartmentResponseDTO getDepartmentById(Long id);

    DepartmentResponseDTO updateDepartment(Long id, DepartmentRequestDTO request);

    void deleteDepartment(Long id);
}