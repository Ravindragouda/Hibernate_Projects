package com.hibernate.ex4.HibernateProject4;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Technology {
	@Id
	int T_id;
	String T_name;
	@ManyToMany
	List <Employee> Employee;
	public Technology() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Technology(int t_id, String t_name, List<com.hibernate.ex4.HibernateProject4.Employee> employee) {
		super();
		T_id = t_id;
		T_name = t_name;
		Employee = employee;
	}
	public int getT_id() {
		return T_id;
	}
	public void setT_id(int t_id) {
		T_id = t_id;
	}
	public String getT_name() {
		return T_name;
	}
	public void setT_name(String t_name) {
		T_name = t_name;
	}
	public List<Employee> getEmployee() {
		return Employee;
	}
	public void setEmployee(List<Employee> employee) {
		Employee = employee;
	}
	

}
