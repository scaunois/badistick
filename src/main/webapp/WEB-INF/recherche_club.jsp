<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/main.css">
<title>Recherche de club</title>
</head>
<body>
	
	
	
	<h1>Recherchez un club</h1>
	
	<p>
		Trouvez un club selon la ville, le sigle ou le nom.
	</p>
	
	<form action="/consultationClub" method="post">
	
	Sigle <input type="text" /> <br/><br/>

	Nom du club <input type="text" /> <br/><br/>
	
	Ville <input type="text" />	<br/><br/>
	
	<input type="submit" value="Rechercher" />	
	
	</form>


</body>
</html>