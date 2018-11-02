package com.demo.restController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Entities.Employee;
import com.demo.Service.EmployeeService;

@RestController
@CrossOrigin
@RequestMapping("/Employee")
public class EmployeeController {

	@Autowired
	public EmployeeService emp;

	@GetMapping(value = "/")
	public ResponseEntity<?> listAll() {

		return (ResponseEntity<String>) emp.listAll();

	}

	@GetMapping(value = "/{EmpId}")
	public Optional<Employee> findById(@PathVariable("EmpId") String EmpId) {

		return emp.FindById(EmpId);
	}

	@DeleteMapping(value = "/{EmpId}")
	public void deleteById(@PathVariable("EmpId") String EmpId) {

		emp.deleteById(EmpId);

	}
	
	@PostMapping(value="/Employee/")
	public Employee save(@RequestBody Employee empl){
		return emp.save(empl);
	}

}
