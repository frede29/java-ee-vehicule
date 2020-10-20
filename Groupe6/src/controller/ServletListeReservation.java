package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Catalogue;
import model.CatalogueVehicule;
import model.Reservation;

/**
 * Servlet implementation class ServletListeReservation
 */
@WebServlet("/ServletListeReservation")
public class ServletListeReservation extends HttpServlet {
 	private Catalogue liste;
	private static final long serialVersionUID = 1L;
	  private Catalogue modele;
	   private Catalogue catalogue;
	   
	    public void init() throws ServletException{
	        catalogue=new CatalogueVehicule();
	    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter out= response.getWriter();
	        ReservationModele reserve=new ReservationModele();
	        CatalogueVehicule cat = new CatalogueVehicule();
	        //List<Reservation> reservations=catalogue.listReservations();
	       // HttpSession session = request.getSession();
	       // int idClient =(int) session.getAttribute("idClient");
	      //  System.out.println("je suis lid du client "+idClient);
	        List<Reservation> reservation = cat.listReservations();        
	        reserve.setReserv(reservation);//essaye pour voir apre
	        request.setAttribute("reserv", reserve);
		request.getRequestDispatcher("/Administrateur/listetoutereservation.jsp").
        forward(request,response);
	}
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
       
       
        request.getRequestDispatcher("/Administrateur/listereservation.jsp").forward(request,response);
	}
}
