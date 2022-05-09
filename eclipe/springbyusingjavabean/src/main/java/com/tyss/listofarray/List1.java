package com.tyss.listofarray;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class List1 {
	@Autowired
	private List<String> name;
	
	
	public List1() {
		super();
	}


	public List1(List<String> name) {
		super();
		this.name = name;
	}


	public List<String> getName() {
		return name;
	}


	public void setName(List<String> name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "List1 [name=" + name + "]";
	}
	
}
