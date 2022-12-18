package tn.iit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "FullName")
	private String FullName;

	@Column(name = "Mail")
	private String Mail;
	
	@Column(name = "Password")
	private String Password;
	
	@Column(name = "Role")
	private String Role;
}
