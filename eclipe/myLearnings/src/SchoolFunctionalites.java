
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;
public class SchoolFunctionalites {
	static int x=0;
	
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
	
	// method for ADD STUDENT
	public void addStudent(ArrayList<StudentDetails> list,int id,String name,float mark,String course)throws Exception {
		StudentDetails details = new StudentDetails(id, name, mark, course);
		list.add(details);
		System.out.println("Student detail added\n");
	}
	
	//method for PRINT THE STUDENT LIST
	public void printList(ArrayList<StudentDetails> list) throws 		Exception{
		System.out.println("list of the Students\n");
			for (StudentDetails studentDetails : list) {
				System.out.println(studentDetails);
			}
	}
	
	//method for DELETE THE PARTICULAR STUTDENT DETAIL BY USING ID
	public ArrayList<StudentDetails> deleteList(ArrayList<StudentDetails> list,int id) throws Exception{
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
		return list;		
	}
	
	//method for GETTING PARTICULAR STUDENT DETAIL BY USING ID
	public void getStudent(ArrayList<StudentDetails> list,int id) throws Exception{
		int y=0;
			for (StudentDetails studentDetails : list) {
				if(id==studentDetails.id) {
					System.out.println("The student detail\n"+studentDetails);
					y=1;
				}
			}
			if(y==0) {
				System.out.println("This id is not present in the list");
		}				
	}
	
	//method for EDITING THE DETAILS OF STUDENTS BY USING ID
	public void editDetails(ArrayList<StudentDetails> list,int id,int value) throws Exception{
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		switch (value) {
		case 1:			
			System.out.println("enter the name");
			String name=scanner.next();
			SchoolFunctionalites.edit(list, id, name);
			System.out.println("successfully edited");
			break;
		case 2:
			System.out.println("enter the mark");
			float mark=scanner.nextFloat();
			SchoolFunctionalites.edit(list, id, mark);
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
	
	//method for SORTING THE STUDENT LIST EITHER BY ID OR NAME OR MARKS
	public void sort(ArrayList<StudentDetails> list,int input) throws Exception{
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
	
	public static void main(String[] args){	
		SchoolFunctionalites functionalites = new SchoolFunctionalites();
		try {
			ArrayList<StudentDetails> list = new ArrayList<>();			
			do {
				System.out.println("Enter the number of the function you want to proceed\n 1.Add student\n 2.Edit student\n 3.Delete student\n 4.List of the students\n 5.Get student details\n 6.Sort the students list\n 7.Exit");
				@SuppressWarnings("resource")
				Scanner scanner = new Scanner(System.in);
				x=scanner.nextInt();
				switch (x) {
				case 1:
					System.out.println("enter the id of the student");
					int id=scanner.nextInt();
					System.out.println("enter the name of the student");
					String name=scanner.next();
					System.out.println("enter the mark of the student");
					float mark=scanner.nextFloat();
					System.out.println("enter the course of the student");
					String course=scanner.next();
					functionalites.addStudent(list, id, name, mark, course);
					break;
				case 2:
					if(list.isEmpty()) {
						System.out.println("your list is empty");
						break;
					}
					System.out.println("enter the id of the student");
					int e=scanner.nextInt();
					System.out.println("enter the option\n 1.Name\n 2.mark\n 3.course");
					int f=scanner.nextInt();
					functionalites.editDetails(list, e, f);
					break;
				case 3:
					if(list.isEmpty()) {
						System.out.println("your list is empty");
						break;
					}
					System.out.println("enter the id");
					int info=scanner.nextInt();
					functionalites.deleteList(list, info);
					break;
				case 4:	
					if(list.isEmpty()) {
						System.out.println("your list is empty");
						break;
					}
					functionalites.printList(list);
					break;
				case 5:
					if(list.isEmpty()) {
						System.out.println("your list is empty");
						break;
					}
					System.out.println("enter the id");
					int j=scanner.nextInt();
					functionalites.getStudent(list, j);
					break;
				case 6:
					if(list.isEmpty()) {
						System.out.println("your list is empty");
						break;
					}
					System.out.println("enter the option\n 1.id\n 2.name\n 3.mark");
					int input=scanner.nextInt();
					functionalites.sort(list, input);
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
