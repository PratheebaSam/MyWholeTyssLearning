package com.assignment.strings;

import java.util.Scanner;

public class RotationOfAnother {
	public static void main(String[] args) {
		String str, anotherStr,temp;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String :");
		str = scanner.nextLine();
		System.out.print("Enter the String :");
		anotherStr = scanner.nextLine();
		scanner.close();
		if (str.length() != anotherStr.length()) {
			System.out.println(anotherStr + " is not a roration of a string " + str);
		} else {
			temp = str + anotherStr;
			if (temp.contains(anotherStr)) {
				System.out.println(anotherStr + " is a roration of a string " + str);
			} else {
				System.out.println( anotherStr +" is not a roration of a string " + str );
			}
		}
	}
}
