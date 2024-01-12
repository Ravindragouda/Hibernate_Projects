package com.learn.hibernate.crud.HibernateCRUD;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------Enter your choice------");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			create();
			break;
		case 2:
			read();
			break;
		case 3:
			update();
			break;
		case 4:
			delete(null);
			break;
		default : System.out.println("invalid choice ");
			
			
		}

		

	}

	public static void create() {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session openSession = factory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		Laptop lap1 = new Laptop(11, "Hp", 45000);
		openSession.save(lap1);
		beginTransaction.commit();
		System.out.println(lap1);

	}

	public static void read() {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session openSession = factory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		Laptop lap1 = openSession.get(Laptop.class, 11);
		beginTransaction.commit();
		System.out.println(lap1);

	}

	public static void update() {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session openSession = factory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		Laptop lap1 = openSession.get(Laptop.class, 11);
		lap1.setL_id(11);
		lap1.setL_cost(40000);
		lap1.setL_name("Lenovo");
		openSession.save(lap1);
		beginTransaction.commit();
		System.out.println(lap1);

	}

	public static void delete(Laptop lap1) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session openSession = factory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();

		openSession.delete(lap1);
	}
}
