package com.vaidik.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Schema(description = "Response object containing department details")
public class DepartmentResponseDTO {

    @Schema(description = "Unique department ID",example = "1")
    private Long id;

    @Schema(description = "Name of the department", example = "Engineering")
    private String name;
}