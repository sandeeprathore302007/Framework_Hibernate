package org.jsp.manytone_uni.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Department { 
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name ; 
private long phno ; 
@ManyToOne(cascade = CascadeType.ALL)
private Employee employee;
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
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
public Employee getEmployee() {
	return employee;
}
public void setEmployee(Employee employee) {
	this.employee = employee;
}
@Override
public String toString() {
	return "Department [id=" + id + ", name=" + name + ", phno=" + phno + "]";
}


}
