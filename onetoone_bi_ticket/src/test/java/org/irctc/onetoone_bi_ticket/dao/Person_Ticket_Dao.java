package org.irctc.onetoone_bi_ticket.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.irctc.onetoone_bi_ticket.dto.Person;
import org.irctc.onetoone_bi_ticket.dto.Ticket;

public class Person_Ticket_Dao {
	
private	EntityManagerFactory factory = null ; 
private	EntityManager manager = null ;
private	EntityTransaction transaction = null ; 
	
	
	public EntityManager getEntityManager()
	{
		factory = Persistence.createEntityManagerFactory("dev");
		manager = factory.createEntityManager();
		return manager ;
	}
	
	public void savePersonDetails(Person person)
	{
		 manager = getEntityManager();
		 transaction = manager.getTransaction();
		 transaction.begin();
		 manager.persist(person);
		 transaction.commit();
		 
	}
	
	public void saveTicket(Ticket ticket)
	{
		 manager = getEntityManager();
		 transaction = manager.getTransaction();
		 transaction.begin();
		 manager.persist(ticket);
		 transaction.commit();
	}
}
