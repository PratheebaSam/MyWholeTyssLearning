package com.tyss.javalearning;

public class MultilevelCompany extends MultilevelProjectLead{
	int numOfEmployee;
	
	public void takingProjects() {
		System.out.println("picking the projects from the company");
	}
	public void givingProject(int num) {
		System.out.println("giving to team"+num);
	}

}
