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
import model.Clientele;
import model.Reservation;

/**
 * Servlet implementation class ServletListeClient
 */
@WebServlet("/ServletListeClient")
public class ServletListeClient extends HttpServlet {
	private Clientele liste;
	private static final long serialVersionUID = 1L;
	 
	   private Clientele catalogue;
	   
	    public void init() throws ServletException{
	        catalogue=new ClientVehicule();
	    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter out= response.getWriter();
	        ClientModele client=new ClientModele();
	        ClientVehicule cat = new ClientVehicule();
	        //List<Reservation> reservations=catalogue.listReservations();
	       // HttpSession session = request.getSession();
	       // int idClient =(int) session.getAttribute("idClient");
	      //  System.out.println("je suis lid du client "+idClient);
	        List<Client> listeclient = cat.listClients();        
	        client.setClients(listeclient);//essaye pour voir apre
	        request.setAttribute("clients", client);
		request.getRequestDispatcher("/Administrateur/listeclient.jsp").
        forward(request,response);
	}
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
       
       
        request.getRequestDispatcher("/Administrateur/listeclient.jsp").forward(request,response);
	}

}
