package com.assignment.arrayprograms;

import java.util.Scanner;

public class ArrayFrequency {
	public static void main(String[] args) {

		int[] array;
		int input, number, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Size of an Array :");
		int size = sc.nextInt();
		array = new int[size];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter " + (i + 1) + " element :");
			input = sc.nextInt();
			array[i] = input;
		}
		System.out.print("Enter element to find frequency :");
		number = sc.nextInt();
		sc.close();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				count++;
			} else {
				continue;
			}
		}
		if (count == 0) {
			System.out.println("Element not present in array!!!");
		} else {
			System.out.println("Frequency of an element :" + count);
		}
	}
}
