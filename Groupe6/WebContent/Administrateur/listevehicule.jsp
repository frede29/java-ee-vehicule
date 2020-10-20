<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <div>
   <form action="ServletListeVehicule" method="get" class="form-inline">
			  
			  	   	     
				 <div>
				     <input type="submit" value="liste des vehicules"/>     
				</div>
			</form>
			<br>
			   
			<div class="container">
						<table border="double">
						     <tr>
						       <th>immatricule</th><th>modele</th><th>categorie</th><th>nbreplace</th><th>prix</th>
						     </tr>
						     <c:forEach items="${vehicules.vehicules}" var="v">
							     <tr>
								     <td>${v.immatricule}</td>
								     <td>${v.modele}</td>
								     <td>${v.categorie}</td>
								     <td>${v.nbreplace}</td>		     
								     <td>${v.prix}</td>
								     <td><a href="ServletListeVehicule.java?action=supprimer&immatricule=${v.immatricule}">supprimer</a></td>
							     </tr>
						     </c:forEach>
						</table>
			</div>
	</div>
</body>
</html>