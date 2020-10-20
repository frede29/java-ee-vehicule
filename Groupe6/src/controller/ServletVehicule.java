package controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;
import  java.text.DateFormat;  
import  java.text.SimpleDateFormat;  
  
import  java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Catalogue;
import model.CatalogueVehicule;
import model.Vehicule;


public class ServletVehicule extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Catalogue modele;
    
    public void init() throws ServletException{
        modele=new CatalogueVehicule();
    }
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletVehicule() {
        super();
        // TODO Auto-generated constructor stub
    }

 

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
   
		  HttpSession session = request.getSession();

	        session.setAttribute("immatricule", request.getParameter("immatricule"));
	       
				out.println(session.getId()+"<br>");
				out.println("Welcome "+session.getAttribute("immatricule"));
				out.println("<br>");
				
			
        request.getRequestDispatcher("reserver.jsp").forward(request,response);
        
    
    }

 

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        VehiculeModele model=new VehiculeModele();
        model.setMotCle(request.getParameter("motCle"));
        List<Vehicule> vehicules= modele.VehiculesParMC(model.getMotCle());
        System.out.println(model.getMotCle());
        model.setVehicules(vehicules);
        request.setAttribute("mode", model);
       
        request.getRequestDispatcher("reserver.jsp").
        forward(request,response);
       
        	
 
    }
}