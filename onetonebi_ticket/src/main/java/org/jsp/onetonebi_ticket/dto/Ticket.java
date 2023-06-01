package org.jsp.onetonebi_ticket.dto;

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
	private String dstation ; 
	private String bstation ; 
	private String Train ;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "ticket")
	private Person person;
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public String getDstation() {
		return dstation;
	}
	public void setDstation(String dstation) {
		this.dstation = dstation;
	}
	public String getBstation() {
		return bstation;
	}
	public void setBstation(String bstation) {
		this.bstation = bstation;
	}
	public String getTrain() {
		return Train;
	}
	public void setTrain(String train) {
		Train = train;
	}
	@Override
	public String toString() {
		return "Ticket [seat=" + seat + ", dstation=" + dstation + ", bstation=" + bstation + ", Train=" + Train
				 + "]";
	} 
	
	

}
