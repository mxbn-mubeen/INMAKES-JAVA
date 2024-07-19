package com.hibernatechallenge;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.model.Employee;

public class Updatesalary {

	public static void main(String[] args) {
		
		 try {

	            Configuration cfg = new Configuration();
	            cfg.configure("hibernate.cfg.xml");

	            SessionFactory factory = cfg.buildSessionFactory();
	            Session session = factory.openSession();
	            Transaction tx = session.beginTransaction();
	            
	            String hqlUpdate = "update Employee set salary = 5000 where salary = :oldSalary";
	            int updatedEntities = session.createQuery(hqlUpdate)
	                                         .setParameter("oldSalary", 6000) 
	                                         .executeUpdate();

	            tx.commit();
	            session.close();
	            factory.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	}


