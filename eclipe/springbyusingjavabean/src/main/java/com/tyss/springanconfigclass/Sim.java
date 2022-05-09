package com.tyss.springanconfigclass;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sim {
	@Value(value="jio")
	private String name;
	@Value(value="987737")
	private String number;
	public Sim() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sim(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Sim [name=" + name + ", number=" + number + "]";
	}
	
	
}
