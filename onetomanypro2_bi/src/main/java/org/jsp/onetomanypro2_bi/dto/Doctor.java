package org.jsp.onetomanypro2_bi.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Doctor {
	@Id
	private int id ; 
	

	private String name ; 
	private String spec ;
	private String address ;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "doctor")
	private List<Patient> patients ;

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

	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", spec=" + spec + ", address=" + address + "]";
	}

	 
}
