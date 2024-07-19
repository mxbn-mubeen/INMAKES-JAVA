package com.hql;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import com.model.Customer;

public class Customerselectall {
	
	

	public static void Selectall() {
		
		try {
			Configuration cfg=new Configuration();
			cfg.configure("hibernate.cfg.xml");
			
			SessionFactory factory=cfg.buildSessionFactory();
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			
			Query query=session.createQuery("from customer");
			ArrayList<Customer> allCustomer=(ArrayList<Customer>) query.getResultList();
			for(int i=0;i<allCustomer.size();i++) {
				System.out.println(allCustomer.get(i).getCustomerid()+"\t"+
						allCustomer.get(i).getCustomername()+"\t"+
						allCustomer.get(i).getAddress()+"\t"+
						allCustomer.get(i).getCity()+"\t"+
						allCustomer.get(i).getState()+"\t"+
						allCustomer.get(i).getCountry()+"\t"+
						allCustomer.get(i).getPincode());
			}
			
		
		}
	catch(Exception e) {
		e.printStackTrace();
	}
		
	}
	

	public static void main(String[] args) {
		
		
		Selectall();
		

	}

}
