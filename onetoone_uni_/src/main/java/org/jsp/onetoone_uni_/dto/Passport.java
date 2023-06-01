package org.jsp.onetoone_uni_.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table
public class Passport {
	@Id
	 private String pid ;
	private String country;
	
	
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	 
	 
	
	
	
	
	
	

}
