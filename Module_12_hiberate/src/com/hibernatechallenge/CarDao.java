package com.hibernatechallenge;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Car;


public class CarDao {

public  void save(Car c ) {
		
	try {
		Configuration cfg=new Configuration();
		cfg.configure();

		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(c);
		tx.commit();
		session.close();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
		

	}
}
