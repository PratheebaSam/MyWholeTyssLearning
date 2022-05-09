package com.assignment.strings;

import java.util.Scanner;

public class ReverseByCharater {
	public static void main(String[] args) {
		String str,reverseString="";
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String :");
		str = scanner.nextLine();
		scanner.close();
		for (int i = str.length()-1; i >=0; i--) {
			System.out.println(str.charAt(i));
			reverseString = reverseString + str.charAt(i);
		}
		//System.out.println(reverseString);
	}
}
