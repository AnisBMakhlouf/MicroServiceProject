package tn.iit.response;




public class UserResponse {

	private Long id;

	private String FullName;

	private String Mail;
	
	private String Password;
	
	private String Role;
	
	
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

	public UserResponse(Long id, String fullName, String mail, String password, String role) {
		super();
		this.id = id;
		FullName = fullName;
		Mail = mail;
		Password = password;
		Role = role;
	}

	public UserResponse() {
		super();
		// TODO Auto-generated constructor stub
	}


}
