package com.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Deletecustomer {

    public static void delcustomer(int customerid) {

        try {
            Configuration cfg = new Configuration();
            cfg.configure("hibernate.cfg.xml");

            SessionFactory factory = cfg.buildSessionFactory();
            Session session = factory.openSession();
            Transaction tx = session.beginTransaction();

            Query query = session.createQuery("delete from customer c where c.customerid = :customerid");
            query.setParameter("customerid", customerid);
            int success = query.executeUpdate();
            if (success >= 1) {
                System.out.println("Successfully deleted");
            } else {
                System.out.println("Record delete failed...");
            }
            tx.commit();
            session.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        delcustomer(1006);

    }

}
