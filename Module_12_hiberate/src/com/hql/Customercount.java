package com.hql;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.model.Customer;

public class Customercount {
	
	public static void Customercount(String state) {
		
		try {
			Configuration cfg=new Configuration();
			cfg.configure("hibernate.cfg.xml");
			
			SessionFactory factory=cfg.buildSessionFactory();
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			
			//Query query=session.createQuery("select count(*)from customer c where c.state='"+state+"'");
			Query query=session.createQuery("select count(*)from customer c where c.state=?1");
			query.setParameter(1, state);
			Object count=query.uniqueResult();
			System.out.println(count);
			
		
		}
	catch(Exception e) {
		e.printStackTrace();
	}
	}

	public static void main(String[] args) {
		
		Customercount("karnataka");
	}

}
