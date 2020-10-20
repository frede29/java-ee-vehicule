<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste reservations</title>
</head>
<body>
	<form action="ServletListeClient" method="get">
	  <input type="submit" value="Afficher tous les clients"/>
	</form><br>
<div class="container">
	<table border="double">
	     <tr>
	       <th>id_client</th><th>nom</th><th>prenom</th><th>adresse</th><th>telephone</th><th>identite</th><th>email</th><th>datelocation</th><th>dateretour</th><th>numpermi</th>
	     </tr>
	     <c:forEach items="${clients.clients}" var="r">
	         <tr>
	             <td>${r.id_client}</td>
	             <td>${r.nom}</td>
	             <td>${r.prenom}</td>
	             <td>${r.adresse}</td>
	             <td>${r.telephone}</td>
	             <td>${r.identite}</td>
	             <td>${r.email}</td>
	             <td>${r.datelocation}</td>
	             <td>${r.dateretour}</td>
	             <td>${r.numpermi}</td>             
	             
	         </tr>
	     </c:forEach>
	</table><br><br>
	
</div>

 

</body>
</html>