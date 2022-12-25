package tn.iit.request;



public class CreateImpressionRequest {
	
	private Long id;

	private int NbrCopie;

	private String Status;
	
	private String Date;
	
	private String File;

	private Long Id_Ens;

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
