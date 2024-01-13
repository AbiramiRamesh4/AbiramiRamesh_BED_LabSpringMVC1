package com.greatlearning.employee.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.greatlearning.employee.data.Employee;
import com.greatlearning.employee.service.EmployeeService;



@Controller
public class EmployeeController {
	private EmployeeService service;
	public  EmployeeController(EmployeeService service) 
	{
		this.service = service;
		
	}
	@GetMapping("/employees")
	public String getAllEmployee(Model model) 
	{
		model.addAttribute("employee",service.getAllEmployees());
		return "employee";
	}
	
	@GetMapping("/employees")
	public String newEmployee(Model model) 
	{
		model.addAttribute("employee",service.getAllEmployees());
		return "CreateEmployee";
	}
	
	@GetMapping("/employees")
	public String editEmployee(Model model, @PathVariable("id")int empid)
	{
		Employee employee = service.getEmployeeById(empid);
		model.addAttribute("employee",employee);
		return "UpdateEmployee";
	}
	
	@PostMapping("/employees/{id}")
	public String saveNewEmployee(@ModelAttribute("employee")Employee employee, @PathVariable("id")int empid) 
	{
		Employee existingEmp= service.getEmployeeById(empid);
		existingEmp.setFirstName(employee.getFirstName());
		existingEmp.setFirstName(employee.getLastName());
		existingEmp.setFirstName(employee.getEmail());
		service.addNewEmployee(employee);
		return "redirect:/employee";
	}
	@GetMapping("/employees/delete/{id}")
	public String editEmployee( @PathVariable("id")int empid)
	{
		service.deleteNewEmployeeById(empid);
		return "redirect:/employee";
	}

}
