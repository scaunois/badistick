package badistick.dao;

import scaunois.badistick.dao.DAOJoueur;
import scaunois.badistick.dao.DAOJoueurImpl;
import scaunois.badistick.entity.joueur.Joueur;
import scaunois.badistick.entity.joueur.categorie.Categorie;
import scaunois.badistick.entity.joueur.classement.Classement;
import scaunois.badistick.entity.joueur.classement.ClassementJoueur;

public class TestDaoJoueur {

	public static void main(String[] args) {

		Joueur j = new Joueur("caunois", "sébastien", new ClassementJoueur(
				Classement.C4, Classement.D1, Classement.D2), Categorie.SENIOR);

		DAOJoueur daoJoueur = new DAOJoueurImpl();

		daoJoueur.sauvegardeJoueur(j);

		System.out.println("Joueur sauvegardé en base ? --> vérifier la base mysql pour vérifier");

	}

}
