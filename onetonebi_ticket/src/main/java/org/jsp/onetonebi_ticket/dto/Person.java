package org.jsp.onetonebi_ticket.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Person {
	@Id
	private int pnr  ; 
	private String name ; 
	private String Address ; 
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	
	private Ticket ticket ;

	public int getPnr() {
		return pnr;
	}

	public void setPnr(int pnr) {
		this.pnr = pnr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		return "Person [pnr=" + pnr + ", name=" + name + ", Address=" + Address + ", ticket=" + ticket + "]";
	} 
	
	
	
	
	
	

}
