package com.tyss.javalearning;

public class MultilevelProjectLead extends MultilevelProject{
	public void assigningTask(String task) {
		System.out.println("assigning task to "+task);
	}
	public void sprintPlan(String p) {
		System.out.println("Sprint Planning");
		assigningTask(p);
	}
}