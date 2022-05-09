package com.tyss.singletern;

public class App {
	public static void main(String[] args) {
		Employee employee = Employee.getobject();
		System.out.println(employee);
		Employee employee2 = Employee.getobject();
		System.out.println(employee2);
	}
}
