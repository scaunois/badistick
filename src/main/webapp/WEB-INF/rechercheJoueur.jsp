<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Recherche de joueur</title>
</head>
<body>

	<h1>Recherchez un joueur</h1>

	<p>
		Trouvez n'importe quel joueur selon les critères de votre choix. <br />
	</p>
	
	<form action="consultationJoueur" method="post">
		
		Nom <input type="text" /> <br/><br/>
		
		Prenom <input type="text" /> <br/><br/>
		
		License <input type="text" /> <br/><br/>
		
		Genre
		<select>
			<option>Tous</option>
			<option>Homme</option>
			<option>Femme</option>
		</select> <br/><br/>
		
		Classement
		<select>
			<option>Tous</option>
			<option>NC</option>
			<option>D</option>
			<option>C</option>
			<option>B</option>
			<option>A</option>
			<option>Elite</option>
		</select> <br/><br/>
		
		Ligue
		<select>
		
		</select> <br/><br/>
		
		Ville (ou code postal) <input type="text"> <br/><br/>
		
		Sigle Club <input type="text"> <br/><br/>
		
	</form>

</body>
</html>