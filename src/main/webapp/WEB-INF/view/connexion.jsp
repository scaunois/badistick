<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- bloc pour la connexion -->
<div class=bloc_connexion>
	
	<%
		System.out.println("connecte=" + request.getParameter("connecte"));
	
		String[] tab = request.getRequestURI().split("/");
		String pageParente = tab[tab.length-1];
	%>
	
	<!-- Affichage du formulaire si pas connecté -->
	<c:if test="${ param.connecte == null || param.connecte == 'Deconnexion' }">
		<form action="/badistick/connexion" method="post">
			<input type="text" name="login" placeholder="Login (ou e-mail)">
			<input type="password" name="password" placeholder="Mot de passe">
			<input type="submit" name="connecte" value="Connexion">
			<input type="hidden" name=pageParente value="<%= pageParente %>">
		</form>
	</c:if>
	
	<!-- Affichage du pseudo si connecté + bouton pour déco -->
	<c:if test="${ param.connecte == 'Connexion' }">
		<% System.out.println("ici"); %>
		[${ param.login }]
		<form action="/badistick/connexion" method="post">
			<input type="submit" name="connecte" value="Deconnexion" />
			<input type="hidden" name=pageParente value="<%= pageParente %>">
		</form>
	</c:if>
	
	<%
		if(request.getParameter("pageParente") != null){
			String pageRedirection = request.getParameter("pageParente").substring(0, request.getParameter("pageParente").length() - 4);
			System.out.println("on redirige vers : " + pageRedirection);
			response.sendRedirect(pageRedirection);
		}
	 
	 %>

</div>