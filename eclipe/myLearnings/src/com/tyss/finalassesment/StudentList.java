package com.tyss.finalassesment;

import java.util.ArrayList;

public class StudentList {
	public void printList(ArrayList<StudentDetails> list) throws Exception{
		if(list.isEmpty()) {
			System.out.println("your list is empty");
			return ;
		}
		System.out.println("list of the Students\n");
		for (StudentDetails studentDetails : list) {
			System.out.println(studentDetails);
		}
	}
}