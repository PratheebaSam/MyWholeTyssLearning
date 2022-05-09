package com.tyss.finalassesment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sort {
	public void sort(ArrayList<StudentDetails> list,Scanner scanner) throws Exception{
		if(list.isEmpty()) {
			System.out.println("your list is empty");
			return;	
		}
		System.out.println("enter the option\n 1.id\n 2.name\n 3.mark");
		int input=scanner.nextInt();
		switch (input) {
		case 1:
			SortById byId = new SortById();
			Collections.sort(list, byId);
			break;
		case 2:
			SortByName byName = new SortByName();
			Collections.sort(list, byName);
			break;
		case 3:
			SortByMark byMark = new SortByMark();
			Collections.sort(list, byMark);
			break;
		}
		System.out.println("List of the students are sorted");		
	}
}
