package com.hibernatechallenge;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class Deletingrecord {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		 Employee emp1 = session.get(Employee.class, 1L);
		 
		 session.delete(emp1);
		 session.getTransaction().commit();
		 System.out.println("record deleted sucessfully");
		 session.close();

	}

}
