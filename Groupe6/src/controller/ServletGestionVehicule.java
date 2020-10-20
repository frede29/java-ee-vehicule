package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Catalogue;
import model.CatalogueVehicule;
import model.Client;
import model.ClientVehicule;
import model.Reservation;
import model.Vehicule;

/**
 * Servlet implementation class ServletGestionVehicule
 */

public class ServletGestionVehicule extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private Catalogue metier;

	//public void init() throws ServletException {
	//	metier = new CatalogueVehicule();
	//}

	public ServletGestionVehicule() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		/*VehiculeModele model = new VehiculeModele();
		//request.setAttribute("mode", model);
		String path = request.getServletPath();
		if (path.equals("/ServletGestionVehicule")) {
			String immatricule = request.getParameter("immatricule");
			String modele = request.getParameter("modele");
			String categorie = request.getParameter("categorie");
			int nbreplace = Integer.parseInt(request.getParameter("nbreplace"));
			float prix = Float.parseFloat(request.getParameter("prix"));
			Vehicule v = new Vehicule(immatricule, modele, categorie, nbreplace, prix);
			metier.addVehicule(v);
			model.setVehicules(metier.listVehicules());
			System.out.println(v.getModele() + "***" + v.getPrix() + "***" + v.getImmatricule());
			System.out.println(path);
			request.getRequestDispatcher("Administrateur/gestiondesvehicule.jsp").forward(request, response);

		}

//		else if (path.equals("supprimer")) {
//			String immatricule = request.getParameter("immatricule");
//			metier.deleteVehicule(immatricule);
//			model.setVehicules(metier.listVehicules());
//		} 
		else {
			response.sendError(response.SC_NOT_FOUND);
		} */

		Vehicule vehi=new Vehicule();
		vehi.setImmatricule(request.getParameter("immatricule"));
		vehi.setModele(request.getParameter("modele"));
		vehi.setCategorie(request.getParameter("categorie"));
		vehi.setNbreplace(Integer.parseInt(request.getParameter("nbreplace")));
		vehi.setPrix(Float.parseFloat(request.getParameter("prix")));
		
		
		CatalogueVehicule catalogue=new CatalogueVehicule();
        catalogue.addVehicule(vehi);
        Vehicule v = catalogue.getVehicule(vehi.getImmatricule());
        HttpSession session = request.getSession();
        session.setAttribute("Immatricule", v.getImmatricule());
        
        System.out.println(v.getImmatricule());
        
        
        
        
        
        
    //    request.setAttribute("client", cliente.getClient(1));
        
        //request.getRequestDispatcher("client.jsp").
        request.getRequestDispatcher("/Administrateur/gestiondesvehicules.jsp").
        forward(request,response);
        
       

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

	}
}
