package scaunois.badistick.entity.club;

import java.util.List;

import scaunois.badistick.entity.joueur.Joueur;

public class Club {

	long id;
	protected String nomClub;
	protected String sigle;
	protected String ville;
	protected String ligue;
	protected List<Joueur> joueurs;

	public Club() {
	}

	public Club(String nomClub, String sigle, String ville, String ligue, List<Joueur> joueurs) {
		super();
		this.nomClub = nomClub;
		this.sigle = sigle;
		this.ville = ville;
		this.ligue = ligue;
		this.joueurs = joueurs;
	}

}
