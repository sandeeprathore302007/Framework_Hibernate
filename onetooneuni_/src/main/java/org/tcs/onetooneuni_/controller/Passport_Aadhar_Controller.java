package org.tcs.onetooneuni_.controller;

import org.tcs.onetooneuni_.dao.Passport_Aadhar_dao;
import org.tcs.onetooneuni_.dta.Aadhar;
import org.tcs.onetooneuni_.dta.Passport;

public class Passport_Aadhar_Controller {
	
	
	public static void main(String[] args) {
		Passport passport = new  Passport();
		
		passport.setPID(323242223);
		passport.setCountry("India");
		
		Aadhar aadhar = new Aadhar();
		
		aadhar.setAno(9723243);
		aadhar.setName("Sandeep");
		aadhar.setAddress("thane");
		aadhar.setAge("22");
		passport.setAadhar(aadhar);
		
		Passport_Aadhar_dao dao = new Passport_Aadhar_dao();
		
		
		//dao.savePassport(passport);
		
		//dao.updateAadhar(aadhar);
		//dao.updatePassport(passport);
	//	dao.deleteByName("sandeep");
		dao.findAll();
		
	}

}
