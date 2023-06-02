package bean;

public class Patient {
	private String codepat;
	private String Nom;
	private String Prenom;
	private String Sexe;
	private String Adresse;
	
	public Patient(String codepat, String nom, String prenom, String sexe, String adresse) {
		super();
		this.codepat = codepat;
		Nom = nom;
		Prenom = prenom;
		Sexe = sexe;
		Adresse = adresse;
	}
	
	public String getCodepat() {
		return codepat;
	}
	public void setCodepat(String codepat) {
		this.codepat = codepat;
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
	public String getSexe() {
		return Sexe;
	}
	public void setSexe(String sexe) {
		Sexe = sexe;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	
	@Override
	public String toString() {
		return "Patient [codepat=" + codepat + ", Nom=" + Nom + ", Prenom=" + Prenom + ", Sexe=" + Sexe + ", Adresse="
				+ Adresse + "]";
	}	
}
