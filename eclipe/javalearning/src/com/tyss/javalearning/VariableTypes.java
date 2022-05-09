package com.tyss.javalearning;

public class VariableTypes {

	// static variables are bound to the class
	static int a=10;
	
	//instance variable are not bound to the class
	int b=20;
	
	public static void main(String[] args) {
		
		//local variables are bound to the class
		int c=30;
		//local variables are directly used by the method itself
		System.out.println(c);
		//static variables are used by the class name within the class
		System.out.println(a);
		
		//instance variables are used by creating the object
		VariableTypes abc=new VariableTypes();
		System.out.println(abc.b);
		
		
	}
	
	
	
	
}
