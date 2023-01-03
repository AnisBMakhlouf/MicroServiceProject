package tn.iit.request;

import javax.persistence.Column;

public class CreateImpressionRequest {
	
	private Long id;

	private int NbrCopie;

	private String Status;
	
	private String Date;
	
	private String File;
	
	private Long Id_Ens;

	private String Id_Group;
	
	private Long Id_Subject;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNbrCopie() {
		return NbrCopie;
	}

	public void setNbrCopie(int nbrCopie) {
		NbrCopie = nbrCopie;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getFile() {
		return File;
	}

	public void setFile(String file) {
		File = file;
	}

	public Long getId_Ens() {
		return Id_Ens;
	}

	public void setId_Ens(Long id_Ens) {
		Id_Ens = id_Ens;
	}

	public String getId_Group() {
		return Id_Group;
	}

	public void setId_Group(String id_Group) {
		Id_Group = id_Group;
	}

	public Long getId_Subject() {
		return Id_Subject;
	}

	public void setId_Subject(Long id_Subject) {
		Id_Subject = id_Subject;
	}
	
	
}
