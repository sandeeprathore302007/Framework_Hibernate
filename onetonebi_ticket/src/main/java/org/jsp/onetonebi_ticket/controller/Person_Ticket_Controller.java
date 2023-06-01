package org.jsp.onetonebi_ticket.controller;

import org.jsp.onetonebi_ticket.dao.Person_Ticket_Dao;
import org.jsp.onetonebi_ticket.dto.Person;
import org.jsp.onetonebi_ticket.dto.Ticket;

public class Person_Ticket_Controller {
	
	public static void main(String[] args) {
		
		Person person = new Person() ; 
		
	    person.setPnr(1423);
	    person.setName("Jyoti");
	    person.setAddress("khopoli");
	    
	    
		
		
		
		Ticket ticket = new  Ticket(); 
		
		
		ticket.setSeat(33);
		ticket.setBstation("LTT");
		ticket.setDstation("Siwan");
		ticket.setPerson(person);
		person.setTicket(ticket); 
		ticket.setTrain("LTT Gorakhpur");
		
		
		Person_Ticket_Dao dao  = new Person_Ticket_Dao()  ; 
		
	  //dao.saveDetails(person);
	//	dao.saveTicket(ticket);
		
	//	dao.deletePnr(123);
		//dao.findPnr(123);
		
	dao.findChart();
		
		
		
	}

}
