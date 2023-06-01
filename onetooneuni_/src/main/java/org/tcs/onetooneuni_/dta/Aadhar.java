package org.tcs.onetooneuni_.dta;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Aadhar {
	
	@Id
	private long Ano;
	private String name ; 
	private String age ; 
	private String Address ; 
	 
	 
	public long getAno() {
		return Ano;
	}
	public void setAno(long ano) {
		Ano = ano;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Aadhar [Ano=" + Ano + ", name=" + name + ", age=" + age + ", Address=" + Address + "]";
	}
	
	 
	
	
	

}
