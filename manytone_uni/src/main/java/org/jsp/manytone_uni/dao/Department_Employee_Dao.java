package org.jsp.manytone_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.manytone_uni.dto.Department;

public class Department_Employee_Dao {
	
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
  private EntityManager manager = factory.createEntityManager();
private 	EntityTransaction transaction = manager.getTransaction();

  public void  saveDepartment(Department department)
  {
	  transaction.begin();
	  manager.persist(department);
	  transaction.commit();
  }
	
	
	
}
