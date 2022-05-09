package com.tyss.springautowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springbyname.xml");
		BoyFriend bean = context.getBean("bf",BoyFriend.class);
		System.out.println(bean);
		BoyFriend bean2 = context.getBean("bf1",BoyFriend.class);
		System.out.println(bean2);
	}
}
