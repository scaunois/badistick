
package scaunois.badistick.dao.pub;

import scaunois.badistick.entity.joueur.Joueur;

public interface DAOJoueur {

	public Joueur chercheJoueurParLicense(String license);

	// public Joueur chercheJoueurParNom(String nom);

	// public Joueur chercheJoueurParPrenom(String prenom);

	public void sauvegardeJoueur(Joueur joueur);

}
