package com.vaidik.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(title = "Employee Payroll API",
								version = "1.0",
								description = "REST API for managing employees and departments."))
public class SwaggerConfig {
}