package com.SPABackend.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	@Column(name = "username")
	private String userName;
	@Column(name = "website")
	private String webSite;
	@Column(name = "phonenumber")
	private String phoneNumber;
	
	

}
