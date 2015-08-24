
package scaunois.badistick.entity.joueur;

import javax.persistence.Entity;
import javax.persistence.Id;

import scaunois.badistick.entity.club.Club;
import scaunois.badistick.entity.joueur.categorie.Categorie;
import scaunois.badistick.entity.joueur.classement.ClassementJoueur;

@Entity
public class Joueur {

	@Id
	long id;
	protected String nom;
	protected String prenom;
	protected String license;
	protected Club club;
	protected ClassementJoueur classement;
	protected Categorie categorie;

	public Joueur() {
		super();
	}

	public Joueur(String nom, String prenom, String license, Club club, ClassementJoueur classement, Categorie categorie) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.license = license;
		this.club = club;
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

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
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
		return "Membre [" + nom + "  " + prenom + "  " + license + "  " + classement + "]";
	}

}
