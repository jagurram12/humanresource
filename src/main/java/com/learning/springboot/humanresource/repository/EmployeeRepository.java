package com.learning.springboot.humanresource.repository;

import org.springframework.data.repository.CrudRepository;

import com.learning.springboot.humanresource.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
