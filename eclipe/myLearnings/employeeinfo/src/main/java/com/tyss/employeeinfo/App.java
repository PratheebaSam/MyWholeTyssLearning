package com.tyss.employeeinfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class App 
{
	public static void main( String[] args ) 
    {
		try {
       Scanner scanner = new Scanner(System.in);
       Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_DB","root","Onebill@2020");
       System.out.println("Enter the option \n 1.Register \n 2.login");
       int x=scanner.nextInt();
       switch(x) {
       case 1:
       {
    	 Register register = new Register();
    	 register.register(scanner,connection);
    	 break;
       }
       case 2:
       {
    	   Login login = new Login();
    	   login.login(scanner,connection);
    	   break;
       }
       case 3:
       {
    	   System.out.println("Please enter the correct option");
    	   break;
       }
       }
		}catch(Exception err) {
			System.out.println(err);
		}
		System.out.println("Welcome again!!!");
}
}
