package scaunois.badistick.dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import scaunois.badistick.dao.pub.DAOJoueur;
import scaunois.badistick.entity.joueur.Joueur;
import scaunois.badistick.entity.joueur.categorie.Categorie;
import scaunois.badistick.entity.joueur.classement.Classement;
import scaunois.badistick.entity.joueur.classement.ClassementJoueur;

@Stateless
public class DAOJoueurImpl implements DAOJoueur {

	/*
	 * TODO à supprimer
	 */
	public List<Joueur> liste = new ArrayList<Joueur>();

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

	public void a() throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(
				"C:\\Users\\stagiaire\\Desktop\\git\\badistick\\liste_joueurs.txt"));

		String str = br.readLine();
		int i = 0;
		while (str != null) {
			String[] tab = str.split("\t");
			//System.out.println(Arrays.toString(tab));
			String nom = tab[0].split(" ")[1].toUpperCase();
			String prenom = tab[0].split(" ")[0].toUpperCase();
			String genre = tab[1];
			String license = tab[10];
			ClassementJoueur classementJoueur = new ClassementJoueur(Classement.valueOf(Classement.class, tab[3]),
					Classement.valueOf(Classement.class, tab[4]), Classement.valueOf(Classement.class, tab[5]));
			Categorie categorie = null;
			try {
				categorie = Categorie.valueOf(Categorie.class, tab[2].toUpperCase());
			} catch (Exception e) {
				categorie = null;
			}
			Joueur j = new Joueur(nom, prenom, genre, license, null, classementJoueur, categorie);
			sauvegardeJoueur(j);
			System.out.println(j.toString());

			str = br.readLine();
			i++;
		}

	}
}
