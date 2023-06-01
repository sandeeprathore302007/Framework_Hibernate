package org.jsp.onetoone_uni_.Controller;

//import javax.persistence.Entity;
//import javax.persistence.Table;

import org.jsp.onetoone_uni_.dao.PersonPassportDao;
import org.jsp.onetoone_uni_.dto.Passport;
import org.jsp.onetoone_uni_.dto.Person;


public class Passport_person_Dao_Controller {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Sandeep");
		person.setRid(23145);
		person.setDob("20-05-2003");
		
		Passport passport = new Passport();
		passport.setPid("23145");
		passport.setCountry("India");
		
		person.setPassport(passport);
		 
	
		
		PersonPassportDao dao = new PersonPassportDao();
		dao.savePassport(person);
	}

}
