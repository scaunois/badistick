package scaunois.badistick.dao;

import scaunois.badistick.entity.joueur.Joueur;

public interface DAOJoueur {

	// public Joueur chercheJoueurParNom(String nom);
	//
	// public Joueur chercheJoueurParPrenom(String prenom);
	//
	// public Joueur chercheJoueurParNumeroLicense(int numeroLicense);

	public void sauvegardeJoueur(Joueur joueur);

}
