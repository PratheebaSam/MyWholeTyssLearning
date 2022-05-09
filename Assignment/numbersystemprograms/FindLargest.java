package com.assignment.numbersystemprograms;

import java.util.Scanner;

public class FindLargest {
	public static void main(String[] args) {
	int[] array;
	int input,temp=0;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter The Size of an Array :");
	int size = sc.nextInt();
	array = new int[size];
	for (int i = 0; i < array.length; i++) {
		System.out.print("Enter " + (i + 1) + " element :");
		input = sc.nextInt();
		array[i] = input;
	}
	sc.close();
	for (int i = 0; i < array.length; i++) {
		for (int j = i+1; j < array.length; j++) {
			if(array[i] > array[j]) {
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
	}
	System.out.println("The Largest Element is :" + array[array.length-1]);
  }
}
