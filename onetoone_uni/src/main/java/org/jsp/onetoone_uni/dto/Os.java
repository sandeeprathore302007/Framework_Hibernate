package org.jsp.onetoone_uni.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Os {
	@Id
	private int id;
	private String name ;
	private int bit ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBit() {
		return bit;
	}
	public void setBit(int bit) {
		this.bit = bit;
	}
	@Override
	public String toString() {
		return "Os [id=" + id + ", name=" + name + ", bit=" + bit + "]";
	}
	 
	
	
	
	
	

}
