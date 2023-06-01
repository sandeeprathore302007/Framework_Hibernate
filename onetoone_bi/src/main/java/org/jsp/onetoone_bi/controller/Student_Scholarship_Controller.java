package org.jsp.onetoone_bi.controller;

import org.jsp.onetoone_bi.dto.Scholarship;
import org.jsp.onetoone_bi.dto.Student;
import org.jsp.onetoone_bi.dao.*;

public class Student_Scholarship_Controller {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.setSid(45);
		student.setSname("Mandar");
		student.setEmail("mandarsase@gmail.com");
		student.setSaddress("Kalyan");
		
		Scholarship scholarship = new Scholarship();
	    scholarship.setId(33);
	    scholarship.setName("MCET");
	    scholarship.setAmount(14000);
	    scholarship.setStudent(student); 
	       
	   // student.setScholarship(scholarship);
	    
	    Student_Scholar_Dao dao = new Student_Scholar_Dao();
	    
	 //   dao.saveStudent(student);
	    dao.saveScholarShip(scholarship);
	    
	    
	    
	}

}
