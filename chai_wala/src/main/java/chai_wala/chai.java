package chai_wala;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.Table;



@Entity
@Table
public class chai {
	
	
	@Override
	public String toString() {
		return "chai [bcode=" + bcode + ", cname=" + cname + ", price=" + price + ", quantity=" + quantity + "]";
	}


	@Id
	private int bcode ;
	private String cname ; 
	private int  price ;
	private int quantity;
	
	
	public int getBcode() {
		return bcode;
	}
	public void setBcode(int bcode) {  
		this.bcode = bcode;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public static void main(String[] args) {
		chai c = new chai();
		c.setBcode(1321);
		c.setCname("Bagh_Bakri_Tea");
		c.setPrice(250);
		c.setQuantity(1);
		
		
		
		EntityManagerFactory e = Persistence.createEntityManagerFactory("dev");
		EntityManager m = e.createEntityManager();
		EntityTransaction t = m.getTransaction();
		
//		t.begin();
//		m.persist(c); //save
//		t.commit();
//		t.begin();
//		m.merge(c); //save
//		t.commit();
		
		//find 
//		chai c1 =    m.find(chai.class, 1321);
//		System.out.println(c1);
		
		Query	q =     m.createQuery("select c from chai c ");
		 List<chai> list = q.getResultList();
		 System.out.println(list);
	}
}
