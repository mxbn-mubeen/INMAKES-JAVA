package com.hibernaterelationship;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Mobile;
import com.model.Team;

public class MobileDAO {

public  void save(Mobile m ) {
		
	try {
		Configuration cfg=new Configuration();
		cfg.configure();

		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(m);
		tx.commit();
		session.close();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
		

	}
}
