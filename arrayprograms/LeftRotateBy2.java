package com.assignment.arrayprograms;

import java.util.Scanner;

public class LeftRotateBy2 {
	public static void main(String[] args) {
		int[] array;
		int input, number;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Size of an Array :");
		int size = sc.nextInt();
		array = new int[size];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter " + (i + 1) + " element :");
			input = sc.nextInt();
			array[i] = input;
		}
		System.out.print("Enter number :");
		number = sc.nextInt();
		sc.close();
		
	    for(int i =0;i<number;i++) {
	    	int temp = array[0];
	    	for(int j=array.length-1;j>=0;j--) {
	    		int temp1 = array[j];
	    		array[j] = temp;
	    		temp = temp1;
	    	}
	    }
	    for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] +" ");
		}
	}
}