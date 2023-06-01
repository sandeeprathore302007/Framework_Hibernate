package org.jsp.onetoone_uni_.dao;


import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.onetoone_uni_.dto.Person;

public class PersonPassportDao {
	
	public void savePassport(Person person)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
	}

}
