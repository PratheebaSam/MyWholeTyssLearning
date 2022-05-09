package com.assignment.strings;

import java.util.Scanner;

public class NoOfPunctuations {
	public static void main(String[] args) {
		String str, Punctuation;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String :");
		str = scanner.nextLine();
		scanner.close();
		Punctuation = "[!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]";
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < Punctuation.length(); j++) {
				if (str.charAt(i) == Punctuation.charAt(j)) {
					count++;
				}
			}
		}
		System.out.println("Total Number Punctuations in a String :" + count);
	}
}