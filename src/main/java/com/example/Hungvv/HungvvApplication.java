package com.example.Hungvv;

import com.example.Hungvv.core.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
@Import(SecurityConfig.class)
@SpringBootApplication
public class HungvvApplication {

	public static void main(String[] args) {
		SpringApplication.run(HungvvApplication.class, args);
	}

}
