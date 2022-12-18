package tn.iit.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Utilisateurs")
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
	
	@Column(name = "Id_Ens")
	private Long Id_Ens;
	
	
	@Column(name = "Id_Group")
	private Long Id_Group;
	
	@Column(name = "Id_Subject")
	private Long Id_Subject;
}
