package org.jsp.onetomany_uni.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Items {
	
	@Id
	private int id ;
	private String name ; 
	private int price ; 
	private int qty ;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", price=" + price + ", qty=" + qty + "]";
	}
	
	

}
