package org.jsp.onetomanypro2_bi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.onetomanypro2_bi.dto.Doctor;
import org.jsp.onetomanypro2_bi.dto.Patient;
 

public class Doctor_Patient_Dao {
	
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	private EntityManager manager = factory.createEntityManager();
	private EntityTransaction transaction = manager.getTransaction();
	
	
	public void saveDoctorDetails(Doctor doctor)
	{
		transaction.begin();
		List<Patient> patients = doctor.getPatients();
		for(Patient patient : patients)
		{
			patient.setDoctor(doctor);
		}
		manager.persist(doctor);
		transaction.commit();
	}

}
