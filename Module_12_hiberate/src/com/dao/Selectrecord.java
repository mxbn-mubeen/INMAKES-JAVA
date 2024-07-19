package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Customer;

public class Selectrecord {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		Customer Customerobj=session.get(Customer.class, 1001);
		System.out.println("show customer");
		System.out.println("----------------------");
		System.out.println("CustomerId="+Customerobj.getCustomerid());
		System.out.println("Customer Name="+Customerobj.getCustomername());
		System.out.println("Address="+Customerobj.getAddress());
		System.out.println("City="+Customerobj.getCity());
		System.out.println("state="+Customerobj.getState());
		System.out.println("country="+Customerobj.getCountry());
		System.out.println("pincode="+Customerobj.getPincode());
		session.close();
		
	}

}
