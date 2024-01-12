package com.hibernate.ex2.HibernateProject2;

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
          
          Bike b1=new Bike();
          b1.setBikeId(1);
          b1.setBrand("Hero");
          b1.setColor("Black");
          Bike b2=new Bike();
          b2.setBikeId(2);
          b2.setBrand("KTM");
          b2.setColor("Orange");
          
          Bike b3=new Bike();
          b3.setBikeId(3);
          b3.setBrand("Honda");
          b3.setColor("Blue");
          
          
          Student st1=new Student(11,"Ajay",24,b1);
          Student st2=new Student(12,"Amit",25,b2);

          Student st3=new Student(13,"Anuj",26,b3);
          b1.setStudent(st1);
          b2.setStudent(st2);
          b3.setStudent(st3);

          openSession.save(st1);
          openSession.save(st2);
          openSession.save(st3);
          openSession.save(b1);
          openSession.save(b2);
          openSession.save(b3);
          
          beginTransaction.commit();
          System.out.println("Student object is created");
          System.out.println("Bike object is created");
          
    }
}
