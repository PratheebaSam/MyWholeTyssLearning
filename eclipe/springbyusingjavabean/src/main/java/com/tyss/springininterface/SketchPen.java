package com.tyss.springininterface;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class SketchPen implements Pen{

	public void print() {
		System.out.println("from setch pen");
		
	}

	@Override
	public String toString() {
		return "SketchPen [from sketch pen]";
	}
	
	
}
