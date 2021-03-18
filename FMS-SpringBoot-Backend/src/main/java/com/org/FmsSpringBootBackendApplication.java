package com.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan("com.org.model")
@ComponentScan("com.org.dao")
@ComponentScan("com.org.service")
@ComponentScan("com.org.controller")
@EnableSwagger2
public class FmsSpringBootBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FmsSpringBootBackendApplication.class, args);
                System.err.println("server 9092 port started");
	}
}
