package com.tyss.springininterface;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class BallPen implements Pen{
	public void print() {
		System.out.println("from ball pen");
		
	}

	@Override
	public String toString() {
		return "BallPen [form ball pen]";
	}
	
}
