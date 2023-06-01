package carvale;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Table;
@Entity
@Table
public class Cars  {
  @Id
	private int cnum ;
	private String cname ;
	private int Model ; 
	private double price ;
	
	
	
	public int getCnum() {
		return cnum;
	}
	public void setCnum(int cnum) {
		this.cnum = cnum;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getModel() {
		return Model;
	}
	public void setModel(int model) {
		Model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	} 
	
	
	public static void main(String[] args) {
		
		Cars c = new Cars();
		c.setCnum(9831);
		c.setCname("Mahindra XUV");
		c.setModel(2017);
		c.setPrice(2497556.934);
		
		
		
		EntityManagerFactory e = Persistence.createEntityManagerFactory(
				"dev");
		
     	EntityManager m =  e.createEntityManager();
     	
     	EntityTransaction t =  m.getTransaction();
     	
//     	t.begin();
//     	m.persist(c);
//     	t.commit();
     	
     	t.begin();
     	m.merge(c);
     	t.commit();
     	
     	
     	
     	
     
     	
     	
     	
		
	}
	
	
	
	
	
	
	

}
