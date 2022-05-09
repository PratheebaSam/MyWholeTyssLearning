package com.assignment.arrayprograms;

import java.util.Scanner;

public class PrintDuplicates {
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
		int length = 0;
		int[] b = new int[10];
		boolean s = false;
		System.out.print("Duplicates :");
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if ((array[i] == array[j])) {
					for (int k = 0; k < length; k++) {
						if (array[k] == b[k]) {
							s = true;
							break;
						}
					}
					if (s) {
						s = false;
					} else {
						b[length] = array[j];
						length++;
						break;
					}
				}
			}
		}
		sc.close();
		for (int i = 0; i < length; i++) {
			System.out.println(b[i] +" ");
		}
	}
}
