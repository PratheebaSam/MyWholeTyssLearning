package com.assignment.strings;

import java.util.Scanner;

public class DivideStringIntoN {
	public static void main(String[] args) {
		String []EqualStr;
		String str;
		int number,length,divide,temp=0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String :");
		str = scanner.nextLine();
		System.out.println("Enter N :");
		number = scanner.nextInt();
		scanner.close();
		length = str.length();
		divide = length/number;
		EqualStr = new String[number];
		
		
		if (length % number!=0) {
			System.out.println("String Cannot be Divided into " + number + " Parts");
		} else {
			for (int i = 0; i < length; i = i + divide ) {
				String part = str.substring(i, i + divide);
			    EqualStr[temp] = part;
				temp++;
			}
			System.out.println(number + " parts of given string are ");
			for (int i = 0; i < EqualStr.length; i++) {
				System.out.println(EqualStr[i]);
			}
		}
	}
}
