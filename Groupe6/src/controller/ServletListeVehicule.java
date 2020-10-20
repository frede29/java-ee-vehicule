package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Catalogue;
import model.CatalogueVehicule;
import model.Client;
import model.ClientVehicule;
import model.Vehicule;

/**
 * Servlet implementation class ServletListeVehicule
 */
@WebServlet("/ServletListeVehicule")
public class ServletListeVehicule extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Catalogue modele;
    
    public void init() throws ServletException{
        modele=new CatalogueVehicule();
    }
    public ServletListeVehicule() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out= response.getWriter();
        VehiculeModele client=new VehiculeModele();
        CatalogueVehicule cat = new CatalogueVehicule();
        //List<Reservation> reservations=catalogue.listReservations();
       // HttpSession session = request.getSession();
       // int idClient =(int) session.getAttribute("idClient");
      //  System.out.println("je suis lid du client "+idClient);
        List<Vehicule> listeclient = cat.listVehicules();        
        client.setVehicules(listeclient);//essaye pour voir apre
        request.setAttribute("vehicules", client);
        
       
       String action= request.getParameter("action");
       if(action.equals("supprimer")) {
    	   String immatricule=request.getParameter("immatricule");
    	   modele.deleteVehicule(immatricule);
    	   client.setVehicules(modele.listVehicules());
       }
        
		 	        
		request.getRequestDispatcher("/Administrateur/listevehicule.jsp").
	    forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	

		request.getRequestDispatcher("/Administrateur/listevehicule.jsp").
	    forward(request,response);
	}

}
