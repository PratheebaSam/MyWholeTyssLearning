package com.tyss.basicjava;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		System.out.println("enter the value");
		Scanner scanner = new Scanner(System.in);
		int x=scanner.nextInt();
		int y=x-1;
		System.out.println(y);
		int flag=0;
		while(y!=1){
			if(x%y==0) {
				flag=1;
				System.out.println("it is not a prime number");
			}
			y--;
		}
		if(flag==0) {
			System.out.println("prime number");
		}
		
	}
}
