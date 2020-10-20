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
	   <h2>Ajouter un vehicule</h2>
	   
	   
	
			<form action="ServletGestionVehicule" method="post" class="form-inline">
			  
			    <table>
					<tr>
					    <td align="right">
		                     <label for="pseudo">Immatricule :</label><br>
		                  </td>
						<td>
							<input type="text" class="form-control" placeholder="immatricule " name="immatricule"/>
						</td>
					</tr>
					
	               <tr>
		                  <td align="right">
		                     <label for="pseudo">Modele :</label><br>
		                  </td>
		                  <td>
		                     <input type="text" class="form-control" placeholder="modele"  name="modele" />
		                  </td>
                  </tr>
                  
	               <tr>
		                  <td align="right">
		                     <label for="pseudo">Categorie :</label><br>
		                  </td>
		                  <td>
		                     <input type="text" class="form-control" placeholder="categorie" name="categorie"  />
		                  </td>
	               </tr>
	               
	               <tr>
		                  <td align="right">
		                     <label for="number">nombre de place :</label>
		                  </td>
		                  <td>
		
		                     <input type="number" class="form-control" placeholder="nombre de place" name="nbreplace"  />
		                   </td>
	               </tr>
	               
	               <tr>
		                  <td align="right">
		                     <label for="number">prix :</label>
		                  </td>
		                  <td>
		                     <input type="number" class="form-control" placeholder="prix"  name="prix" />
		                  </td>
	               </tr>
	               <tr>
		                  <td></td>
		                  <td align="center">
		                     <br />
		                     
		                     
		                     <a href="listevehicule.jsp"><input type="button" value="ajouter"></a>
		                  </td>
		             </tr>
            </table>    
				
			</form>
			</div>
			
			 
	                         
</body>
</html>