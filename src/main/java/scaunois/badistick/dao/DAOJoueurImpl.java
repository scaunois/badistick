package scaunois.badistick.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import scaunois.badistick.entity.joueur.Joueur;

@Repository
public class DAOJoueurImpl implements DAOJoueur {

	@PersistenceContext(unitName = "badistick")
	EntityManager entityManager;

	public Joueur chercheJoueurParLicense(String license) {

		Query query = entityManager
				.createQuery("FROM Joueur WHERE numeroLicense = :numeroLicense");
		query.setParameter(1, license);
		Joueur joueur = null;
		try {
			joueur = (Joueur) query.getSingleResult();
		} catch (Exception e) {

		}
		return joueur;

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
