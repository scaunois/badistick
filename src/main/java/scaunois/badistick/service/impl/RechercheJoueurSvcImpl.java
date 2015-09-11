package scaunois.badistick.service.impl;

import java.util.ArrayList;
import java.util.List;

import scaunois.badistick.dao.pub.DAOJoueur;
import scaunois.badistick.entity.joueur.Joueur;
import scaunois.badistick.service.pub.RechercheJoueurSvc;

public class RechercheJoueurSvcImpl implements RechercheJoueurSvc {

	DAOJoueur daoJoueur;

	// renvoie une liste contenant un ou plusieurs Joueur, ou bien une liste vide si aucun résultat
	public List<Joueur> rechercheJoueurs(String nom, String prenom, String license, String genre, String classement,
			String ligue, String ville, String sigleClub) {

		List<Joueur> joueursTrouves = new ArrayList<Joueur>();

		// si un numero de license est indiqué
		if (!license.trim().equals("")) {
			Joueur joueurUnique = daoJoueur.chercheJoueurParLicense(license);
			if (joueurUnique != null) {
				joueursTrouves.add(joueurUnique);
			}
		}

		else {

		}

		return joueursTrouves;

	}

}
