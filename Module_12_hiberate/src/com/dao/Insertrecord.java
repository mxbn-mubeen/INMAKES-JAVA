package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Customer;

public class Insertrecord {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Customer customerobj=new Customer();
		
		customerobj.setCustomerid(1001);
		customerobj.setCustomername("axel");
		customerobj.setAddress("adk street");
		customerobj.setCity("salem");
		customerobj.setState("tamilnadu");
		customerobj.setCountry("india");
		customerobj.setPincode(623457);
		
		session.save(customerobj);
		tx.commit();
		System.out.println("record sucessfully inserted");
		session.close();
		
		
	}

}
