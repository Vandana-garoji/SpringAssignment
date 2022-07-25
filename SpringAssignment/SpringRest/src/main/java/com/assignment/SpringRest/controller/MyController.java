package com.assignment.SpringRest.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.SpringRest.application.Employee;
import com.springrest.springrest.services.EmployeeService;

 @RestController

 @RequestMapping("/employees")
public class MyController {
	@Autowired
	private EmployeeService employeeService;
	
	//http://localhost:8080/employees/employees/1
	@GetMapping("/employees")
	public List<Employee> getEmployees()
	{
		return this.employeeService.getEmployees();
		
	}
	
	@GetMapping("/employees/{id}")
	
	public Employee getEmployee ( @PathVariable long  id)
	{
		return this.employeeService.getEmployee(id);
		
	}
	
	@PostMapping("/employees")
	
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return this.employeeService.addEmployee(employee);
	
	}
	
	
	
}
