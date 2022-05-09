package com.tyss.springusingarrayvariable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		List1 bean = context.getBean(List1.class);
		System.out.println(bean);
	}
}