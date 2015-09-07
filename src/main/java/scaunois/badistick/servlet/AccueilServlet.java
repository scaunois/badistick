package scaunois.badistick.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import scaunois.badistick.dao.impl.DAOJoueurImpl;

public class AccueilServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest requete, HttpServletResponse reponse) throws ServletException, IOException {

		DAOJoueurImpl dao = new DAOJoueurImpl();
		System.out.println("appel de a()");
		dao.a();
		System.out.println("fin de a()");

		this.getServletContext().getRequestDispatcher("/WEB-INF/view/index.jsp").forward(requete, reponse);

	}

}
