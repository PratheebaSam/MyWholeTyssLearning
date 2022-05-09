package com.tyss.singletern;

public class Employee {
	static Employee e;
	private Employee() {
		
	}
	public static Employee getobject() {
		if(e==null) {
			e=new Employee();
		}
		return e;		
	}
}
