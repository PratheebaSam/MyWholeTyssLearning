package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Example1 {
	public static void main(String[] args) {
		Employee prathi = new Employee(01,"prathi", "backend developer");
		Employee sam = new Employee(02,"sam", "tester");
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(prathi);
		list.add(sam);
		System.out.println(list);
		Iterator<Employee> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		}
}
