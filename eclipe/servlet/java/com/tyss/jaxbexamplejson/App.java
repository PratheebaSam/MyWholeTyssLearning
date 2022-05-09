package com.tyss.jaxbexamplejson;

import java.io.FileWriter;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	Employee employee = new Employee();
        employee.setDesignation("mama");
        employee.setId(1);
        employee.setName("senthil");
        
        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter().writeValue(new FileWriter("emp.json"), employee);
        String asString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
		System.out.println(asString);
        
    }
}
