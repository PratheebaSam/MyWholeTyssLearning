package com.tyss.springininterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.tyss.springininterface"})
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
//		Pen bean = context.getBean(BallPen.class);
//		System.out.println(bean);
//		bean.print();
//		Pen bean2 = context.getBean(InkPen.class);
//		System.out.println(bean2);
//		bean2.print();
//		Pen bean3 = context.getBean(SketchPen.class);
//		System.out.println(bean3);
//		bean3.print();
		BookStall bean4 = context.getBean(BookStall.class);
		System.out.println(bean4);
		
		
		
	}
}
