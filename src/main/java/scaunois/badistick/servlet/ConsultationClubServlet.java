package scaunois.badistick.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConsultationClubServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest requete, HttpServletResponse reponse) throws ServletException, IOException {

		this.getServletContext().getRequestDispatcher("/WEB-INF/view/consultation_club.jsp").forward(requete, reponse);

	}

}
