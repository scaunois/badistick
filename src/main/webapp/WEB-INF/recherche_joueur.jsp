<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/recherche_joueur.css">
<title>Recherche de joueur</title>
</head>

<body>
	
<!-- Bloc pour la recherche de joueur -->
<div class="blocRecherche">

	<h1>Rechercher un joueur</h1>

	<p>
		Trouvez n'importe quel joueur selon les critères de votre choix. <br />
		Si vous ne connaissez pas le nom exact, vous pouvez utiliser le caractère '*' pour remplacer un ou plusieurs caractères (ex. : par* trouvera Paris, d*m*n trouvera Dumoulin, etc...) <br/>
		Remarque : La casse (majuscule/minuscule) n'est pas importante.
	</p>
	
	<form action="recherche_joueur" method="post">
		
		<span class="champRecherche">&nbsp;Nom</span> <input type="text" /> <br/><br/>
		
		<span class="champRecherche">&nbsp;Prenom</span> <input type="text" /> <br/><br/>
		
		<span class="champRecherche">&nbsp;License</span> <input type="text" /> <br/><br/>
		
		<span class="champRecherche">&nbsp;Genre</span>
		<select>
			<option>Tous</option>
			<option>Homme</option>
			<option>Femme</option>
		</select> <br/><br/>
		
		<span class="champRecherche">&nbsp;Classement</span>
		<select>
			<option>Tous</option>
			<option>NC</option>
			<option>D</option>
			<option>C</option>
			<option>B</option>
			<option>A</option>
			<option>Elite</option>
		</select> <br/><br/>
		
		<span class="champRecherche">&nbsp;Ligue</span>
		<select>
			<option>Toutes</option>
			<c:forEach items="${ligues}" var="ligue">
				<option><c:out value="${ ligue }"></c:out></option>
			</c:forEach>
		</select> <br/><br/>
		
		<span class="champRecherche">&nbsp;Ville</span> <input type="text"> (ou code postal)<br/><br/>
		
		<span class="champRecherche">&nbsp;Sigle Club</span> <input type="text"> <br/><br/>
		
		<span id="boutonSubmit"><input type="submit" value="Rechercher" name="rechercher" ></span>
		
	</form>
	
</div class="blocResultats">

<!-- Bloc pour l'affichage de la liste des résultats -->
<c:if test="${ param.rechercher != null && param.rechercher == 'Rechercher' }">
<div>
	
	<h1>Joueurs trouvés</h1>
	<c:forEach items="joueurs" var="j">
		
	</c:forEach>

</div>
</c:if>

</body>

</html>