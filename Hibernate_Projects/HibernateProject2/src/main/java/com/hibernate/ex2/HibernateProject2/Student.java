package com.hibernate.ex2.HibernateProject2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Student {
	@Id
	int rollNo;
	String name;
	int age;
	@OneToOne
	Bike bike;
	public Student() {
		
	}
	public Student(int rollNo, String name, int age, Bike bike) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.bike = bike;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Bike getBike() {
		return bike;
	}
	public void setBike(Bike bike) {
		this.bike = bike;
	}
	
	

}
