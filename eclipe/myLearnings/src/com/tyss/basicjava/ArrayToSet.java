package com.tyss.basicjava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayToSet {
	public static void main(String[] args) {
		Integer[] a= {99,77,66,45,87};
		Integer[] b= {33,66,77,98,90};
		Set<Integer> set1 = new HashSet<Integer>();
		set1.addAll(Arrays.asList(a));
		Set<Integer> set2 = new HashSet<Integer>();
		set2.addAll(Arrays.asList(b));
	}
}