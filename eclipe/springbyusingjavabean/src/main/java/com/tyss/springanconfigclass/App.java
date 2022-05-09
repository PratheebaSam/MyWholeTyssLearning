package com.tyss.springanconfigclass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MobilConfig.class);
		Mobile bean = context.getBean(Mobile.class);
		System.out.println(bean);
	}
}
