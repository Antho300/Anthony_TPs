// Ex 1 TP2, 14/10/2021
package tp2_bieres_navarro;

/**
 *
 * @author Anthony
 */
public class TP2_Bieres_NAVARRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BouteilleBiere uneBiere = new BouteilleBiere ("Cuvée des trolls" , 7.0 , "Dubuisson");
        BouteilleBiere uneBiere1 = new BouteilleBiere ("Leffe" , 6.6 , "Abbaye de Leffe");
        BouteilleBiere uneBiere2 = new BouteilleBiere ("1664" , 12 , "Brasserie 1664");
        
        // uneBiere.nom = "Leffe";
        // uneBiere.degreAlcool = 6.6;
        // uneBiere.brasserie = "Abbaye de Leffe";
        // uneBiere.ouverte = false;
        
        uneBiere.lireEtiquette();
        uneBiere1.lireEtiquette();
        uneBiere2.lireEtiquette();
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
