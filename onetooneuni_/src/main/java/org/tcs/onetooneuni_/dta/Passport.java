package org.tcs.onetooneuni_.dta;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Passport {
    @Id
	private int PID ;
	private String country;
	@OneToOne(cascade = CascadeType.ALL)
	private Aadhar aadhar ; 
	public int getPID() {
		return PID;
	}
	public void setPID(int pID) {
		PID = pID;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Aadhar getAadhar() {
		return aadhar;
	}
	public void setAadhar(Aadhar aadhar) {
		this.aadhar = aadhar;
	}
	@Override
	public String toString() {
		return "Passport [PID=" + PID + ", country=" + country + ", aadhar=" + aadhar + "]";
	}
    

}
