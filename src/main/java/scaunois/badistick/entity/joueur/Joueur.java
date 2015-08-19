package scaunois.badistick.entity.joueur;

import javax.persistence.Entity;

import scaunois.badistick.entity.joueur.categorie.Categorie;
import scaunois.badistick.entity.joueur.classement.ClassementJoueur;

@Entity
public class Joueur {

	protected String nom;
	protected String prenom;
	protected int numeroLicense;
	protected ClassementJoueur classement;
	protected Categorie categorie;

	public Joueur() {
		super();
	}

	public Joueur(String nom, String prenom, ClassementJoueur classement, Categorie categorie) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.classement = classement;
		this.categorie = categorie;
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

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "Membre [" + nom + "  " + prenom + "  " + numeroLicense + "  " + classement + "]";
	}

}
