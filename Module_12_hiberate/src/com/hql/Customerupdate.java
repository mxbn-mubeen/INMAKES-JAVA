package com.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Customerupdate {

    public static void Customerupdate(String city, int customerid) {
        try {
            Configuration cfg = new Configuration();
            cfg.configure("hibernate.cfg.xml");

            SessionFactory factory = cfg.buildSessionFactory();
            Session session = factory.openSession();
            Transaction tx = session.beginTransaction();

            Query query = session.createQuery("update customer c set c.city = :city where c.customerid = :customerid");
            query.setParameter("city", city);
            query.setParameter("customerid", customerid);
            int success = query.executeUpdate();

            if (success >= 1) {
                System.out.println("Successfully updated");
            } else {
                System.out.println("Record update failed...");
            }

            tx.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Customerupdate("kochin", 1005);
    }
}
