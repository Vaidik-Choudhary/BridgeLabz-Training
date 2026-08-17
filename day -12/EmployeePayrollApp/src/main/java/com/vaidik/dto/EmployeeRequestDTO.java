package com.vaidik.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

import io.swagger.v3.oas.annotations.media.Schema;

@Data
@Schema(description = "Request object used to create or update an employee")
public class EmployeeRequestDTO {

	
	
    @NotBlank(message = "Name is required")
    @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters")
    @Schema(
        description = "Employee's full name",
        example = "Vaidik Choudhary",
        minLength = 2,
        maxLength = 100
    )
    private String name;

    
    
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    @Pattern(
        regexp = "^[A-Za-z0-9._%+-]+@company\\.com$",
        message = "Email must use the company domain"
    )
    @Schema(description = "Employee's company email address", example = "vaidik@company.com")
    private String email;

    
    
    @NotBlank(message = "Phone is required")
    @Size(min = 10, max = 15, message = "Phone must be between 10 and 15 characters")
    @Schema(
        description = "Employee's phone number",
        example = "9039311323",
        minLength = 10,
        maxLength = 15
    )
    private String phone;
    
    
    
    @NotNull(message = "Salary is required")
    @Positive(message = "Salary must be greater than zero")
    @Schema(description = "Employee's salary",example = "60000.00", minimum = "0")
    private BigDecimal salary;

    
    
    @NotNull(message = "Department ID is required")
    @Positive(message = "Department ID must be greater than zero")
    @Schema(description = "ID of the department assigned to the employee", example = "1", minimum = "1")
    private Long departmentId;
}