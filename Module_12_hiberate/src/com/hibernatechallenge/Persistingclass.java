package com.hibernatechallenge;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.model.Employee;

public class Persistingclass {

    public static void main(String[] args) {
       
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Employee.class); 
        SessionFactory factory = cfg.buildSessionFactory();    
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        
        Employee emp1 = new Employee();
        emp1.setEmpno(1);
        emp1.setEmployeename("John Doe");
        emp1.setSalary(6000);
        emp1.setJob("Developer");
        emp1.setDeptno(101);

       
        session.save(emp1);
        tx.commit();
        System.out.println("Record successfully inserted"); 
        session.close();
        
    }
}
