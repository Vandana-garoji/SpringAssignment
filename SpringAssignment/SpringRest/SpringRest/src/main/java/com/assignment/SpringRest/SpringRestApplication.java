package com.assignment.SpringRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;


@SpringBootApplication
@ComponentScan("module-service")
//@EnableAutoConfiguration(exclude= {DataSourceAutoConfiguration.class})
//@EnableReactiveMongoRepositories("com.assignment.SpringRest.application")
@EnableReactiveMongoRepositories("com.springrest.springrest.services.EmployeeService")


public class SpringRestApplication {

	public static void main(String[] args)
	
	{
		
		SpringApplication.run(SpringRestApplication.class, args);
		
	}

}
