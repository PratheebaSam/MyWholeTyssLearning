package com.tyss.finalassessment02;

import java.util.ArrayList;
import java.util.Scanner;

import com.tyss.finalassesment.StudentDetails;

public class AddStudent {
	public ArrayList<StudentDetails> add() {
		ArrayList<StudentDetails> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the id of the student");
		int a=scanner.nextInt();
		System.out.println("enter the name of the student");
		String b=scanner.next();
		System.out.println("enter the mark of the student");
		float c=scanner.nextFloat();
		System.out.println("enter the course of the student");
		String d=scanner.next();
		StudentDetails details = new StudentDetails(a, b,c,d);
		list.add(details);
		System.out.println("Student added");
		return list;
	}
}
