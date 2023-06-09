package org.jsp.onetonebi_ticket.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.onetonebi_ticket.dto.Person;
import org.jsp.onetonebi_ticket.dto.Ticket;

 

public class Person_Ticket_Dao {
	
  private EntityManagerFactory  factory = null ; 
  private EntityManager manager = null ; 
  private EntityTransaction transaction = null ; 
  
  public EntityManager getEntityManager()
  {
	   factory = Persistence.createEntityManagerFactory("dev");
	   manager = factory.createEntityManager();
	   return manager ;
  }
  
  
  public void saveDetails(Person person)
  {
	 manager  =  getEntityManager();
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
  
  
  public void updateDetails(Person person)
  {
	 manager  =  getEntityManager();
	 transaction = manager.getTransaction();
	 
	 transaction.begin();
	 manager.merge(person);
	 transaction.commit();
  }
  
  public void updateTicket(Ticket ticket)
  {
	  manager = getEntityManager();
	  
	  transaction = manager.getTransaction();
	  
	  transaction.begin();
	  manager.merge(ticket);
	  transaction.commit();
  }
  
  public void findPnr(int pnr)
  {
	  manager = getEntityManager();
	  
	Person person =   manager.find(Person.class, pnr);
	  
	  if(person != null)
		 {
			 System.out.println(person);
			 
		 }
		 else
		 {
			 System.out.println(pnr+ " not found");
		 }
  }
  
  public void deletePnr(int pnr)
  {
	  manager = getEntityManager(); 
	  
	  Person person = manager.find(Person.class, pnr);
	  
	  if(person != null)
		 {
			 manager.remove(person);
			 
		 }
		 else
		 {
			 System.out.println(pnr + " not found");
		 }
  }
  
  public void findChart()
  {
	  manager = getEntityManager();
	  
Query query =   manager.createQuery("select p from Person p ");


   List<Person> list  =  query.getResultList();
   
   System.out.println(list);
	  
	 
  }

}
