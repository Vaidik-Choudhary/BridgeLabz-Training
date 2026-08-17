package com.vaidik.dto;

import java.math.BigDecimal;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Schema(description = "Response object containing employee details")
public class EmployeeResponseDTO {

    @Schema(description = "Unique employee ID", example = "1")
    private Long id;

    @Schema(description = "Employee's full name", example = "Vaidik Choudhary")
    private String name;

    @Schema(description = "Employee's company email address", example = "vaidik@company.com")
    private String email;

    @Schema(description = "Employee's phone number", example = "9039311323")
    private String phone;

    @Schema(description = "Employee's salary", example = "60000.00")
    private BigDecimal salary;

    @Schema(description = "ID of the department assigned to the employee", example = "1")
    private Long departmentId;
}