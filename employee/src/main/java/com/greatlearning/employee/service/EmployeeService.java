package com.greatlearning.employee.service;

import java.util.List;

import com.greatlearning.employee.data.Employee;

public interface EmployeeService {
	//View, Create, Delete, Update
	
	List<Employee> getAllEmployees();
	void addNewEmployee(Employee employee);
	void updateNewEmployee(Employee employee);
	void deleteNewEmployeeById(int empid);
	Employee getEmployeeById(int empid);

}
