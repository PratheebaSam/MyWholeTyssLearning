package com.tyss.springusingannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	@Value(value="a9")
	private String name;
	@Value(value="oppo")
	private String brand;
	@Value(value="20000")
	private String price;
	@Autowired
	private Sim sim;
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(String name, String brand, String price, Sim sim) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.sim = sim;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Sim getSim() {
		return sim;
	}
	public void setSim(Sim sim) {
		this.sim = sim;
	}
	@Override
	public String toString() {
		return "Mobile [name=" + name + ", brand=" + brand + ", price=" + price + ", sim=" + sim + "]";
	}
	
}
