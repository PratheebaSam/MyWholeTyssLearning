package com.tyss.javalearning;

public class PrintEvenNum {
	public static void main(String[] args) {
		//print numbers from 1 to 100
		System.out.println("numbers from 1 to 100");
		for(int x=1;x<=100;x++) {
			System.out.println(x);
		}
		System.out.println("__________________\n odd numbers from 1 to 100");
		//print odd number
		
		for(int i=0;i<=100;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}

}
