package com.tyss.dependency;

import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class App {
	    public static void main( String[] args )
	    {
	        Employee employee = new Employee();
	        employee.setDesignation("mama");
	        employee.setId(1);
	        employee.setName("senthil");
	        employee.setSalary(2000);
	        employee.setPassword("prathi@12");
	        Address address = new Address("12","south street",613);
	        employee.setAdd(address);
	        try {
				JAXBContext context = JAXBContext.newInstance(Employee.class);
				Marshaller marshaller = context.createMarshaller();
				marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT, true);
				marshaller.marshal(employee,System.out);
				//for write the things in the file 
				//first we have to create the objrct for the file
				FileWriter fileWriter = new FileWriter("emp.xml");
				marshaller.marshal(employee, fileWriter);
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	}