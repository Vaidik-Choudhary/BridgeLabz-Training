package com.vaidik.service;

import java.util.logging.Logger;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.vaidik.dto.DepartmentRequestDTO;
import com.vaidik.dto.DepartmentResponseDTO;
import com.vaidik.entity.Department;
import com.vaidik.exception.DepartmentNotFoundException;
import com.vaidik.mapper.DepartmentMapper;
import com.vaidik.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private static final Logger logger = Logger.getLogger(DepartmentServiceImpl.class.getName());

    private final DepartmentRepository departmentRepository;
    private final DepartmentMapper departmentMapper;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository, DepartmentMapper departmentMapper) {

        this.departmentRepository = departmentRepository;
        this.departmentMapper = departmentMapper;
    }

    
    
    @Override
    public DepartmentResponseDTO createDepartment( DepartmentRequestDTO request) {

        logger.info("Creating department with name: " + request.getName());

        Department department = departmentMapper.toEntity(request);

        Department savedDepartment = departmentRepository.save(department);

        logger.info( "Department created successfully with ID: " + savedDepartment.getId());

        return departmentMapper.toResponseDTO(savedDepartment);
    }

    
    
    @Override
    public Page<DepartmentResponseDTO> getAllDepartments(Pageable pageable) {

        logger.info("Fetching departments with pagination and sorting");

        Page<DepartmentResponseDTO> departments = departmentRepository.findAll(pageable)
        											.map(departmentMapper::toResponseDTO);

        logger.info("Departments fetched successfully. Total departments: " + departments.getTotalElements());

        return departments;
    }

    
    
    @Override
    public DepartmentResponseDTO getDepartmentById(Long id) {

        logger.info("Fetching department with ID: " + id);

        Department department = departmentRepository.findById(id)
                .orElseThrow(() -> { logger.warning("Department not found with ID: " + id);
                    return new DepartmentNotFoundException("Department not found with id: " + id);
                });

        logger.info("Department found with ID: " + id);

        return departmentMapper.toResponseDTO(department);
    }

    
    
    @Override
    public DepartmentResponseDTO updateDepartment(Long id, DepartmentRequestDTO request) {

        logger.info("Updating department with ID: " + id);

        Department department = departmentRepository.findById(id)
                .orElseThrow(() -> { logger.warning("Department not found with ID: " + id);
                    return new DepartmentNotFoundException("Department not found with id: " + id);
                });

        department.setName(request.getName());

        Department updatedDepartment = departmentRepository.save(department);

        logger.info( "Department updated successfully with ID: " + updatedDepartment.getId());

        return departmentMapper.toResponseDTO(updatedDepartment);
    }

    
    
    @Override
    public void deleteDepartment(Long id) {

        logger.info("Deleting department with ID: " + id);

        Department department = departmentRepository.findById(id)
                .orElseThrow(() -> {logger.warning("Department not found with ID: " + id);
                    return new DepartmentNotFoundException("Department not found with id: " + id);
                });

        departmentRepository.delete(department);

        logger.info( "Department deleted successfully with ID: " + id);
    }
}