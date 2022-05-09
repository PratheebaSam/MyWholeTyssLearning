package com.tyss.basicjava;

import java.util.HashMap;
import java.util.Set;

public class Map {
	public static void main(String[] args) {
		HashMap<Object, Object> map = new HashMap<>();
		map.put(1, "prathi");
		map.put(2, "sam");
		System.out.println(map.get(1));
		Set<Object> set = map.keySet();
		for (Object object : set) {
			System.out.println(object+" : "+map.get(object));
		}		
	}
}
