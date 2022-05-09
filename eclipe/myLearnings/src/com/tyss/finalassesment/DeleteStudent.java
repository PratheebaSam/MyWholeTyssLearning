package com.tyss.finalassesment;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteStudent {
	public void deleteList(ArrayList<StudentDetails> list,Scanner scanner) throws Exception{
		if(list.isEmpty()) {
			System.out.println("your list is empty");
			return ;
		}
		System.out.println("enter the id");
		int id=scanner.nextInt();
		int y=0;
		for (StudentDetails studentDetails : list) {
			if(id==studentDetails.id) {
				list.remove(studentDetails);
				System.out.println("The particular student detail deleted");
				y++;
				break;
			}
		}
		if(y==0) {
			System.out.println("This id is not present in the list");
		}				
	}
}
