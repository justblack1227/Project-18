package org.yoursfirst.YoursRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.enums.*;

@SpringBootApplication
@SecurityScheme(name = "studyeasy-demo-api", scheme = "bearer", type = SecuritySchemeType.HTTP, in = SecuritySchemeIn.HEADER)
public class YoursRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(YoursRestApplication.class, args);
	}

}
