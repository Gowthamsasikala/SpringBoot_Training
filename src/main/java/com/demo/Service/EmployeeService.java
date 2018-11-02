package com.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.demo.Entities.Employee;

public interface EmployeeService {

	public List<Employee> listAll();
	public void deleteById(String EmpId);
	public Employee save(Employee emp1);
	public Employee get(String EmpName);
	public Optional<Employee> FindById(String EmpId);
	
	
	
	
	
}
