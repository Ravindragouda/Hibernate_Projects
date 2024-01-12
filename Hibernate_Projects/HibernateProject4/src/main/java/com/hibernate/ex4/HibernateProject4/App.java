package com.hibernate.ex4.HibernateProject4;

import java.util.ArrayList;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session openSession = factory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();

		Technology t1 = new Technology(123, "Java", null);
		Technology t2 = new Technology(124, "Mysql", null);
		Technology t3 = new Technology(125, "Python", null);
		Technology t4 = new Technology(126, "React", null);

		List<Technology> Tl1 = new ArrayList<Technology>();
		Tl1.add(t1);
		Tl1.add(t2);
		Tl1.add(t4);
		List<Technology> Tl2 = new ArrayList<Technology>();
		Tl2.add(t2);
		Tl2.add(t3);
		Tl2.add(t4);

		List<Technology> Tl3 = new ArrayList<Technology>();
		Tl3.add(t1);
		Tl3.add(t4);

		List<Technology> Tl4 = new ArrayList<Technology>();
		Tl4.add(t2);
		Tl4.add(t3);
		Tl4.add(t4);

		List<Technology> Tl5 = new ArrayList<Technology>();
		Tl5.add(t1);
		Tl5.add(t2);
		Tl5.add(t3);
		Tl5.add(t4);

		Employee e1 = new Employee(11, "Prakash", "Team-A", Tl1);
		Employee e2 = new Employee(12, "Praveen", "Team-B", Tl2);
		Employee e3 = new Employee(13, "Pooja", "Team-c", Tl3);
		Employee e4 = new Employee(14, "Priya", "Team-A", Tl4);
		Employee e5 = new Employee(15, "Prateek", "Team-B", Tl5);
		List<Employee> el1 = new ArrayList<Employee>();

		el1.add(e1);
		el1.add(e3);
		el1.add(e5);
		List<Employee> el2 = new ArrayList<Employee>();
		el2.add(e1);
		el2.add(e2);
		el2.add(e4);
		el2.add(e5);
		List<Employee> el3 = new ArrayList<Employee>();
		el3.add(e2);
		el3.add(e4);
		el3.add(e5);
		List<Employee> el4 = new ArrayList<Employee>();
		el4.add(e1);
		el4.add(e2);
		el4.add(e3);
		el4.add(e4);
		el4.add(e5);

		t1.setEmployee(el1);
		t2.setEmployee(el2);
		t3.setEmployee(el3);
		t4.setEmployee(el4);

		openSession.save(e1);
		openSession.save(e2);
		openSession.save(e3);
		openSession.save(e4);
		openSession.save(e5);

		openSession.save(t1);
		openSession.save(t2);
		openSession.save(t3);
		openSession.save(t4);

		beginTransaction.commit();
		System.out.println("SUCCESSFULL");
	}
}
