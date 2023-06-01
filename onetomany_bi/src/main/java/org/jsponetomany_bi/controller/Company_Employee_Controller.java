package org.jsponetomany_bi.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsponetomany_bi.dao.Company_Employee_Dao;
import org.jsponetomany_bi.dto.Company;
import org.jsponetomany_bi.dto.Employee;

public class Company_Employee_Controller {
	public static void main(String[] args) {
	Company company = new Company();
	
	company.setId(1034);
	company.setName("google");
	company.setAddress("Pune");
	company.setPhno(234522);
	
	
	Employee employee = new Employee() ; 
	
	employee.setEid(10019);
	employee.setEname("riya");
	employee.setAddress("airoli");
	employee.setMno(4444);
//	employee.setCompany(company);
	
	Employee employee2 = new Employee();
	employee2.setEid(10013);
	employee2.setEname("priya");
	employee2.setAddress("thane");
	employee2.setMno(0000);
//	employee2.setCompany(company);
	
	
	
	
	List<Employee> list = new ArrayList<Employee>();
	
	list.add(employee);
	list.add(employee2);
	
	company.setEmployees(list);
	
	Company_Employee_Dao  dao= new Company_Employee_Dao();
	
	//dao.saveCompany(company);
  dao.updateCompany(1034, list);
	
	
	}

}
