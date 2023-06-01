package org.jsp.onetoone_bi.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	@Id
	private int sid ;
	private String sname ;
	private String saddress ; 
	private String email ;
	@OneToOne(cascade = CascadeType.ALL )
	@JoinColumn
    private Scholarship scholarship ;
	
    
    public Scholarship getScholarship() {
		return scholarship;
	}
	public void setScholarship(Scholarship scholarship) {
		this.scholarship = scholarship;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
