<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/css/main.css">
<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/css/recherche.css">
<title>Recherche de joueur</title>
</head>

<body>

		<c:import url="bloc_include_principal.jsp"></c:import>

		<!-- Bloc pour la recherche de joueur -->
		<div class="blocRecherche">

				<h2>Rechercher un joueur</h2>

				<p>
						Trouvez n'importe quel joueur selon les crit�res de votre choix. <br />
						Si vous ne connaissez pas le nom exact, vous pouvez utiliser le
						caract�re '*' pour remplacer un ou plusieurs caract�res (ex. :
						par* trouvera Paris, d*m*n trouvera Dumoulin, etc...) <br />
						Remarque : La casse (majuscule/minuscule) n'est pas importante.
				</p>

				<form action="consultation_joueur" method="post">

						<span class="champRecherche">&nbsp;Nom</span> 
						<input type="text" name="nom" /> <br/><br/> 
						
						<span class="champRecherche">&nbsp;Prenom</span> 
						<input type="text" name="prenom" /> <br/><br/> 
						
						<span class="champRecherche">&nbsp;License</span> 
						<input type="text" name="license" /> <br/><br/> 
						
						<span class="champRecherche">&nbsp;Sexe</span>
						<select name="sexe">
							<option value="">Tous</option>
							<option value="">Homme</option>
							<option value="">Femme</option>
						</select> <br/><br/> 
						
						<span class="champRecherche">&nbsp;Classement</span>
						<select name="classement">
							<option value="">Tous</option>
							<option value="">NC</option>
							<option value="">D</option>
							<option value="">C</option>
							<option value="">B</option>
							<option value="">A</option>
							<option value="">Elite</option>
						</select> <br /> <br /> 
						
						<span class="champRecherche">&nbsp;Ligue</span>
						<select name="ligue">
							<option>Toutes</option>
							<c:forEach items="${ligues}" var="ligue">
								<option><c:out value="${ ligue }"></c:out></option>
							</c:forEach>
						</select> <br/><br/> 
						
						<span class="champRecherche">&nbsp;Ville</span> 
						<input type="text" name="ville"> (ou code postal)<br/><br/>
						
						<span class="champRecherche">&nbsp;Sigle Club</span> 
						<input type="text" name="sigleClub"> <br/><br/> 
						
						<input type="submit" value="Rechercher" name="rechercher" class="boutonRechercher" >
						

				</form>

		</div>

		<!-- Bloc pour l'affichage de la liste des r�sultats -->
		<c:if
				test="${ param.rechercher != null && param.rechercher == 'Rechercher' }">
				<div>

						<h2>Joueurs trouv�s</h2>
						<c:forEach items="joueurs" var="j">

						</c:forEach>

				</div>
		</c:if>

</body>

</html>