package com.tyss.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students {
	@Id
	int id;
	@Column(name="full_name",nullable=false,length=30)
	String name;
	int mark;
	public Students() {
		super();
	}
	public Students(int id, String name, int mark) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", mark=" + mark + "]";
	}
	
}
