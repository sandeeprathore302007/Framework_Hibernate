package org.jsp.onetoonebi_library.contoller;

 import org.jsp.onetoonebi_library.dao.Book_Borrow_Dao;
import org.jsp.onetoonebi_library.dto.*;

import org.jsp.onetoonebi_library.dto.Borrower;

public class Book_Borrow_Contoller {
	
	public static void main(String[] args) {
		
		
		Book book = new  Book();
		
		book.setId(012373);
		book.setAuthor("George RR Martin");
		book.setPublication("Epic Fantasy Novels ");
		
		
		
		
		
		Borrower borrower = new Borrower();
		
		borrower.setId(22);
		borrower.setName("Pradeep");
		borrower.setContact(1913243);
		borrower.setAddress("Thane");
		
		book.setBorrower(borrower);
		borrower.setBook(book);
		
		Book_Borrow_Dao dao = new Book_Borrow_Dao() ; 
		
		//dao.saveBookDetails(book);
		//dao.updateDetails(book);
		//dao.findDetails(012373);
		//dao.deleteDetails(012373);
		dao.findAll();
		
		
		
	}

}
