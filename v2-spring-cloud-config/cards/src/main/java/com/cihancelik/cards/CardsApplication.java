package com.cihancelik.cards;

import com.cihancelik.cards.dto.CardsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableConfigurationProperties(value = CardsContactInfoDto.class)
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Cards Microservice REST API Documentation",
				description = "MazeBank Cards microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Cihan Celik",
						email = "cihan.celik7@gmail.com",
						url = "https://github.com/cihancelik7"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://github.com/cihancelik7"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "MazeBank Cards Microservice REST API Documentation",
				url = "https://github.com/cihancelik7"
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}

}