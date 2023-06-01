package org.jsp.onetomany_uni.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

import org.jsp.onetomany_uni.dto.Flipkart;
import org.jsp.onetomany_uni.dto.Items;

import antlr.debug.TraceAdapter;

public class Flipkart_Items_Dao {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	private EntityManager manager = factory.createEntityManager();
	private EntityTransaction transaction = manager.getTransaction();

	public void saveFlipkartUser(Flipkart flipkart) {
		transaction.begin();
		manager.persist(flipkart);
		transaction.commit();
	}

	public void updateFlipkartUser(Flipkart flipkart) {
		transaction.begin();
		manager.merge(flipkart);
		transaction.commit();
	}

	public void findDetails(int id) {
		Flipkart flipkart = manager.find(Flipkart.class, id);
		if (flipkart != null) {
			System.out.println(flipkart);
		} else {
			System.out.println(id + " not found");
		}
	}

	public void deleteDetails(int id) {
		Flipkart flipkart = manager.find(Flipkart.class, id);
		if (flipkart != null) {
			manager.remove(flipkart);
			System.out.println("Done");
		} else {
			System.out.println(id + " not found");
		}

	}

	public void findAll() {
		Query query = manager.createQuery("select f from Flipkart f");
		List<Flipkart> list = query.getResultList();
		System.out.println(list);

	}

	public void updateKart(int id, List<Items> items) {
		
		Flipkart kart = manager.find(Flipkart.class, id);
		
		
		if(kart !=null)
		{
			List<Items>items2 = kart.getItems();
		    transaction.begin();
		    items2.addAll(items);
		    kart.setItems(items2);
		    manager.merge(kart);
		    transaction.commit();
		}
		else
		{
			System.out.println(id+" is not found Login first");
		}

	}

}
