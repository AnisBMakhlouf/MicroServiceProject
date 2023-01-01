package tn.iit.response;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import tn.iit.entity.Impression;

public class ImpressionResponse {
	
	private Long id;

	private int NbrCopie;

	private String Status;
	
	private String Date;
	
	private String File;

	private Long Id_Ens;
	private Long Id_Group;
	
	private Long Id_Subject;
	public ImpressionResponse(Impression impression) {
	
		this.id = impression.getId();
		this.NbrCopie = impression.getNbrCopie();
		this.Status = impression.getStatus();
		this.Date = impression.getDate();
		this.File = impression.getFile();
		this.Id_Ens= impression.getId_Ens();
		this.Id_Group = impression.getId_Group();
		this.Id_Subject= impression.getId_Subject();
		
	}
	public Long getId_Group() {
		return Id_Group;
	}
	public void setId_Group(Long id_Group) {
		Id_Group = id_Group;
	}
	public Long getId_Subject() {
		return Id_Subject;
	}
	public void setId_Subject(Long id_Subject) {
		Id_Subject = id_Subject;
	}
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

}
