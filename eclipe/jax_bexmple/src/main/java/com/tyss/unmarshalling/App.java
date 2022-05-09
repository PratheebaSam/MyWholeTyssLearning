package com.tyss.unmarshalling;

import java.io.FileReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class App {
	public static void main(String[] args) {
		try {
			JAXBContext context = JAXBContext.newInstance(Employee.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			FileReader reader = new FileReader("emp.xml");
			Object object = unmarshaller.unmarshal(reader);
			System.out.println(object);
			Employee e=(Employee) object;
			System.out.println(e.getDesignation());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
