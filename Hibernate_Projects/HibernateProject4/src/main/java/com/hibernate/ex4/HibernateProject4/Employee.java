package com.hibernate.ex4.HibernateProject4;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	int E_id;
	String E_name;
	String E_team;
	@ManyToMany
	List <Technology> Technology;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int e_id, String e_name, String e_team,
			List<com.hibernate.ex4.HibernateProject4.Technology> technology) {
		super();
		E_id = e_id;
		E_name = e_name;
		E_team = e_team;
		Technology = technology;
	}
	public int getE_id() {
		return E_id;
	}
	public void setE_id(int e_id) {
		E_id = e_id;
	}
	public String getE_name() {
		return E_name;
	}
	public void setE_name(String e_name) {
		E_name = e_name;
	}
	public String getE_team() {
		return E_team;
	}
	public void setE_team(String e_team) {
		E_team = e_team;
	}
	public List<Technology> getTechnology() {
		return Technology;
	}
	public void setTechnology(List<Technology> technology) {
		Technology = technology;
	}
	
	
	
	

}
