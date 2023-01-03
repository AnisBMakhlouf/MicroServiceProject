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
	private String Id_Group;
	private Long Id_Subject;
	
	private String Nom_Ens;
	private String Nom_Group;
	private String Nom_Subject;
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
	public String getNom_Group() {
		return Nom_Group;
	}
	public void setNom_Group(String nom_Group) {
		Nom_Group = nom_Group;
	}
	public String getNom_Subject() {
		return Nom_Subject;
	}
	public void setNom_Subject(String nom_Subject) {
		Nom_Subject = nom_Subject;
	}
	public String getNom_Ens() {
		return Nom_Ens;
	}
	public void setNom_Ens(String nom_Ens) {
		Nom_Ens = nom_Ens;
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
