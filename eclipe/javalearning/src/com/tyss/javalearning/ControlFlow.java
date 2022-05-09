package com.tyss.javalearning;

public class ControlFlow {
	//if variable is a decision making statement
	public static void main(String[] args) {
		//if variable is a decision making statement
		System.out.println("if\n---------------------------------");
		System.out.println("program starts");
		if(true) {
			System.out.println("welcome");
		}
		
		
		int x=20;
		int y=30;
		if(x>y) {
			System.out.println("yep!!");
		}
		System.out.println("program ends happily\n__________________________________");
		
		
		//ifelse statement
		System.out.println("ifelse\n---------------------------------");
		int money=2000;
		if(money>10000) {
			System.out.println("lets enjoy ur lilfe");
		}
		else {
			System.out.println("better luck next time!!!\n________________________________________");
		}
		
		//elseif ladder statement
		System.out.println("if else if \n-------------------------------");
		int money1=18000;
		if(money1>10000 && money1<11000) {
			System.out.println("lets enjoy ur life in your own city");
		}else if(money1>11000 && money1<12000) {
			System.out.println("lets enjoy ur life in shimla");
		}else if(money1>12000) {
			System.out.println("lets enjoy ur life in Dazling");
		}
		
		else {
			System.out.println("better luck next time!!!\n________________________________________");
		}
		
		
		
	}
	
	
	
	
	
}
