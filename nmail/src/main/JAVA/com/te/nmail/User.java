package com.te.nmail;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@Column(unique = true, nullable = true)
	String username;
	@Column(unique = true, nullable = true)
	String email_id;
	@Column(nullable = true)
	String pass;
	@Column(nullable = true)
	String answer;
	@Column(name = "mail_info", updatable = true)
	@OneToMany(cascade = CascadeType.ALL)
	List<Mail_info> mail;
}
