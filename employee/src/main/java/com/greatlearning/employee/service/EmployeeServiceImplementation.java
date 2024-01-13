package com.greatlearning.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employee.data.Employee;
import com.greatlearning.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
	private EmployeeRepository repository;
	
	@Autowired
	public EmployeeServiceImplementation(EmployeeRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return repository.findAll();
	}

	@Override
	public void addNewEmployee(Employee employee) {
		repository.save(employee);
		
	}

	@Override
	public void updateNewEmployee(Employee employee) {
		repository.save(employee);
		
	}

	@Override
	public void deleteNewEmployeeById(int empid) {
		repository.deleteById(empid);
		
	}

	@Override
	public Employee getEmployeeById(int empid) {
	
		return repository.findById(empid).orElse(null);
	}

}
