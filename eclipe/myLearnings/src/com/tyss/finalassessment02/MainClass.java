package com.tyss.finalassessment02;

import java.util.ArrayList;
import java.util.Scanner;
import com.tyss.finalassesment.StudentDetails;

public class MainClass {
	public static void main(String[] args) {
		try {
			int x;
			ArrayList<StudentDetails> list = new ArrayList<>();
			do {
				System.out.println("Enter the number of the function you want to proceed\n 1.Add student\n 2.Edit student\n 3.Delete student\n 4.List of the students\n 5.Get student details\n 6.Sort the students list\n 7.Exit");
				@SuppressWarnings("resource")
				Scanner scanner = new Scanner(System.in);
				x=scanner.nextInt();
				switch (x) {
				case 1:
					AddStudent student = new AddStudent();
					
					break;
				case 2:
					break;
				case 3:
					
					break;
				case 4:
					System.out.println("list of the students");					
					for (Object object : list) {
						System.out.println(object);
					}					
										
					break;
				case 5:
					
					break;
				case 6:
					break;
				case 7:
					break;
				default:
					break;
				}			
				
			}while(x!=7);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
