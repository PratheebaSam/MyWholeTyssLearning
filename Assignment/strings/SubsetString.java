package com.assignment.strings;

import java.util.Scanner;
public class SubsetString {
	public static void main(String[] args) {
		String []subSet;
		String str;
		int index=0;
		int length;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String :");
		str = scanner.nextLine();
		String noSpace = str.replaceAll("\\s","");
		length = noSpace.length();
		subSet = new String[(length*(length+1))/2];
		scanner.close();
		
		for (int i = 0; i < noSpace.length(); i++) {
			for (int j = i+1; j < noSpace.length()+1; j++) {
				subSet[index]= noSpace.substring(i, j);
				index++;
			}
		}
		for (int i = 0; i < subSet.length; i++) {
			System.out.println(subSet[i]);
		}
	}
}
