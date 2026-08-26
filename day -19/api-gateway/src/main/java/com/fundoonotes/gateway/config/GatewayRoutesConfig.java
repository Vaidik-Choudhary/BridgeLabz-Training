package com.fundoonotes.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayRoutesConfig {

	@Bean
	public RouteLocator routes(RouteLocatorBuilder builder) {

		return builder.routes().route("auth-service", r -> r.path("/auth/**").uri("lb://auth-service"))
				.route("notes-service", r -> r.path("/notes/**", "/tags/**").uri("lb://notes-service")).build();
	}
}
