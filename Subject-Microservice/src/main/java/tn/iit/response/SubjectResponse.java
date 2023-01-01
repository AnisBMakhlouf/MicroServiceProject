package tn.iit.response;

import tn.iit.entity.Subject;

public class SubjectResponse {
	
	private Long id;

	private String SubjectName;

	private String Id_Group;
	
	private String Id_Ens;
	
	public SubjectResponse(Subject subject) {
		this.id =subject.getId();
		this.SubjectName = subject.getSubjectName();
		this.Id_Group = subject.getId_Group();
		this.Id_Ens = subject.getId_Ens();
	}

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
}
