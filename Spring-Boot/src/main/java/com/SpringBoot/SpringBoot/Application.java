package com.SpringBoot.SpringBoot;
//Create a sample spring boot application and configure H2 in memory database dependency.
//
//Configure few properties under application properties file and read there value under Main class.
//
//Create an Employee table (id, name, designation) under H2 database and inserts few sample records under that table
// at startup.
//
//Enable actuator services and play around few endpoints it exposes.
//
//Enable devtools and play around by making changes

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

	}
}
