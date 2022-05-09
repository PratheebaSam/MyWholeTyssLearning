package com.tyss.json;

import java.io.FileWriter;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
	public static void main(String[] args) throws IOException {
		Employee employee = new Employee();
		employee.setId(01);
		employee.setName("prathi");
		employee.setDesig("dev");
		ObjectMapper mapper = new ObjectMapper();
		
		//writewithdefaultprettyprinter --formatting
		
		
		FileWriter writer = new FileWriter("emp.json");
		mapper.writeValue(writer, employee);
	}
}
