package com.tyss.finalassesment;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class SchoolFunctionalites {
	static int x=0;	
	public static void main(String[] args){	
		try {
			ArrayList<StudentDetails> list = new ArrayList<>();	
			AddStudent student = new AddStudent();
			EditDetails details = new EditDetails();
			DeleteStudent deleteStudent = new DeleteStudent();
			StudentList studentList = new StudentList();
			GetStudent getStudent = new GetStudent();
			Sort sort = new Sort();
			do {
				System.out.println("Enter the number of the function you want to proceed\n 1.Add student\n 2.Edit student\n 3.Delete student\n 4.List of the students\n 5.Get student details\n 6.Sort the students list\n 7.Exit");
				Scanner scanner = new Scanner(System.in);
				x=scanner.nextInt();
				switch (x) {
				case 1:
					student.addStudent(list, scanner);
					break;
				case 2:
					details.editDetails(list, scanner);
					break;
				case 3:
					deleteStudent.deleteList(list, scanner);
					break;
				case 4:	
					studentList.printList(list);
					break;
				case 5:
					getStudent.getStudent(list, scanner);
					break;
				case 6:
					sort.sort(list, scanner);
					break;
				case 7:
					break;
				default:
					System.out.println("Please enter the valid number");
					break;
				}				
			}while(x!=7);
		}catch(InputMismatchException mismatch) {
			System.out.println("your input is mismatched");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
