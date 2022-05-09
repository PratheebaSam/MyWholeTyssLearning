package com.assignment.arrayprograms;

import java.util.Scanner;

public class ThirdLargest {
	public static void main(String[] args) {
		int[] array;
		int largest = 0, input, secondLargest = 0, thirdLargest = 0;
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
			if (largest < array[i]) {
				thirdLargest = secondLargest;
				secondLargest = largest;
				largest = array[i];
			}
			if (secondLargest < array[i] && array[i] < largest) {
				thirdLargest = secondLargest;
				secondLargest = array[i];
			}
			if (thirdLargest < array[i] && array[i] < secondLargest && array[i] < largest) {
				thirdLargest = array[i];
			}
		}
		System.out.println("Third Largest Element is an array : " + thirdLargest);
	}
}
