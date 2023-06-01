package org.irctc.onetoone_bi_ticket.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Ticket {
	
	@Id
	private int seat ;
	
	private String bstation ;
	private String dstation ;
	 
	private String train ; 
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy =  "ticket")
	private Person person ;
	
	public String getBstation() {
		return bstation;
	}
	public void setBstation(String bstation) {
		this.bstation = bstation;
	}
	public String getDstation() {
		return dstation;
	}
	public void setDstation(String dstation) {
		this.dstation = dstation;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public String getTrain() {
		return train;
	}
	public void setTrain(String train) {
		this.train = train;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	} 
	
	

}
