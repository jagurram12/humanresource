package com.learning.springboot.humanresource.controller;

import java.util.List;

import javax.ws.rs.Consumes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springboot.humanresource.model.Employee;
import com.learning.springboot.humanresource.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeServiceImpl empService;
	
	@RequestMapping("/employee")
	public List<Employee> employeeList() {
		return empService.getEmployees();
	}
	
	@RequestMapping(value="/employee",method=RequestMethod.POST)
	@Consumes("application/json")
	public void addEmployee(@RequestBody List<Employee> empList) {
		empService.addEmployee(empList);
	}
	
	@RequestMapping(value="/employee/{id}",method=RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable Long id) {
		empService.deleteEmployee(id);
	}
}
