package com.tyss.finalassesment;

public class StudentDetails {
	int id;
	String name;
	float mark;
	String course;
	public StudentDetails(int id, String name, float mark, String course) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
		this.course = course;
	}
	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", name=" + name + ", mark=" + mark + ", course=" + course + "]";
	}
}
