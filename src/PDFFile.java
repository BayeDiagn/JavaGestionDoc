

public class PDFFile {
	
	private String cours;
	private String annee;
	private String chemin;
	
	public PDFFile(String cours,String annee,String chemin) {
		super();
		this.cours = cours;
		this.annee=annee;
		this.chemin=chemin;
	}
	public String getCours() {
		return cours;
	}
	public String getAnnee() {
		return annee;
	}
	public void setAnnee(String annee) {
		this.annee = annee;
	}
	public String getChemin() {
		return chemin;
	}


	public void setChemin(String chemin) {
		this.chemin = chemin;
	}


	public void setCours(String cours) {
		this.cours = cours;
	}
		

}
