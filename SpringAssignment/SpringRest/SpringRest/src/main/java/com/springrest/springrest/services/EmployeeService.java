package com.springrest.springrest.services;

import java.util.List;

import com.assignment.SpringRest.application.Employee;

public interface EmployeeService {
	public List<Employee> getEmployees();

	public Employee getEmployee(long id);

	public Employee addEmployee(Employee employee);
	
	

}
