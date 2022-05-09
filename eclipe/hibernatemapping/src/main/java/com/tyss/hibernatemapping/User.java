package com.tyss.hibernatemapping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String mailid;
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Apps> apps;
	
	public User() {
		super();
	}
	public User(int id, String name, String mailid, List<Apps> apps) {
		super();
		this.id = id;
		this.name = name;
		this.mailid = mailid;
		this.apps = apps;
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
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public List<Apps> getApps() {
		return apps;
	}
	public void setApps(List<Apps> apps) {
		this.apps = apps;
	}
	
}
