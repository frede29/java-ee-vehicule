package model;

 

import java.util.List;

 

public class TestCatalogue {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
         
        Catalogue modele= new CatalogueVehicule();
       //modele.addVehicule(new Vehicule("im01","economique","BMW", 5, 100));
       //modele.addVehicule(new Vehicule("im03","monospace","opel", 1, 200));
       //modele.addVehicule(new Vehicule("im02","monospace","toyota", 1, 200));
      
        System.out.println("liste des voitures");
        List<Vehicule> vehi=modele.listVehicules();
        for (Vehicule v:vehi) {
            System.out.println(v.getModele());
        }
        
        System.out.println("Consulter un vehicule");
        Vehicule v=modele.getVehicule("im03");
        System.out.println(v.getModele());
        
        System.out.println("Consulter un vehcule");
        Vehicule  v1=modele.getVehicule("im03");
        v.setModele("megane");
        Vehicule  v2=modele.getVehicule("im03");
        System.out.println(v.getModele());
      
        
        System.out.println("Supprimer un vehicule");
        //modele.deleteVehicule("im01");
    }
    
    

 

}