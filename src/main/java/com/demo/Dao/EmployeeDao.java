package com.demo.Dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.Entities.Employee;

public interface EmployeeDao extends JpaRepository<Employee, String> {


}
