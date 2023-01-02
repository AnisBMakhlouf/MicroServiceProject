package tn.iit.request;

import javax.persistence.Column;

public class CreateSubjectRequest {

	private Long id;

	private String SubjectName;

	private String Id_Group;
	
	private String Id_Ens;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubjectName() {
		return SubjectName;
	}

	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}

	public String getId_Group() {
		return Id_Group;
	}

	public void setId_Group(String id_Group) {
		Id_Group = id_Group;
	}

	public String getId_Ens() {
		return Id_Ens;
	}

	public void setId_Ens(String id_Ens) {
		Id_Ens = id_Ens;
	}

	public CreateSubjectRequest(Long id, String subjectName, String id_Group, String id_Ens) {
		super();
		this.id = id;
		SubjectName = subjectName;
		Id_Group = id_Group;
		Id_Ens = id_Ens;
	}

	public CreateSubjectRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
