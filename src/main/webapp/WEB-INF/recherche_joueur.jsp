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

	<div class="blocRecherche">

	<h1>Recherchez un joueur</h1>

	<p>
		Trouvez n'importe quel joueur selon les critères de votre choix. <br />
		Si vous ne connaissez pas le nom exact, vous pouvez utiliser le caractère '*' pour remplacer un ou plusieurs caractères (ex. : par* trouvera Paris, d*m*n trouvera Dumoulin, etc...) <br/>
		Remarque : La casse (majuscule/minuscule) n'est pas importante.
	</p>
	
	<form action="/consultationJoueur" method="post">
		
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
			<option>Alsace</option>
			<option>Aquitaine</option>
			<option>Auvergne</option>
			<option>Basse Normandie</option>
			<option>Bourgogne</option>
			<option>Bretagne</option>
			<option>Centre</option>
			<option>Champagne Ardenne</option>
			<option>Franche-Comté</option>
			<option>Guadeloupe</option>
			<option>Guyane</option>
			<option>Haute Normandie</option>
			<option>Ile de France</option>
			<option>Languedoc Roussillon</option>
			<option>Limousin</option>
			<option>Lorraine</option>
			<option>Martinique</option>
			<option>Midi Pyrénées</option>
			<option>Nord Pas de Calais</option>
			<option>Nouvelle Calédonie</option>
			<option>Pays de la Loire</option>
			<option>Picardie</option>
			<option>Poitou Charentes</option>
			<option>Provence Alpes Côte d'Azur</option>
			<option>Réunion</option>
			<option>Rhone Alpes</option>
		</select> <br/><br/>
		
		<span class="champRecherche">&nbsp;Ville</span> <input type="text"> (ou code postal)<br/><br/>
		
		<span class="champRecherche">&nbsp;Sigle Club</span> <input type="text"> <br/><br/>
		
		<span id="boutonSubmit"><input type="submit" value="Rechercher" name="rechercher" ></span>
		
	</form>
	
	</div>

</body>

</html>