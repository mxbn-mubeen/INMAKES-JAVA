package com.hiberanteannonataions;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Film;

public class FilmDAO {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Film film1= new Film();
		film1.setFilmname("ps-1");
		film1.setDirector("manirathnam");
		
		Film film2= new Film();
		film2.setFilmname("ps-2");
		film2.setDirector("manirathnam");
		
		Film film3= new Film();
		film3.setFilmname("vikram");
		film3.setDirector("lokesh kanagaraj");
		
		session.save(film1);
		session.save(film2);
		session.save(film3);
		tx.commit();
		session.close();
	}

}
