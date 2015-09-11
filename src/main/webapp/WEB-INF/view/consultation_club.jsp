<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/css/main.css">
<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/css/recherche.css">
<title>Recherche de club</title>
</head>
<body>

	<c:import url="bloc_include_principal.jsp"></c:import>


	<div class="blocRecherche">

		<h2>Recherchez un club</h2>

		<p>Trouvez un club selon la ville, le sigle ou le nom.</p>

		<form action="/consultationClub" method="post">

				<span class="champRecherche">&nbsp;Sigle</span>
				<input type="text" /> <br/><br/>
				
				<span class="champRecherche">&nbsp;Nom club</span>
				<input type="text" /> <br/><br/>
				
				<span class="champRecherche">&nbsp;Ville</span>
				<input type="text" /> (ou code postal) <br/><br/>
				
				<input type="submit" value="Rechercher" name="rechercher" class="boutonRechercher" />

		</form>
		
	</div>


</body>
</html>