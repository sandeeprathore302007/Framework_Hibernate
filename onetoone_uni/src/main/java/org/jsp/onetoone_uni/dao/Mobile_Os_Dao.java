package org.jsp.onetoone_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
 
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.onetoone_uni.dto.Mobile;
import org.jsp.onetoone_uni.dto.Os;

 
public class Mobile_Os_Dao {
	
	public void saveMobile(Mobile mobile)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(mobile);
		entityTransaction.commit();
		
		//5 examples of all mapping 
		// project assignment passport aadhar card 
		// What is cascadeALL @OneToOne 
		
	}
	public void saveOs(Os os)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(os);
		entityTransaction.commit();
		
		
	}
	
	public void updatemobile(Mobile mobile)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.merge(mobile);
		entityTransaction.commit();
	}
	
	 
	public void findMobile(int id)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		 Mobile mobile  = entityManager.find(Mobile.class, id);
		 
		 if(mobile != null)
		 {
			 System.out.println(mobile);
			 
		 }
		 else
		 {
			 System.out.println(id+ " not found");
		 }
		
		 
	//	return mobile;
	}
	
	public void deleteById(int id)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Mobile mobile = entityManager.find(Mobile.class, id);
		if(mobile != null)
		{
			entityTransaction.begin();
			entityManager.remove(mobile);
			entityTransaction.commit();
		}
		else
		{
			System.out.println(id+" not found");
		}
	}
	
	
	public void findAllById()
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createQuery("select m from Mobile m");
		java.util.List<Mobile>  list =query.getResultList();
		System.out.println(list);
	}
}
