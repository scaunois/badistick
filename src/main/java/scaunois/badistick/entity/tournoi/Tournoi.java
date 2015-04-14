package scaunois.badistick.entity.tournoi;

import java.util.Date;
import java.util.List;

import scaunois.badistick.entity.joueur.Joueur;

public class Tournoi {

	protected String nomTournoi;
	protected Date[] dateTournoi = new Date[2];
	protected int nombreMaxInscrits;
	protected List<Joueur> joueursInscrits;
	protected List<Joueur> joueursConvoques;

	public Tournoi() {
		super();
	}

	public Tournoi(String nomTournoi, Date[] dateTournoi,
			int nombreMaxInscrits, List<Joueur> joueursInscrits,
			List<Joueur> joueursConvoques) {
		super();
		this.nomTournoi = nomTournoi;
		this.dateTournoi = dateTournoi;
		this.nombreMaxInscrits = nombreMaxInscrits;
		this.joueursInscrits = joueursInscrits;
		this.joueursConvoques = joueursConvoques;
	}

	public String getNomTournoi() {
		return nomTournoi;
	}

	public void setNomTournoi(String nomTournoi) {
		this.nomTournoi = nomTournoi;
	}

	public Date[] getDateTournoi() {
		return dateTournoi;
	}

	public void setDateTournoi(Date[] dateTournoi) {
		this.dateTournoi = dateTournoi;
	}

	public int getNombreMaxInscrits() {
		return nombreMaxInscrits;
	}

	public void setNombreMaxInscrits(int nombreMaxInscrits) {
		this.nombreMaxInscrits = nombreMaxInscrits;
	}

	public List<Joueur> getJoueursInscrits() {
		return joueursInscrits;
	}

	public void setJoueursInscrits(List<Joueur> joueursInscrits) {
		this.joueursInscrits = joueursInscrits;
	}

	public List<Joueur> getJoueursConvoques() {
		return joueursConvoques;
	}

	public void setJoueursConvoques(List<Joueur> joueursConvoques) {
		this.joueursConvoques = joueursConvoques;
	}

}
