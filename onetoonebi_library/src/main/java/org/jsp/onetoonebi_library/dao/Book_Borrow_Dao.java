package org.jsp.onetoonebi_library.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.onetoonebi_library.dto.Book;

public class Book_Borrow_Dao {

	private EntityManagerFactory factory = null;
	private EntityManager manager = null;
	private EntityTransaction transaction = null;

	public EntityManager getEntityManager() {
		factory = Persistence.createEntityManagerFactory("dev");
		manager = factory.createEntityManager();
		return manager;

	}

	public void saveBookDetails(Book book) {
		manager = getEntityManager();
		transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(book);
		transaction.commit();
	}

	public void updateDetails(Book book) {
		manager = getEntityManager();
		transaction = manager.getTransaction();
		transaction.begin();
		manager.merge(book);
		transaction.commit();
	}

	public void findDetails(int id) {
		manager = getEntityManager();
		Book book = manager.find(Book.class, id);
		if (book != null) {
			System.out.println(book);
		} else {
			System.out.println(id + " not found");
		}
	}

	public void deleteDetails(int id) {
		manager = getEntityManager();
		Book book = manager.find(Book.class, id);
		transaction = manager.getTransaction();

		if (book != null) {
			transaction.begin();
			manager.remove(book);
			transaction.commit();
		} else {
			System.out.println("Details not found Which you want to delete");
		}
	}

	public void findAll() {
		manager = getEntityManager();
		Query query = manager.createQuery("select b from Book b");
		List<Book> list = query.getResultList();
		System.out.println(list);
	}

}
