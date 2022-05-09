package com.te.nmail;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Mail_info {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id; 
	int from_id;
	int to_id;
	String subject;
	String message;
	String status;

}
