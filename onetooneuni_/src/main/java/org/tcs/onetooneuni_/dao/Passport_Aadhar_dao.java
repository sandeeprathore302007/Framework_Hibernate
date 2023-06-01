package org.tcs.onetooneuni_.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.border.EtchedBorder;

import org.tcs.onetooneuni_.dta.Aadhar;
import org.tcs.onetooneuni_.dta.Passport;

public class Passport_Aadhar_dao {
	
	public void savePassport(Passport passport)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =  entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(passport);
		entityTransaction.commit();
	}
	
	public void saveAadhar(Aadhar aadhar)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =  entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(aadhar);
		entityTransaction.commit();
	}
	
	public void updatePassport(Passport passport)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.merge(passport);
		entityTransaction.commit();
	}
	
	public void updateAadhar(Aadhar aadhar)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.merge(aadhar);
		entityTransaction.commit();
	}
	
	public void findByName(String name)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Aadhar aadhar = entityManager.find(Aadhar.class, name);
		if(aadhar != null)
		{
		  System.out.println(aadhar);
		}
		
		else
		{
			System.out.println(name+" not found ");
		}
	}
	
	public void deleteByName(String name)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Aadhar aadhar = entityManager.find(Aadhar.class, name);
		if(aadhar != null)
		{
			entityTransaction.begin();
		    entityManager.remove(aadhar);
		    entityTransaction.commit();
		    
		}
		
		else
		{
			System.out.println(name+" not found ");
		}
	}

	public void findAll()
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		 
		Query query = entityManager.createQuery("select a from Aadhar a");
List<Aadhar> list	=query.getResultList();
	}

}
