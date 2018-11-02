package com.demo.Service;

import java.util.List;
import java.util.Optional;
import com.demo.Dao.EmployeeDao;
import com.demo.Entities.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	public EmployeeDao emp;

	@Override
	public List<Employee> listAll() {

		return emp.findAll();
	}

	@Override
	public void deleteById(String EmpId) {

		emp.deleteById(EmpId);

	}

	@Override
	public Employee save(Employee emp1) {

		return emp.save(emp1);
	}

	@Override
	public Employee get(String EmpName) {
		// TODO Auto-generated method stub
		return emp.getOne(EmpName);
	}

	@Override
	public Optional<Employee> FindById(String EmpId) {
		// TODO Auto-generated method stub
		return emp.findById(EmpId);
	}

}
