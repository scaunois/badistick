package badistick.entity;

import scaunois.badistick.entity.classement.Classement;
import scaunois.badistick.entity.classement.ListeClassement;
import scaunois.badistick.entity.membre.Membre;

public class Test {
	
	public static void main(String[] args) {
		
		Classement classement = new Classement(ListeClassement.C4, ListeClassement.D1, ListeClassement.D3);
		Membre membre = new Membre("caunois", "sébastien", "sebastiencaunois@hotmail.fr", classement);
		
		System.out.println(membre);
		
		
	}

}
