package com.assignment.arrayprograms;

import java.util.Scanner;

public class RemoveDuplicates {
	static int Duplicates(int[] arr) {
		int n = arr.length;
		if (n == 0 || n == 1) {
			return n;
		}
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[n - 1];
		return j;
	}

	public static void main(String[] args) {
		int[] array;
		int input;
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
		int result = Duplicates(array);
		for (int i = 0; i < result; i++) {
			System.out.println(array[i]);
		}
	}
}
