package com.tyss.listofemployee;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.tyss.listofemployee"})
public class App {
	@Bean
	public List<Employee> setemp() {
		Employee employee = new Employee(01,"prathi","developer");
		Employee employee2 = new Employee(02, "sam", "tester");
		return Arrays.asList(employee,employee2);		
	}
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		List1 bean = context.getBean(List1.class);
		System.out.println(bean);
	}
}
