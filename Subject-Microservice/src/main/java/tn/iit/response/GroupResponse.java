package tn.iit.response;



public class GroupResponse {

	private Long id;

	private String GroupName;
	
	private Long StudentNB;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGroupName() {
		return GroupName;
	}

	public void setGroupName(String groupName) {
		GroupName = groupName;
	}

	public Long getStudentNB() {
		return StudentNB;
	}

	public void setStudentNB(Long studentNB) {
		StudentNB = studentNB;
	}



}
