package scaunois.badistick.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import scaunois.badistick.entity.club.Ligue;
import scaunois.badistick.entity.joueur.Joueur;
import scaunois.badistick.service.pub.RechercheJoueurSvc;

public class ConsultationJoueurServlet extends HttpServlet {

	RechercheJoueurSvc rechercheJoueurSvc;

	@Override
	public void doGet(HttpServletRequest requete, HttpServletResponse reponse) throws ServletException, IOException {

		requete.setAttribute("ligues", Ligue.ligues);

		this.getServletContext().getRequestDispatcher("/WEB-INF/view/consultation_joueur.jsp")
				.forward(requete, reponse);

	}

	@Override
	public void doPost(HttpServletRequest requete, HttpServletResponse reponse) throws ServletException, IOException {

		/* TODO */
		List<Joueur> joueursTrouves = null;

		this.getServletContext().getRequestDispatcher("/WEB-INF/view/consultation_joueur.jsp")
				.forward(requete, reponse);

	}
}
