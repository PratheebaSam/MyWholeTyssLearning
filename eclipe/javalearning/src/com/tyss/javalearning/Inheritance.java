package com.tyss.javalearning;

public class Inheritance {
	public static void main(String[] args) {
		Employee employee = new Employee("Prathi",23,9344045340l,"201,south street,Thanjavur",30000l);
		System.out.println(employee.name+"\n"+employee.age+"\n"+employee.phoneNumber+"\n"+employee.address+"\n"+employee.salary);
		Manager manager = new Manager("Sam",25,9047416240l,"403,northwest road,trichy",50000l);
		System.out.println(manager.name+"\n"+manager.age+"\n"+manager.phoneNumber+"\n"+manager.address+"\n"+manager.salary);
		
		
		
	}
}
