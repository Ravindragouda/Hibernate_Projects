package com.hibernate.ex3.HibernateProject3;

import java.util.ArrayList;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();

		List<Product> l1 = new ArrayList<Product>();
		List<Product> l2 = new ArrayList<Product>();
		l1.add(p1);
		l1.add(p2);
		l2.add(p3);
		l2.add(p4);
		Customer c1 = new Customer(11, "Ankit", 22, l1);
		Customer c2 = new Customer(22, "Ajay", 24, l2);

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session openSession = factory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();

		p1.setP_id(1111);
		p1.setP_name("Watch");
		p1.setP_cost(4500);

		p2.setP_id(2222);
		p2.setP_name("Mobile");
		p2.setP_cost(25000);

		p3.setP_id(3333);
		p3.setP_name("Laptop");
		p3.setP_cost(85000);

		p4.setP_id(4444);
		p4.setP_name("Bike");
		p4.setP_cost(120000);

		p1.setCst(c1);
		p2.setCst(c1);
		p3.setCst(c2);
		p4.setCst(c2);
		
		openSession.save(c1);
		openSession.save(c2);
		openSession.save(p1);
		openSession.save(p2);
		openSession.save(p3);
		openSession.save(p4);

		beginTransaction.commit();
		System.out.println("objects are created");
		

	}
}
