package com.xiaomi.gateway.route;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnounceRoutesLocator {

	@Bean
	public RouteLocator configAnnounceRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
			.route(predicateSpec -> predicateSpec
				.path("/announce/list")
				.uri("http://localhost:8080")
			).build();
	}
}
