package com.tyss.javalearning;
import java.util.Scanner;

public class AssSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("give 3 inputs:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int sum=a;
		for(int i=0;i<c;i++) {			
			sum+=((Math.pow(2,i))*b);
			System.out.println(sum);
		}
		
		
		/*
		for(int i=0;i<c;i++) {
			int result=0;
			for(int j=0;j<=i;j++) {
				result+=((Math.pow(2,j))*b);
			}
			System.out.println(a+result);
		}*/
		}

}
