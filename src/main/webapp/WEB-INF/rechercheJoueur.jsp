<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/rechercheJoueur.css">
<title>Recherche de joueur</title>
</head>

<body>

	<div class="blocRecherche">

	<h1>Recherchez un joueur</h1>

	<p>
		Trouvez n'importe quel joueur selon les crit�res de votre choix. <br />
		Si vous ne connaissez pas le nom exact, vous pouvez utiliser le caract�re '*' pour remplacer un ou plusieurs caract�res (ex. : par* trouvera Paris, d*m*n trouvera Dumoulin, etc...) <br/>
		Remarque : La casse (majuscule/minuscule) n'est pas importante.
	</p>
	
	<form action="/consultationJoueur" method="post">
		
		<span class="champRecherche">Nom</span> <input type="text" /> <br/><br/>
		
		<span class="champRecherche">Prenom</span> <input type="text" /> <br/><br/>
		
		<span class="champRecherche">License</span> <input type="text" /> <br/><br/>
		
		<span class="champRecherche">Genre</span>
		<select>
			<option>Tous</option>
			<option>Homme</option>
			<option>Femme</option>
		</select> <br/><br/>
		
		<span class="champRecherche">Classement</span>
		<select>
			<option>Tous</option>
			<option>NC</option>
			<option>D</option>
			<option>C</option>
			<option>B</option>
			<option>A</option>
			<option>Elite</option>
		</select> <br/><br/>
		
		<span class="champRecherche">Ligue</span>
		<select>
		
		</select> <br/><br/>
		
		<span class="champRecherche">Ville</span> <input type="text"> (ou code postal)<br/><br/>
		
		<span class="champRecherche">Sigle Club</span> <input type="text"> <br/><br/>
		
		<span id="boutonSubmit"><input type="submit" value="Rechercher" /></span>
		
	</form>
	
	</div>

</body>

</html>