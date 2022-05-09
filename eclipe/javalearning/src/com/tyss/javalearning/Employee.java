package com.tyss.javalearning;

public class Employee extends Member{
	String specialization;
	String department;
	public Employee(String name, int age, long phoneNumber, String address, long salary) {
		super(name, age, phoneNumber, address, salary);
	}
	
}
