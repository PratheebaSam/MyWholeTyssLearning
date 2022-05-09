package com.assignment.numbersystemprograms;

import java.util.Scanner;

public class CheckPalindrome {
	public static void main(String[] args) {
		int number, temp, result = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number :");
		number = scanner.nextInt();
		temp = number;
		scanner.close();
		while (temp > 0) {
			result = result * 10 +  (temp % 10); 
			temp = temp /10;
		}
		if(result == number) {
			System.out.println("It is Palindrome");
		}else {
			System.out.println("It is not Palindrome");
		}
	}
}
