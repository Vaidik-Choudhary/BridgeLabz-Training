package com.vaidik.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.vaidik.dto.EmployeeRequestDTO;
import com.vaidik.dto.EmployeeResponseDTO;
import com.vaidik.entity.Department;
import com.vaidik.entity.Employee;
import com.vaidik.exception.DepartmentNotFoundException;
import com.vaidik.exception.EmployeeNotFoundException;
import com.vaidik.mapper.EmployeeMapper;
import com.vaidik.repository.DepartmentRepository;
import com.vaidik.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static final Logger logger = Logger.getLogger(EmployeeServiceImpl.class.getName());

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;
    private final DepartmentRepository departmentRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository, EmployeeMapper employeeMapper, DepartmentRepository departmentRepository) {

        this.employeeRepository = employeeRepository;
        this.employeeMapper = employeeMapper;
        this.departmentRepository = departmentRepository;
    }
    
    

    @Override
    public EmployeeResponseDTO createEmployee(EmployeeRequestDTO request) {

        logger.info("Creating employee with email: " + request.getEmail());

        Department department = departmentRepository.findById(request.getDepartmentId())
                .orElseThrow(() -> { logger.warning("Department not found with ID: " + request.getDepartmentId());
                    return new DepartmentNotFoundException("Department not found with id: "+ request.getDepartmentId());
                });

        Employee employee = employeeMapper.toEntity(request);

        employee.setDepartment(department);

        Employee savedEmployee = employeeRepository.save(employee);

        logger.info("Employee created successfully with ID: " + savedEmployee.getId());

        return employeeMapper.toResponseDTO(savedEmployee);
    }
    
    

    @Override
    public Page<EmployeeResponseDTO> getAllEmployees(Pageable pageable) {

        logger.info("Fetching employees with pagination and sorting");

        Page<EmployeeResponseDTO> employees = employeeRepository.findAll(pageable)
        										.map(employeeMapper::toResponseDTO);

        logger.info("Employees fetched successfully. Total employees: " + employees.getTotalElements());

        return employees;
    }

    
    
    @Override
    public EmployeeResponseDTO getEmployeeById(Long id) {

        logger.info("Fetching employee with ID: " + id);

        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> { logger.warning("Employee not found with ID: " + id);
                    return new EmployeeNotFoundException("Employee not found with id: " + id);
                });

        logger.info("Employee found with ID: " + id);

        return employeeMapper.toResponseDTO(employee);
    }

    
    
    @Override
    public EmployeeResponseDTO updateEmployee(Long id, EmployeeRequestDTO request) {

        logger.info("Updating employee with ID: " + id);

        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> { logger.warning("Employee not found with ID: " + id);
                    return new EmployeeNotFoundException( "Employee not found with id: " + id);
                });

        Department department = departmentRepository.findById(request.getDepartmentId())
                .orElseThrow(() -> { logger.warning("Department not found with ID: "+ request.getDepartmentId());
                    return new DepartmentNotFoundException("Department not found with id: "+ request.getDepartmentId());
                });

        employee.setName(request.getName());
        employee.setEmail(request.getEmail());
        employee.setPhone(request.getPhone());
        employee.setSalary(request.getSalary());
        employee.setDepartment(department);

        Employee updatedEmployee = employeeRepository.save(employee);

        logger.info("Employee updated successfully with ID: " + updatedEmployee.getId());

        return employeeMapper.toResponseDTO(updatedEmployee);
    }

    
    
    @Override
    public void deleteEmployee(Long id) {

        logger.info("Deleting employee with ID: " + id);

        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> { logger.warning("Employee not found with ID: " + id);
                    return new EmployeeNotFoundException("Employee not found with id: " + id);
                });

        employeeRepository.delete(employee);

        logger.info("Employee deleted successfully with ID: " + id);
    }

    
    
    @Override
    public List<EmployeeResponseDTO> getEmployeesBySalary(BigDecimal minSalary) {

        logger.info("Fetching employees with minimum salary: "+ minSalary);

        List<EmployeeResponseDTO> employees = employeeRepository.findEmployeesWithSalaryAbove(minSalary)
                                              .stream()
                                              .map(employeeMapper::toResponseDTO)
                                              .toList();

        logger.info("Salary search completed. Employees found: "+ employees.size());

        return employees;
    }
}