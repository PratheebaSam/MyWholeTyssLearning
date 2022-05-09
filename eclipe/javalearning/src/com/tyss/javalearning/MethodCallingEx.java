package com.tyss.javalearning;

public class MethodCallingEx {
	static double mul2(double d,double e) {/*arguement*/
		double mul3=d*e;
		return mul3;
	}
	
	
	public static void main(String[] args) {
		double mul1=MethodCallingEx.mul2(4.0,5.7);
		System.out.println(mul1);
		double mul4=MethodCallingEx.mul2(6.5,8.7);
		System.out.println(mul4);
	}
	
}