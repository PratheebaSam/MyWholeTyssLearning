package com.tyss.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {
	@Id
	private int id;
	private String brand;
	private String battery;
	public Laptop(int id, String brand, String battery) {
		super();
		this.id = id;
		this.brand = brand;
		this.battery = battery;
	}
	
	
}
