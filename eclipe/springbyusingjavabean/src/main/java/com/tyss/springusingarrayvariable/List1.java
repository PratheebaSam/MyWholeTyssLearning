package com.tyss.springusingarrayvariable;

import java.awt.List;
import java.util.Arrays;

import org.springframework.context.annotation.Configuration;

public class List1 {
	private String a[];

	public List1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List1(String[] a) {
		super();
		this.a = a;
	}

	public String[] getA() {
		return a;
	}

	public void setA(String[] a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "List1 [a=" + Arrays.toString(a) + "]";
	}
	
}
