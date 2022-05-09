package com.tyss.springininterface;

import org.springframework.stereotype.Component;

@Component
public class InkPen implements Pen{
	public void print() {
		System.out.println("from ink pen");
		
	}

	@Override
	public String toString() {
		return "InkPen [from ink pen]";
	}
	
}
