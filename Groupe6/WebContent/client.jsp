<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="styleheet" type="text/css" href="style.css">

 


     <title>Location voiture</title>
</head>
<body>

<div align="center">
<h2>Renseigner vos informations</h2>

<form action="ServletClient" method="post" class="form-inline">
    
    
  <table>
					<tr>
					    <td></td>
						<td>
							<input type="hidden" class="form-control" placeholder="matricule " name="matricule" value=<%= request.getParameter("motCle") %> />
						</td>
					</tr>
					
	               <tr>
		                  <td align="right">
		                     <label for="pseudo">Nom :</label><br>
		                  </td>
		                  <td>
		                     <input type="text" class="form-control" placeholder="Votre nom"  name="nom" />
		                  </td>
                  </tr>
                  
	               <tr>
		                  <td align="right">
		                     <label for="pseudo">Prenom :</label><br>
		                  </td>
		                  <td>
		                     <input type="text" class="form-control" placeholder="Votre Prenom" name="prenom"  />
		                  </td>
	               </tr>
	               
	               <tr>
		                  <td align="right">
		                     <label for="date">Date location :</label>
		                  </td>
		                  <td>
		
		                     <input type="text" class="form-control" placeholder="date location" name="datelocation"  />
		                   </td>
	               </tr>
	               
	               <tr>
		                  <td align="right">
		                     <label for="date2">date retour :</label>
		                  </td>
		                  <td>
		                     <input type="text" class="form-control" placeholder="date retour"  name="dateretour" />
		                  </td>
	               </tr>
	               
	               <tr>
		                  <td align="right">
		                     <label for="tel">Telephone :</label>
		                  </td>
		                  <td>
		                     <input type="number" class="form-control" placeholder="telephone" name="telephone" />
		                  </td>
	               </tr>
	               
	               <tr>
		                  <td align="right">
		                     <label for="adr">Adresse :</label>
		                  </td>
		                  <td>
		                     <input type="text" class="form-control" placeholder="adresse"  name="adresse" />
		                  </td>
	               </tr>
	               
	                <tr>
		                    <td align="right">
		                        <label for="id">Identite :</label>
		                    </td>
		                    <td>
		                        <input type="text" class="form-control" placeholder="identite"  name="identite" />
		                    </td>
	                </tr>
	                
	                <tr>
	                
		                    <td align="right">
		                        <label for="num">Numero permi :</label>
		                    </td>
		                    <td>
		                        <input type="number" class="form-control" placeholder="numpermi" name="numpermi" />
		                    </td>
	                </tr>
	                
	                <tr>
	                    <td align="right">
	                        <label for="email">Email :</label>
	                    </td>
	                    <td>
	                        <input type="text" class="form-control" placeholder="email"  name="email" />
	                    </td>
	                </tr>
                   
		            <tr>
		                  <td></td>
		                  <td align="center">
		                     <br />
		                     <!-- <a href="listereservation.jsp"> <input type=button  value="Valider ma reservation"/></a>  -->
		                      <input type="submit" value="Valider ma reservation">
		                  </td>
		             </tr>
            </table>
 
  
  
 </form>
 </div>

 


</body>
</html>