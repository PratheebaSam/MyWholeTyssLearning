package com.tyss.springininterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BookStall {
	@Autowired
	@Qualifier
	private Pen pen;

	@Override
	public String toString() {
		return "BookStall [pen=" + pen + "]";
	}
	
}
