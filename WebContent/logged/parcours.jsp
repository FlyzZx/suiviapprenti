<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <!-- La lib FMT permet le formatage des dates sans utiliser de code JAVA -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/layout.css" />
<title>Profil Personnel</title>
</head>
<body>
<c:import url="navigation.jsp"></c:import>
<c:import url="headerb.jsp"></c:import>
	<div class="content2">
		<h3>Parcours Post-BTS</h3>
		<div class="col-full">	
			${erreur.errIdParcours }
			<form method="GET" class="form" action="modifParcours" >			
				<table>
					<thead>
						<td><p><b>Nom entreprise</b></p></td>
						<td><p><b>Fonction</b></p></td>
						<td><p><b>Date</b></p></td>
						<td></td>
					</thead>
						<c:forEach items="${sessionScope['logged'].parcoursPostBtses }" var="parcour"> <!-- Boucle de récupération des parcours Post BTS -->
						<tr>
							<td><p><c:out value="${parcour.entreprise.nomEntreprise }"/></p></td>
							<td><p><c:out value="${parcour.fonction }"/></p></td>
							<td><p><f:formatDate value="${parcour.dateDebut }" pattern="dd/MM/yyyy"/></p></td>
							<td><input type="radio" value="<c:out value="${parcour.idparcoursPostBts }" />" name="select_parcours" /></td>
						</tr>
						</c:forEach>
				</table>
				<center>
					<a class="btn" href='<c:url value="/addParcours" />'>Ajouter</a>
					<input type="submit" value="Modifier / Supprimer" />
				</center>
			</form>
		</div>
	</div>
</body>
</html>