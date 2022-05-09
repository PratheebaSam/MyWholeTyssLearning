package com.tyss.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Trainee {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	private String name;
	private double salary;
	@OneToOne
	private Laptop laptop;
	public Trainee(String name, double salary, Laptop laptop) {
		super();
		this.name = name;
		this.salary = salary;
		this.laptop = laptop;
	}
	
	
}
