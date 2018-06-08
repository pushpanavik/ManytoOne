package com.bridgeit;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import model.Customer;
import model.Vendor;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Session session = new Configuration().configure("resources/db.config.xml").buildSessionFactory().openSession();
		Transaction t = session.beginTransaction();

		/*Vendor v = new Vendor();
		v.setVid(789);
		v.setVname("Prakash Shikare");*/

		
		Customer c = session.get(Customer.class, new Integer(456));
			
		System.out.println("********************************");
		System.out.println(c.getCid() +" "+ c.getCname()+ " ");
		
		Vendor v=c.getVendor();
		System.out.println("**************************************");
		System.out.println(v.getVid()+ " " +v.getVname());
		
		/*c.setCid(456);
		c.setCname("Vijay Pardesi");
		c.setVendor(v);

		Customer c1 = new Customer();
		c1.setCid(758);
		c1.setCname("Neha Kakkar");
		c1.setVendor(v);

		session.save(v);
		session.save(c);
		session.save(c1);*/
		t.commit();
		session.close();
		//session.flush();

	}
}
