
package scaunois.badistick.entity.membre;

import javax.persistence.Entity;

import scaunois.badistick.entity.joueur.Joueur;

@Entity
public class Membre extends Joueur {

	protected String email;
	protected String pseudo;
	protected String password;
	protected int numeroLicense; // reprend la license si c'est un joueur, 0 sinon

	public Membre() {
		super();
	}

	public Membre(String email, String pseudo, String password) {
		super();
		this.email = email;
		this.pseudo = pseudo;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
