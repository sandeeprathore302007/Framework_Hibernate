package bike;

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
public class Bike {
	
	@Override
	public String toString() {
		return "Bike [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + "]";
	}


	@Id
	private int id ; 
	private String name ;
	private String color ;
	private double price ; 
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
    public double getPrice() {
		return price;
	}
    public void setPrice(double price) {
		this.price = price;
	}
    
     
    public static void main(String[] args) {
		Bike b = new Bike();
		
		b.setId(101);
		b.setName("Sandeep");
		b.setColor("white");
		b.setPrice(85000.0);
		
		EntityManagerFactory e = Persistence.createEntityManagerFactory("dev");
	    EntityManager m = e.createEntityManager();
	    EntityTransaction t = m.getTransaction();
	    
//	    t.begin();
//	    m.persist(b); //save
//	    t.commit();
	    
//	    t.begin();
//	    m.merge(b);
//	    t.commit();
	  //find  
//	  Bike b1 =   m.find(Bike.class,101 ); 
//	  if(b1 != null)
//	  {   t.begin(); 
//		  m.remove(b1);
//		 System.out.println("Data Deleted");
//		 t.commit();
//		  
//	  }
//	  else
//	  {
//		  System.err.println("Data Not Exits ");
//	  }
	    
 Query	q =     m.createQuery("select b from Bike b ");
 List<Bike> list = q.getResultList();
 System.out.println(list);
	    
	  
	    
    }
	
	

}
