package com.vaidik.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vaidik.dto.EmployeeRequestDTO;
import com.vaidik.dto.EmployeeResponseDTO;
import com.vaidik.service.EmployeeService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/employees")
@Tag(name = "Employee Management", description = "APIs for managing employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // http://localhost:8080/swagger-ui/index.html
    
    
    @Operation(summary = "Create employee",description = "Creates a new employee and associates it with a department.")
    @ApiResponses({
        @ApiResponse(responseCode = "201", description = "Employee created successfully"),
        @ApiResponse(responseCode = "400", description = "Invalid employee data"),
        @ApiResponse(responseCode = "404", description = "Department not found")
    })
    @PostMapping
    public ResponseEntity<EmployeeResponseDTO> createEmployee(@Valid @RequestBody EmployeeRequestDTO request) {

        return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.createEmployee(request));
    }
    
    
    
    

    @Operation(summary = "Get all employees",description = "Returns Page. Default page size is 5 and default sorting is salary in descending order.")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Employees retrieved successfully")
    })
    @GetMapping
    public ResponseEntity<Page<EmployeeResponseDTO>> getAllEmployees(
            @PageableDefault(page = 0, size = 5, sort = "salary", direction = Sort.Direction.DESC) Pageable pageable) {

        return ResponseEntity.ok(employeeService.getAllEmployees(pageable));
    }

    
    
    
    
    @Operation(summary = "Get employee by ID",description = "Retrieves a single employee using the employee ID.")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Employee found"),
        @ApiResponse(responseCode = "404", description = "Employee not found")
    })
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeResponseDTO> getEmployeeById(@Parameter(description = "Employee ID", example = "1") @PathVariable Long id) {

        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }

    
    
    
    
    @Operation(summary = "Update employee",description = "Updates the details of an existing employee.")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Employee updated successfully"),
        @ApiResponse(responseCode = "400", description = "Invalid employee data"),
        @ApiResponse(responseCode = "404", description = "Employee or department not found")
    })
    @PutMapping("/{id}")
    public ResponseEntity<EmployeeResponseDTO> updateEmployee( @Parameter(description = "Employee ID", example = "1") @PathVariable Long id, @Valid @RequestBody EmployeeRequestDTO request) {

        return ResponseEntity.ok(employeeService.updateEmployee(id, request));
    }

    
    
    
    
    @Operation(summary = "Delete employee",description = "Deletes an employee using the employee ID.")
    @ApiResponses({
        @ApiResponse(responseCode = "204", description = "Employee deleted successfully"),
        @ApiResponse(responseCode = "404", description = "Employee not found")
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee( @Parameter(description = "Employee ID", example = "1") @PathVariable Long id) {

        employeeService.deleteEmployee(id);

        return ResponseEntity.noContent().build();
    }

    
    
    
    
    @Operation(summary = "Find employees by minimum salary", description = "Returns all employees whose salary is greater than minimum salary.")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Employees retrieved successfully"),
        @ApiResponse(responseCode = "400", description = "Invalid salary value")
    })
    @GetMapping("/salary")
    public ResponseEntity<List<EmployeeResponseDTO>> getEmployeesBySalary(@Parameter( description = "Minimum salary", example = "50000") @RequestParam BigDecimal minSalary) {

        return ResponseEntity.ok(employeeService.getEmployeesBySalary(minSalary));
    }
    
    
}