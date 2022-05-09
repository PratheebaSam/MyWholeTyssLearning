package com.tyss.javalearning;

//method overloading the name should be with same and different types of arguments


//diff parameters
//types of parameters
//diff type og arg


public class MethodOverloading {
	static double mul2(double d,double e) { //argument
		double mul3=d*e;
		return mul3;
	}
	
	static double mul2(double x ,double y,int z) { //argument
		double mul3=x*y*z;
		return mul3;
	}
	
	
	
	public static void main(String[] args) {
		double mul1=MethodOverloading.mul2(4.0,5.7);
		System.out.println(mul1);
		double mul4=MethodOverloading.mul2(6.5,8.7,2);
		System.out.println(mul4);
	}

}
