package org.jsp.onetoone_uni.controller;

import org.jsp.onetoone_uni.dao.Mobile_Os_Dao;
import org.jsp.onetoone_uni.dto.Mobile;
import org.jsp.onetoone_uni.dto.Os;

public class Mobile_Os_Controller {
	
	public static void main(String[] args) 
	{
		Mobile mobile = new Mobile();
		mobile.setId(1003);
		mobile.setName("Realme");
	    mobile.setColor("blue");
	    mobile.setPrice(1500);
	    
	    Os os = new Os();
	    os.setId(104);
	    os.setName("Android 11");
	    os.setBit(64);
	    
	   mobile.setOs(os);
	    
	    Mobile_Os_Dao dao = new Mobile_Os_Dao();
	    //dao.saveMobile(mobile);
	   // dao.saveOs(os);
	   // dao.updatemobile(mobile);
	 //  dao.findMobile(1002);
//	   if(mobile2 != null)
//	   {
//		   System.out.println(mobile2);
//	   }
//	   else
//	   {
//		   System.out.println("Data not found");
//	   }
	    
	  //  dao.deleteById(1003);
	    
	    dao.findAllById();
	}

}
