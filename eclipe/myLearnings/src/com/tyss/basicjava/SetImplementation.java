package com.tyss.basicjava;

import java.util.HashSet;
import java.util.Set;

public class SetImplementation {
	public static void main(String[] args) {
	Set<String> set = new HashSet<String>();
	set.add("prathi");
	set.add("sam");
	for (String string : set) {
		System.out.println(string);
	}
	}
}
