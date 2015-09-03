<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- bloc de code inclus dans toutes les pages, contenant le menu, le header et le bloc de connexion -->

	<c:import url="bloc_header.jsp"></c:import>
	
	<!-- utilisateur non connect� : affiche le formulaire de connexion -->
	<!-- utilisateur connect� : affiche son pseudo -->
	<c:import url="bloc_connexion.jsp"></c:import>
	
	<c:import url="bloc_menu.jsp"></c:import>