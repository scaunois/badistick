<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- bloc pour la connexion -->
<div class=bloc_connexion>
	
	<!-- Affichage du formulaire si pas connecté -->
	<c:if test="${ param.connecte == null || param.connecte == 'Deconnexion' }">
		<form action="/badistick/connexion" method="post">
			<input type="text" name="login" placeholder="Login (ou e-mail)">
			<input type="password" name="password" placeholder="Mot de passe">
			<input type="submit" name="connecte" value="Connexion">
		</form>
	</c:if>
	
	<!-- Affichage du pseudo si connecté + bouton pour déco -->
	<c:if test="${ param.connecte == 'Connexion' }">
		[${ param.login }]
		<form action="/badistick/connexion" method="post">
			<input type="submit" name="connecte" value="Deconnexion" />
		</form>
	</c:if>

</div>