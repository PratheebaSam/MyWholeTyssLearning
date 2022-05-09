package com.assignment.arrayprograms;

import java.util.Scanner;

public class LargestElement {
	public static void main(String[] args) {
		int[] array;
		int largest = 0,input;
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
			if(array[i] > largest)
			{
				largest = array[i];
			}
		}
		System.out.println("The Largest Element in the array is :" + largest);
	}
}
