package tn.iit.response;

import tn.iit.entity.User;


public class UserResponse {

	private Long id;

	private String FullName;

	private String Mail;
	
	private String Password;
	
	private String Role;
	
	public UserResponse(User user) {
		this.id =user.getId();
		this.FullName = user.getFullName();
		this.Mail = user.getMail();
		this.Password = user.getPassword();
		this.Role = user.getRole();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public String getMail() {
		return Mail;
	}

	public void setMail(String mail) {
		Mail = mail;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}


}
