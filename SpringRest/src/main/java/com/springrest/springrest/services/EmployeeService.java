package com.springrest.springrest.services;


import com.assignment.SpringRest.application.Employee;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.RequestBody;

public interface EmployeeService  extends MongoRepository<Employee,Long> {
	Employee getEmployees();
	Employee getEmployeeById(long id);
	Employee addEmployee( Employee employee);
	

	

}
