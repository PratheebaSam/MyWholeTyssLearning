package com.tyss.javalearning;

public class ExampleOperators {
	public static void main(String[] args) {
		//unary operator
		int a=10;
		System.out.println("unary operator");
		System.out.println("a");
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		
		//arithmetic operator
		int b=20;
		System.out.println("arithmetic operator");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//relational operator
		System.out.println("relational operator");
				System.out.println(a>b);
				System.out.println(a<b);
				System.out.println(a>=b);
				System.out.println(a<=b);
				System.out.println(a==b);
				System.out.println(a!=b);
				
		//Logical operator
				System.out.println("Logical operator");
				int c=40;
				System.out.println(c<a && c<b);
				System.out.println(c>a || c<b);
				
		//Circuit break
		/*
		 and -> if anyone false it return false and the next conditions are not executed
		 are -> if anyone true it return true and the next conditions are not executed*/
		
		System.out.println("circuit break");
		System.out.println(a>b && ++c>b);
		System.out.println(a++<b || ++c<b);
		System.out.println(a++<b || ++c<b++);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//Bitwise operator
		
		System.out.println("Bitwise operators");
		System.out.println(2|10);
		System.out.println(4|10);
		
		//ternary operator
		
		System.out.println("ternary operator");
		int x=10;
		String restriction=(x<18)?("not eligible for voting"):("eligible for voting");
		System.out.println(restriction);
		
		
		
		
	}
}
