package scaunois.badistick.dao.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import scaunois.badistick.dao.pub.DAOJoueur;
import scaunois.badistick.entity.joueur.Joueur;

@Stateless
public class DAOJoueurImpl implements DAOJoueur {

	@PersistenceContext(unitName = "badistick")
	EntityManager entityManager;

	/**
	 * Renvoie le Joueur trouvé ou null
	 */
	public Joueur chercheJoueurParLicense(String license) {

		Query query = entityManager.createQuery("FROM Joueur WHERE license = :license");
		query.setParameter(1, license);
		try {
			return (Joueur) query.getSingleResult();
		} catch (Exception e) {
			return null;
		}

	}

	public Joueur chercheJoueurParNom(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	public Joueur chercheJoueurParPrenom(String prenom) {
		// TODO Auto-generated method stub
		return null;
	}

	public Joueur chercheJoueurParNumeroLicense(int numeroLicense) {
		// TODO Auto-generated method stub
		return null;
	}

	public void sauvegardeJoueur(Joueur joueur) {

		entityManager.persist(joueur);

	}

}
