package org.jsp.onetoonebi_Emp_Dept.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl;
import org.jsp.onetoonebi_Emp_Dept.dto.Department;
import org.jsp.onetoonebi_Emp_Dept.dto.Employee;

public class Emp_Dept_Dao {

	private EntityManagerFactory factory = null;
	private EntityManager manager = null;
	private EntityTransaction transaction = null;

	public EntityManager getEntityManager() {
		factory = Persistence.createEntityManagerFactory("dev");
		manager = factory.createEntityManager();
		return manager;
	}

	public void saveEmpDetails(Employee employee) {
		manager = getEntityManager();
		transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(employee);
		transaction.commit();
	}

	public void saveDeptDetails(Department department) {
		manager = getEntityManager();
		transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(department);
		transaction.commit();
	}

	public void findDetails(int id) {
		manager = getEntityManager();
		Employee employee = manager.find(Employee.class, id);

		if (employee != null) {
			System.out.println(employee);
		}
		else {
			System.out.println(id + " not found");

		}

	}
	
	public void updateDetails(Employee employee)
	{
	   manager =  getEntityManager();
	   transaction = manager.getTransaction();
	   transaction.begin();
	   manager.merge(employee);
	   transaction.commit();
	   
	}
	
	public void deleteRecord(int id)
	{
		manager = getEntityManager();
	Employee employee = 	manager.find(Employee.class, id);
	transaction = manager.getTransaction();
	
	if(employee != null)
	{   transaction.begin();
		manager.remove(employee);
		transaction.commit();
		System.out.println("Record Deleted");
	}
	else
	{
		System.out.println("Details not found which you want to delete");
	}
	}
	
	public void findAll()
	{
		manager = getEntityManager();
	Query query = 	manager.createQuery("select e from Employee e");
	
List<Employee> list =	query.getResultList();
System.out.println(list);
	}

}
