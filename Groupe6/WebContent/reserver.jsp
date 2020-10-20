<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

 


     <title>Location voiture</title>
</head>
<body>
	<div align="center">
	   <h2>Effectuer une reservation</h2>
	
			<form action="ServletVehicule" method="post" class="form-inline">
			  
			    <div class="form-group">
			       <input type="text" class="form-control" placeholder="modele" name="motCle"/>
			    </div><BR>		     
				 <div>
				     <input type="submit" value="Rechercher"/>     
				</div>
			</form>
			<br>
			   
			<div class="container">
						<table border="double">
						     <tr>
						       <th>immatricule</th><th>modele</th><th>categorie</th><th>nbreplace</th><th>prix</th>
						     </tr>
						     <c:forEach items="${mode.vehicules}" var="v">
							     <tr>
								     <td>${v.immatricule}</td>
								     <td>${v.modele}</td>
								     <td>${v.categorie}</td>
								     <td>${v.nbreplace}</td>		     
								     <td>${v.prix}</td>
								     <td><a href="client.jsp?motCle=${v.immatricule}">Reserver</a></td>
							     </tr>
						     </c:forEach>
						</table>
			</div>
	</div>
</body>
</html>