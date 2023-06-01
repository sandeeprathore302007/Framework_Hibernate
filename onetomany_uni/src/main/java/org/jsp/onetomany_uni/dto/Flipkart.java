package org.jsp.onetomany_uni.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Flipkart {
	@Id
	private int id ; 
	private String name ; 
	private String address ; 
	private String email ; 
	private long Cno ; 
	@OneToMany(cascade = CascadeType.ALL)
	 private List<Items>  items ;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Items> getItems() {
		return items;
	}
	public void setItems(List<Items> items) {
		this.items = items;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getCno() {
		return Cno;
	}
	public void setCno(long cno) { 
		this.Cno = cno;
	}
	 
	
	@Override
	public String toString() {
		return "Flipkart [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", Cno=" + Cno
				+ "]";
	}
	 
	
	

}
