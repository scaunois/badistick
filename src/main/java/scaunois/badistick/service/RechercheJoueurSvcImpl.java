package scaunois.badistick.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import scaunois.badistick.dao.DAOJoueur;
import scaunois.badistick.entity.joueur.Joueur;

public class RechercheJoueurSvcImpl implements RechercheJoueurSvc {

	@Autowired
	DAOJoueur daoJoueur;

	public List<Joueur> rechercheJoueurs(String nom, String prenom,
			String numeroLicense, String genre, String Classement,
			String ligue, String ville, String sigleClub) {

		if (numeroLicense != null && !numeroLicense.equals("")) {
			return 
		}

	}
}
