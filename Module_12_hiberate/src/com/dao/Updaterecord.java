package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Customer;

public class Updaterecord {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Customer Customer=session.get(Customer.class, 1000);
		
		Customer.setAddress("north street");
		Customer.setCity("ramnathapuram");
		Customer.setState("tamilnadu");
		Customer.setCountry("india");
		Customer.setPincode(623517);
		
		session.update(Customer);
		tx.commit();
		System.out.println("record update sucessfully");
		session.close();
		
		

	}

}
