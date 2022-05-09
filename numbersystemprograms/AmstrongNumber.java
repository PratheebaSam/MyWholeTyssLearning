package com.assignment.numbersystemprograms;

import java.util.Scanner;

public class AmstrongNumber {
public static void main(String[] args) {
	int number, temp,number1,result = 0;
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter Number :");
	number = scanner.nextInt();
	temp = number;
	scanner.close();
	temp =  number;
	while(temp > 0) {
		number1 = temp%10;
		result = result +(number1*number1*number1);
		temp = temp /10;
	}
	
	if(result == number) {
		System.out.println("It is Amstrong Number");
	}else {
		System.out.println("It is not a Amstrong Number");
	}
}
}
