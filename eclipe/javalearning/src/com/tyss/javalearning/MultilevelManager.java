package com.tyss.javalearning;

public class MultilevelManager {
	public static void main(String[] args) {
		MultilevelCompany Company = new MultilevelCompany();
		Company.numOfEmployee=20;
		System.out.println(Company.numOfEmployee);
		Company.sprintPlan("prathi");
		Company.projectName="StoreO247";
		System.out.println(Company.projectName);
	}
}
