package scaunois.badistick.service;

import java.util.List;

import scaunois.badistick.entity.joueur.Joueur;

public interface RechercheJoueurSvc {

	/**
	 * Cherche un joueur selon les crit�res choisis (remplis dans le
	 * formulaire). <br/>
	 * Si tous les champs ne sont pas remplis, on ne cherche que selon les
	 * crit�res qui le sont.
	 * 
	 * 
	 * @param nom
	 * @param prenom
	 * @param numeroLicense
	 * @param genre
	 * @param Classement
	 * @param ligue
	 * @param ville
	 * @param sigleClub
	 * @return : la liste des joueurs correspondant � ces crit�res, vide s'il
	 *         n'y en a pas
	 */
	public List<Joueur> rechercheJoueurs(String nom, String prenom,
			String numeroLicense, String genre, String Classement,
			String ligue, String ville, String sigleClub);

}
