package scaunois.badistick.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import scaunois.badistick.entity.club.Ligue;

public class RechercheJoueurServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest requete, HttpServletResponse reponse)
			throws ServletException, IOException {

		System.out.println("servlet appelée !");

		requete.setAttribute("ligues", Ligue.ligues);

		this.getServletContext()
				.getRequestDispatcher("/WEB-INF/recherche_joueur.jsp")
				.forward(requete, reponse);

	}

	@Override
	public void doPost(HttpServletRequest requete, HttpServletResponse reponse)
			throws ServletException, IOException {

		doGet(requete, reponse);

	}

}
