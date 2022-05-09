package com.assignment.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		String s1, s2;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String1 :");
		s1 = scanner.nextLine();
		System.out.print("Enter the String2 :");
		s2 = scanner.nextLine();
		scanner.close();
		String str1 = s1.replaceAll("\\s", "");  
        String str2 = s2.replaceAll("\\s", "");
		boolean status = true;
		if (str1.length() != str2.length()) {
			status = false;
		} else {
			char[] ArrayS1 = str1.toLowerCase().toCharArray();
			char[] ArrayS2 = str2.toLowerCase().toCharArray();
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			status = Arrays.equals(ArrayS1, ArrayS2);
		}
		if (status) {
			System.out.println(str1 + " and " + str2 + " are anagrams");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams");
		}
	}
}
