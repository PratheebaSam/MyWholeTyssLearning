package com.assignment.strings;

import java.util.Scanner;

public class ReverseByWords {
	public static void main(String[] args) {
		String str;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String :");
		str = scanner.nextLine();
		scanner.close();
		String[] splitString = str.split(" ");
		for (int i = splitString.length-1; i >= 0; i--) {
			System.out.print(splitString[i] + " ");
		}
	}
}
