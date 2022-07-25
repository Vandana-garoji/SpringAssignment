package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.assignment.SpringRest.application.*;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	List <Employee> list;
	
	public EmployeeServiceImpl()
	{
		list =new ArrayList<>();
		
		list.add(new Employee( 1, "Ramya",30, 70000, "Retails"))	;
		list.add(new Employee( 2, "Keerthi",33, 80000, "manufacturing"))	;
		list.add(new Employee( 3, "Lily",33, 90000, "Development"))	;
		
	}
	

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return list;
	}


	@Override
	public Employee getEmployee(long id) {
		// TODO Auto-generated method stub
		Employee e=null;
		for(Employee employee:list)
		{
			if(employee.getId()==id)
			{
				e=employee;
				break;
				
			}
		}
		return e;
	}


	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		list.add(employee);
		return employee;
	}
	
	

}
