package org.jsp.onetomany_uni.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.jsp.onetomany_uni.dto.Flipkart;
import org.jsp.onetomany_uni.dto.Items;

public class Flipkart_Items_Controller {
	
	public static void main(String[] args) {
		Flipkart flipkart = new Flipkart();
		flipkart.setId(1);
		flipkart.setName("Dean");
		flipkart.setAddress("USA");
		flipkart.setEmail("Ambrose@gmail.com");
		flipkart.setCno(23445232);
		
		
		
		 
		 
		
		
		 
		Items items1 =  new Items();
		items1.setId(113);
		items1.setName("mobile");
		items1.setPrice(90000);
		items1.setQty(1);
		
		
		Items items2 = new Items();
		items2.setId(114);
		items2.setName("earphone");
		items2.setPrice(2500);
		items2.setQty(2);
		
		Items items3 = new Items();
		items3.setId(115);
		items3.setName("covercase");
		items3.setPrice(300);
		items3.setQty(1);
		
		
	List<Items> list = 	new ArrayList<Items>();
	list.add(items1);
	list.add(items2);
	list.add(items3);
	
	
	flipkart.setItems(list);
	
	Flipkart_Items_Dao dao = new Flipkart_Items_Dao();
	
	//dao.saveFlipkartUser(flipkart);
	//dao.updateFlipkartUser(flipkart);
	dao.updateKart(1, list);
	
	
	
	
		
		
		
		
	}

	

}
