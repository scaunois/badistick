
package scaunois.badistick.service.pub;

import java.util.List;

import scaunois.badistick.entity.joueur.Joueur;

public interface RechercheJoueurSvc {

	/**
	 * Cherche un joueur selon les critères choisis (remplis dans le
	 * formulaire). <br/>
	 * Si tous les champs ne sont pas remplis, on ne cherche que selon les
	 * critères qui le sont.
	 * 
	 * @return : la liste des joueurs correspondant à ces critères, vide s'il
	 *         n'y en a pas
	 */
	public List<Joueur> rechercheJoueurs(String nom, String prenom, String license, String genre, String classement, String ligue,
			String ville, String sigleClub);

}
