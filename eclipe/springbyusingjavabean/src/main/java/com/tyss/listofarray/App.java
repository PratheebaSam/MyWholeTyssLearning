package com.tyss.listofarray;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.tyss.listofarray"})
public class App {
	@Bean
	public List<String> listName() {		
		return Arrays.asList("Prathi","Sam","Raji");
	}
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		List1 bean = context.getBean(List1.class);
		System.out.println(bean);
		
	}
}
