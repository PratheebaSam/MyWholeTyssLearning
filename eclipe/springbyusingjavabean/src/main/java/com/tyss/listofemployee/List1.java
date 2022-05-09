package com.tyss.listofemployee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class List1 {
	@Autowired
	private List<Employee> name;

	public List1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List1(List<Employee> name) {
		super();
		this.name = name;
	}

	public List<Employee> getName() {
		return name;
	}

	public void setName(List<Employee> name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "List1 [name=" + name + "]";
	}
	
}
