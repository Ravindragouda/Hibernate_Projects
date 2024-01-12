package com.hibernate.ex2.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Session openSession = factory.openSession();
        Transaction beginTransaction = openSession.beginTransaction();
        Student st=new Student(11,"Satish",22);
        openSession.save(st);
        beginTransaction.commit();
        System.out.println("Student object is created");
        
        
        
    }
}
