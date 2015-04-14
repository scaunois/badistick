package scaunois.badistick.entity.membre;

import scaunois.badistick.entity.classement.Classement;

public class Membre {

	protected String nom;
	protected String prenom;
	protected String email;
	protected Classement classement;
	
	public Membre() {
		super();
	}

	public Membre(String nom, String prenom, String email, Classement classement) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.classement = classement;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Classement getClassement() {
		return classement;
	}

	

	
	public void setClassement(Classement classement) {
		this.classement = classement;
	}

	@Override
	public String toString() {
		return "Membre [nom=" + nom + ", prenom=" + prenom + ", email=" + email
				+ ", classement=" + classement + "]";
	}

}
