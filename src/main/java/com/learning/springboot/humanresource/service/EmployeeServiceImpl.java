package com.learning.springboot.humanresource.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.springboot.humanresource.model.Employee;
import com.learning.springboot.humanresource.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl {
	@Autowired
	private EmployeeRepository empRepo;
	/*public List<Employee> empList=new ArrayList(Arrays.asList(
			new Employee(1L,"Kalyan","Gurram",10000000.20,0.2),
			new Employee(2L,"Vani","Gurram",10000000.20,0.2)));*/
	
	public List<Employee> getEmployees(){
		List<Employee> empList=new ArrayList(); 
		empRepo.findAll().forEach(t->empList.add(t));
		return empList;
	}

	public void addEmployee(List<Employee> empList2) {
		empRepo.saveAll(empList2);
	}

	public void deleteEmployee(Long id) {
		empRepo.deleteById(id);
	}
}
