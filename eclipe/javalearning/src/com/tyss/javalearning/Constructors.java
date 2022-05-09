package com.tyss.javalearning;

public class Constructors {
	//contructor name with be as same as class name
	
	Constructors(){
		System.out.println("enjoy dear");
	}
	
	public static void main(String[] args) {
		Constructors con = new Constructors();
		UnderstandConstructor sam=new UnderstandConstructor();
		System.out.println(UnderstandConstructor.a);
		System.out.println(sam.b);
	}
	
	
	
	
}
