package edu.eci.secureapplication;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecureapplicationApplication {
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SecureapplicationApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "5000"));
        app.run(args);
	}
}
