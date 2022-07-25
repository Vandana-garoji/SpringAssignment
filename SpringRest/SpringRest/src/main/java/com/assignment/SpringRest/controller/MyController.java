package com.assignment.SpringRest.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.SpringRest.application.Employee;
import com.springrest.springrest.services.EmployeeService;

@RestController
@RequestMapping("/employee")
public class MyController {
	@Autowired
	private EmployeeService employeeService;
 
  @GetMapping("/employee")
  public ResponseEntity<?> getEmployees(){
 	  return ResponseEntity.ok(this.employeeService.findAll());	
  }
 	  
  @GetMapping("{id}")
	public ResponseEntity<?> getEmployeeById(@PathVariable("id") long id)
	  {
		return ResponseEntity.ok(this.employeeService.findById(id));
	}
  
  @PostMapping("/employee")
  public ResponseEntity<?> addEmployee(@RequestBody Employee employee){
 	  Employee save=this.employeeService.save(employee);
 	  return ResponseEntity.ok(save);
 	  
 }
 }


