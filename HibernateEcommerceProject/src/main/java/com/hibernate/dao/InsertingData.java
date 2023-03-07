package com.hibernate.dao;

import java.io.File; 
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entities.*;

public class InsertingData {
    public static  void main(String[] args) {
	Configuration c=new Configuration();
	c.configure("hibernate.cfg.xml");
	@SuppressWarnings("deprecation")
	SessionFactory sf=c.buildSessionFactory();
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	
	 File file = new File("C:\\Users\\Sreenivas Bandaru\\Pictures\\Saved Pictures\\realme.png");
     byte[] bFile = new byte[(int) file.length()];
     
     try {
	     FileInputStream fileInputStream = new FileInputStream(file);
	     //convert file into array of bytes
	     fileInputStream.read(bFile);
	     fileInputStream.close();
     } catch (Exception e) {
	     e.printStackTrace();
     }
	
     Product p=new Product();
	p.setImage(bFile);
	p.setProductName("realme 8 pro");
	p.setProductDescription(
	  "(Renewed) realme 8 pro (4 GB RAM, 64GB ROM) (Supersonic Blue)\r\n" +
	  "3.63.6 out of 5 stars (25)\r\n" + "Get it by one day\r\n" +
	  "FREE Delivery by Amazon\r\n" + "Only 1 left in stock.");
	 
	p.setProductPrice(18999.0);
	
	 File file1 = new File("C:\\Users\\Sreenivas Bandaru\\Pictures\\Saved Pictures\\redmi.webp");
     byte[] bFile1 = new byte[(int) file1.length()];
     
     try {
	     FileInputStream fileInputStream = new FileInputStream(file1);
	     //convert file into array of bytes
	     fileInputStream.read(bFile1);
	     fileInputStream.close();
     } catch (Exception e) {
	     e.printStackTrace();
     }
     Product p1=new Product();
	  p1.setImage(bFile1);
	  p1.setProductName("redmi 12 pro max");
		
		  p1.setProductDescription("Redmi 12 pro max Mystique Blue 6GB RAM 128GB ROM\r\n"
		  + "1st Phone with 120Hz Super AMOLED and Snapdragon® 4 Gen 1 |\r\n" +
		  "48MP AI Triple Camera\r\n" + "Get it by Tomorrow, 5 March\r\n" +
		  "FREE Delivery by Amazon\r\n" + "+2 colors/patterns");
		 
	  p1.setProductPrice(38999.0);
	
	  
	  File file2 = new File("C:\\Users\\Sreenivas Bandaru\\Pictures\\Saved Pictures\\oppo.jpg");
	     byte[] bFile2 = new byte[(int) file2.length()];
	     
	     try {
		     FileInputStream fileInputStream = new FileInputStream(file2);
		     //convert file into array of bytes
		     fileInputStream.read(bFile2);
		     fileInputStream.close();
	     } catch (Exception e) {
		     e.printStackTrace();
	     }
	     Product p2=new Product(); 
	  p2.setImage(bFile2);
	  p2.setProductName("oppo 5G");
		
		  p2.setProductDescription("Oppo 5G (Glowing black, 6GB RAM, 128 Storage) |\r\n"
		  + "5000 mAh Battery with 33W SUPERVOOC Charger| 50MP AI Camera |\r\n" +
		  "90Hz Refr...\r\n" +
		  "Flat INR 1500 Off on SBICardsFlat INR 1500 Off on SBICards\r\n" +
		  "Get it by Today, 4 March\r\n" + "FREE Delivery by Amazon");
		 
	  p2.setProductPrice(23999.0);
	
	  
	  File file3 = new File("C:\\Users\\Sreenivas Bandaru\\Pictures\\Saved Pictures\\vivo.jpg");
	     byte[] bFile3 = new byte[(int) file3.length()];
	     
	     try {
		     FileInputStream fileInputStream = new FileInputStream(file3);
		     //convert file into array of bytes
		     fileInputStream.read(bFile3);
		     fileInputStream.close();
	     } catch (Exception e) {
		     e.printStackTrace();
	     }
	     Product p3=new Product();
	  p3.setImage(bFile3);
	  p3.setProductName("vivo 5");
		
		  p3.setProductDescription("vivo 5 (Glowing Blue, 8GB RAM, 128 Storage) |\\r\\n\"\r\n"
		  +
		  "	  		+ \"5000 mAh Battery with 33W SUPERVOOC Charger| 50MP AI Camera |\\r\\n\"\r\n"
		  + "	  		+ \"90Hz Refr...\\r\\n\"\r\n" +
		  "	  		+ \"Deal of the Day\\r\\n\"\r\n" +
		  "	  		+ \"Get it by Today, 2 March\\r\\n\"\r\n" +
		  "	  		+ \"FREE Delivery by Amazon");
		 
	  p3.setProductPrice(24999.0);
	
	  
	  File file4 = new File("C:\\Users\\Sreenivas Bandaru\\Pictures\\Saved Pictures\\one plus.jpg");
	     byte[] bFile4 = new byte[(int) file1.length()];
	     
	     try {
		     FileInputStream fileInputStream = new FileInputStream(file4);
		     //convert file into array of bytes
		     fileInputStream.read(bFile4);
		     fileInputStream.close();
	     } catch (Exception e) {
		     e.printStackTrace();
	     }
	     Product p4=new Product();
	  p4.setImage(bFile4);
	  p4.setProductName("one plus 9");
	  p4.setProductPrice(48999.0);
		
		  p4.setProductDescription("one plus 9(grey , 8GB RAM, 128 Storage) |\\r\\n\"\r\n"
		  + "	  		"+
		  "\5500 mAh Battery with 33W SUPERVOOC Charger| 50MP AI Camera |\\r\\n\"\r\n"
		  + "	  		"+ "\120Hz Refr...\\r\\n\"\r\n" +
		  "	  		+ \"Deal of the Day\\r\\n\"\r\n" +
		  "	  		+ \"Get it by Today, 10 March\\r\\n\"\r\n" +
		  "	  		+ \"FREE Delivery by Amazon");
		 
	
	
	List<Product>list=new ArrayList<Product>();
	list.add(p);
	
	  list.add(p1); list.add(p2); list.add(p3); list.add(p4);
	 
	CategoryClass cc=new CategoryClass();
	cc.setCategoryName("Mobiles");
	cc.setList(list);
	s.save(cc);
	t.commit();
	s.close();
	System.out.println("succesfully inserted");
}
}
