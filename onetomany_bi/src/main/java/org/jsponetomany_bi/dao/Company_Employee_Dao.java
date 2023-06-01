package org.jsponetomany_bi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsponetomany_bi.dto.Company;
import org.jsponetomany_bi.dto.Employee;

public class Company_Employee_Dao {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	private EntityManager manager = factory.createEntityManager();
	private EntityTransaction transaction = manager.getTransaction();

	public void saveCompany(Company company) {
		transaction.begin();
		List<Employee> employees = company.getEmployees();
		for (Employee employee : employees) {
			employee.setCompany(company);
		}
		manager.persist(company);
		transaction.commit();
	}

	public void updateCompany(int id, List<Employee> employees)

	{

		transaction.begin();
		Company company = manager.find(Company.class, id);
		List<Employee> employees2 = company.getEmployees();
		employees2.addAll(employees);

		for (Employee employee : employees2) {
			employee.setCompany(company);
		}

		manager.merge(company);
		transaction.commit();

	}
}