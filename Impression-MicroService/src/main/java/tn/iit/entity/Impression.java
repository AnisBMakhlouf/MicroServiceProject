package tn.iit.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "Impression")
public class Impression {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "NbrCopie")
	private int NbrCopie;

	@Column(name = "Statuts")
	private String Status;
	
	@Column(name = "Date")
	private String Date;
	
	@Column(name = "File")
	private String File;
	
	@Lob
	@Column(name = "FileContent")
	private byte[] FileContent;
	
	@Column(name = "Id_Ens")
	private Long Id_Ens;

	@Column(name = "Id_Group")
	private String Id_Group;
	
	@Column(name = "Id_Subject")
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
