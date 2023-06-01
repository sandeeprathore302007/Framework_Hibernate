package org.jsp.onetoone_bi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.onetoone_bi.dto.Scholarship;
import org.jsp.onetoone_bi.dto.Student;

public class Student_Scholar_Dao {
	
	private EntityManagerFactory factory = null; 
	private EntityManager manager = null ; 
	private EntityTransaction transaction = null ; 
	
	
	public EntityManager getEntityManager()
	{ 
		factory = Persistence.createEntityManagerFactory("dev"); 
		manager = factory.createEntityManager();
		return manager; 

	}
	
	public void saveStudent (Student student)
	{
    	manager = getEntityManager();
		transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(student);
	    transaction.commit();
	}
	
	public void saveScholarShip (Scholarship  scholarship)
	{
    	manager = getEntityManager();
		transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(scholarship);
	    transaction.commit();
	}
	

}
