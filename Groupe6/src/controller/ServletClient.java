package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.CatalogueVehicule;
import model.Client;
import model.ClientVehicule;
import model.Reservation;
import model.Catalogue;

/**
 * Servlet implementation class ServletClient
 */

public class ServletClient extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletClient() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        request.getRequestDispatcher("client.jsp").
        forward(request,response);
    }

 

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub  
        
            Client client=new Client();            
            client.setNom(request.getParameter("nom"));            
            client.setPrenom(request.getParameter("prenom"));
            client.setTelephone(Integer.parseInt(request.getParameter("telephone")));
            client.setNumpermi(Integer.parseInt(request.getParameter("numpermi")));
            client.setEmail(request.getParameter("email"));
            client.setAdresse(request.getParameter("adresse"));        
            client.setIdentite(request.getParameter("identite"));
            client.setDatelocation(request.getParameter("datelocation"));        
            client.setDateretour(request.getParameter("dateretour"));
            
            ClientVehicule cliente=new ClientVehicule();
            cliente.addClient(client);
            Client c = cliente.getClientbyEmail(client.getEmail());
            HttpSession session = request.getSession();
            session.setAttribute("idClient", c.getId_client());
            
            System.out.println(c.getId_client());
            String matricule = request.getParameter("matricule");
            CatalogueVehicule cat = new CatalogueVehicule();
            cat.addReservation(new Reservation(matricule,c.getId_client()));
            
            
            
            
            
        //    request.setAttribute("client", cliente.getClient(1));
            
            //request.getRequestDispatcher("client.jsp").
            request.getRequestDispatcher("listereservation.jsp").
            forward(request,response);
            

 

    }

}
