package scaunois.badistick.entity.joueur;

import javax.persistence.Entity;

import scaunois.badistick.entity.classement.ClassementJoueur;

@Entity
public class Joueur {

	protected String nom;
	protected String prenom;
	protected int numeroLicense;
	protected ClassementJoueur classement;

	public Joueur() {
		super();
	}

	public Joueur(String nom, String prenom, ClassementJoueur classement) {
		super();
		this.nom = nom;
		this.prenom = prenom;
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

	public int getNumeroLicense() {
		return numeroLicense;
	}

	public void setNumeroLicense(int numeroLicense) {
		this.numeroLicense = numeroLicense;
	}

	public ClassementJoueur getClassement() {
		return classement;
	}

	public void setClassement(ClassementJoueur classement) {
		this.classement = classement;
	}

	@Override
	public String toString() {
		return "Membre [" + nom + "  " + prenom + "  " + numeroLicense + "  "
				+ classement + "]";
	}

}
