package com.tyss.hibernatemapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Apps {
	@Id
	private int id;
	private String appName;
	@ManyToMany
	private List<User> users;
	
	public Apps() {
		super();
	}
	public Apps(int id, String appName, List<User> users) {
		super();
		this.id = id;
		this.appName = appName;
		this.users = users;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
}
