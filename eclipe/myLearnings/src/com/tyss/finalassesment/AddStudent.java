package com.tyss.finalassesment;

import java.util.ArrayList;
import java.util.Scanner;

public class AddStudent {
	public void addStudent(ArrayList<StudentDetails> list,Scanner scanner)throws Exception {
		System.out.println("enter the id of the student");
		int id=scanner.nextInt();
		for (StudentDetails studentDetails : list) {
			if(studentDetails.id==id) {
				System.out.println("This id is already exist");
				return ;
			}
		}
		System.out.println("enter the name of the student");
		String name=scanner.next();
		System.out.println("enter the mark of the student");
		float mark=scanner.nextFloat();
		System.out.println("enter the course of the student");
		String course=scanner.next();
		StudentDetails details = new StudentDetails(id, name, mark, course);
		list.add(details);
		System.out.println("Student detail added\n");
	}
}
