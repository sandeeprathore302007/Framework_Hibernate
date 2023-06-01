package org.irctc.onetoone_bi_ticket.controller;

import org.irctc.onetoone_bi_ticket.dao.Person_Ticket_Dao;
import org.irctc.onetoone_bi_ticket.dto.Person;
import org.irctc.onetoone_bi_ticket.dto.Ticket;

public class Person_Ticket_Controller {
	
	public static void main(String[] args) {
		
		Person person =  new Person();
		
		person.setName("Sandeep");
		person.setAge(21);
		person.setPnr(324541);
		person.setAddress("Kalyan");
		 
		
		
		Ticket ticket = new Ticket();
		
		ticket.setSeat(74);
		ticket.setTrain("Ranakpur Express");
		ticket.setBstation("Dadar");
	    ticket.setDstation("Nagaur");
	    ticket.setPerson(person);
	    
	    
	    person.setTicket(ticket);
	    
	    
	    Person_Ticket_Dao dao = new Person_Ticket_Dao();
	    
	    //dao.savePersonDetails(person);
	    dao.saveTicket(ticket);
		
	}

}
