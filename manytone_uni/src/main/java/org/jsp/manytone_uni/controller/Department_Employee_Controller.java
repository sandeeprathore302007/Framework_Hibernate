package org.jsp.manytone_uni.controller;

import org.jsp.manytone_uni.dao.Department_Employee_Dao;
import org.jsp.manytone_uni.dto.Department;
import org.jsp.manytone_uni.dto.Employee;

public class Department_Employee_Controller {
	public static void main(String[] args) {
		Department department = new Department();
		
		//department.setId(101);
		department.setName("Mech");
		department.setPhno(234);
	
		
		Department department2 = new Department();
		
		
		//department2.setId(102);
		department2.setName("CSE");
		department2.setPhno(3422);
		
		
		
		Employee employee = new Employee();
		//employee.setEid(1324);
		employee.setSal(34245);
		employee.setEname("Satish");
		
		
		
		department.setEmployee(employee);
		department2.setEmployee(employee);
		
		
		Department_Employee_Dao dao = new Department_Employee_Dao();
		dao.saveDepartment(department2);
		dao.saveDepartment(department);
		
	}

}
