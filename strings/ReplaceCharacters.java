package com.assignment.strings;

import java.util.Scanner;

public class ReplaceCharacters {
	public static void main(String[] args) {
		String str;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String :");
		str = scanner.nextLine();
		scanner.close();
		StringBuffer strBuffeer = new StringBuffer(str);

		for (int i = 0; i < str.length(); i++) {

			if (Character.isLowerCase(str.charAt(i))) {
				strBuffeer.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			} else if (Character.isUpperCase(str.charAt(i))) {
				strBuffeer.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}
		System.out.println("String after conversion : " + strBuffeer);
	}

}
