package com.demo.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
	private String EmpId;
	private String EmpName;
	private String EmpCompany;
	private String EmpSalary;

	public String getEmpId() {
		return EmpId;
	}

	public void setEmpId(String empId) {
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public String getEmpCompany() {
		return EmpCompany;
	}

	public void setEmpCompany(String empCompany) {
		EmpCompany = empCompany;
	}

	public String getEmpSalary() {
		return EmpSalary;
	}

	public void setEmpSalary(String empSalary) {
		EmpSalary = empSalary;
	}

}
