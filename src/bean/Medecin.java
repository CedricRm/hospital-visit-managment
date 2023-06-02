package bean;

public class Medecin {
	private String codemed;
	private String Nom;
	private String Prenom;
	private String Grade;
	
	public Medecin(String codemed, String nom, String prenom, String grade) {
		super();
		this.codemed = codemed;
		Nom = nom;
		Prenom = prenom;
		Grade = grade;
	}
	
	public String getCodemed() {
		return codemed;
	}
	public void setCodemed(String codemed) {
		this.codemed = codemed;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	
	@Override
	public String toString() {
		return "Medecin [codemed=" + codemed + ", Nom=" + Nom + ", Prenom=" + Prenom + ", Grade=" + Grade + "]";
	}
	
}
