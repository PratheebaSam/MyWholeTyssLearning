package com.tyss.finalassesment;

import java.util.ArrayList;
import java.util.Scanner;

public class EditDetails {
	public static void edit(ArrayList<StudentDetails> list,int id,String name) throws Exception{
		int y=0;
		for (StudentDetails studentDetails : list) {
			if(studentDetails.id==id) {
				studentDetails.name=name;
				y++;
			}
		}
		if(y==0) {
			System.out.println("This id is not present in the list");
		}
	}
	public static void edit(ArrayList<StudentDetails> list,int id,float mark) throws Exception{
		int y=0;
		for (StudentDetails studentDetails : list) {
			if(studentDetails.id==id) {
				studentDetails.mark=mark;
				y++;
			}
		}
		if(y==0) {
			System.out.println("This id is not present in the list");
		}
	}	
	public void editDetails(ArrayList<StudentDetails> list,Scanner scanner) throws Exception{
		if(list.isEmpty()) {
			System.out.println("your list is empty");
			return ;
		}
		System.out.println("enter the id of the student");
		int id=scanner.nextInt();
		System.out.println("enter the option\n 1.Name\n 2.mark\n 3.course");
		int value=scanner.nextInt();
		switch (value) {
		case 1:			
			System.out.println("enter the name");
			String name=scanner.next();
			EditDetails.edit(list, id, name);
			System.out.println("successfully edited");
			break;
		case 2:
			System.out.println("enter the mark");
			float mark=scanner.nextFloat();
			EditDetails.edit(list, id, mark);
			System.out.println("successfully edited");
			break;
		case 3:
			System.out.println("enter the course");
			String course=scanner.next();
			int y=0;
			for (StudentDetails str :list) {
				if(id==str.id) {
					str.course=course;
					y++;
				}
			}if(y==0) {
				System.out.println("This id is not present in the list");
			}
			System.out.println("successfully edited");
			break;
		}
	}
}
