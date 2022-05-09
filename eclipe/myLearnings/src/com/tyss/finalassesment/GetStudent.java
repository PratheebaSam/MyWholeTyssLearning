package com.tyss.finalassesment;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStudent {
	public void getStudent(ArrayList<StudentDetails> list,Scanner scanner) throws Exception{
		if(list.isEmpty()) {
			System.out.println("your list is empty");
			return;
		}
		System.out.println("enter the id");
		int id=scanner.nextInt();
		int y=0;
		for (StudentDetails studentDetails : list) {
			if(id==studentDetails.id) {
				System.out.println("The student detail\n"+studentDetails);
				y++;
			}
		}
		if(y==0) {
			System.out.println("This id is not present in the list");
		}				
	}
}
