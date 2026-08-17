package com.vaidik.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import io.swagger.v3.oas.annotations.media.Schema;

@Data
@Schema(description = "Request object used to create or update a department")
public class DepartmentRequestDTO {

    @NotBlank(message = "Department name is required")
    @Size(min = 2, max = 100, message = "Department name must be between 2 and 100 characters")
    @Schema(
        description = "Name of the department",
        example = "Engineering",
        minLength = 2,
        maxLength = 100
    )
    private String name;
}