package com.tyss.employee;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the option \n 1.Register \n 2.login");
       int x=scanner.nextInt();
       switch(x) {
       case 1:
       {
    	 Register register = new Register();
    	 register.register(scanner);
    	 break;
       }
       case 2:
       {
    	   Login login = new Login();
    	   login.login(scanner);
    	   break;
       }
       case 3:
       {
    	   System.out.println("Enter the correct value");
    	   break;
       }
       }
      
    }
}
