package tn.iit.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Subjects")
public class Subject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "SubjectName")
	private String SubjectName;

	@Column(name = "Id_Group")
	private String Id_Group;
	
	@Column(name = "Id_Ens")
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
	
}
