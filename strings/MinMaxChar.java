package com.assignment.strings;

import java.util.Scanner;

public class MinMaxChar {
	public static void main(String[] args) {
		String str;
		int[] count;
		int min, max;
		char maxChar, minChar;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String :");
		str = scanner.nextLine();
		
		scanner.close();
		
		minChar = str.charAt(0);
		maxChar = str.charAt(0);
		count = new int[str.length()];
		char string[] = str.toCharArray();
		
		for (int i = 0; i < string.length; i++) {
			count[i] = 1;
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] !=' ' && string[i] != '0') {
					count[i]++;
					string[j] = '0';
				}
			}
		}
		
		max = count[0];
		min = count[0];
		for (int i = 0; i < count.length; i++) {
			if (max < count[i]) {
				max = count[i];
				maxChar = string[i];
			}
			if(min > count[i] && count[i]!='0') {
				min = count[i];
				minChar = string[i];
			}
		}
	
		System.out.println("Minimum Occurence of Character :" + minChar );
		System.out.println("Maximum Occurence of Character :" + maxChar );
	}
}
