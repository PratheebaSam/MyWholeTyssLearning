package com.assignment.strings;

import java.util.Scanner;

public class DuplicateWords {
	public static void main(String[] args) {
		String str;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String :");
		str = scanner.nextLine();
		scanner.close();
		String[] strArray = str.split(" ");

		int length = 0;
		String[] scan_array = new String[strArray.length];
		boolean s = false;
		System.out.print("Duplicates :");
		for (int i = 0; i < strArray.length; i++) {
			for (int j = i+1; j < strArray.length; j++) {
				if (strArray[i].equals(strArray[j])) {
					for (int k = 0; k < length; k++) {
						if (strArray[k] == scan_array[k]) {
							s = true;
							break;
						}
					}
					if (s) {
						s = false;
					} else {
						scan_array[length] = strArray[j];
						length++;
						break;
					}
				}
			}
		}
		scanner.close();
		for (int i = 0; i < length; i++) {
			System.out.print(scan_array[i] + " ");
		}
	}
}
