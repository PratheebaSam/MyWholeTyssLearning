package com.assignment.strings;

import java.util.Scanner;

public class ReplaceSpaces {
	public static void main(String[] args) {
		String str;
		String specified_Char;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String :");
		str = scanner.nextLine();
		System.out.print("Enter Character :");
		specified_Char = scanner.next();
		scanner.close();
		char[] char_String = str.toCharArray();
		for (int i = 0; i < char_String.length; i++) {
			if (char_String[i] == ' ') {
				char_String[i] = specified_Char.charAt(0);
			}
		}
		System.out.println(char_String);
	}
}
