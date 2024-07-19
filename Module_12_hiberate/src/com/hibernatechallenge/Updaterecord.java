package com.hibernatechallenge;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Customer;
import com.model.Employee;

public class Updaterecord {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		 Employee emp1 = session.get(Employee.class, 1L);
		
		emp1.setJob("Data Science");
		emp1.setSalary(200000);
		
		session.update(emp1);
		tx.commit();
		System.out.println("record update sucessfully");
		session.close();
		
		

	}

}
