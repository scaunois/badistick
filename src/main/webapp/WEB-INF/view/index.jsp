<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/css/main.css" />
<title>BadiStick - The bad reference !</title>
</head>
<body>
	
	<!-- Si l'utilisateur n'est pas connecté, on affiche le formulaire de connexion -->
	<!-- Si l'utilisateur est connecté, on affiche son pseudo -->
	<c:import url="bloc_connexion.jsp"></c:import>
	
	<h1>BadiStick - The bad reference</h1>
	
	<c:import url="menu.jsp"></c:import>
	
</body>
</html>