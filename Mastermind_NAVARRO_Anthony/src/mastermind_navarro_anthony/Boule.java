// Class JetonsCouleurs
        
package mastermind_navarro_anthony;

import java.util.Random;

/**
 *
 * @author Anthony
 */
public class Boule {
    String Couleur;
    
    public Boule(String coul){
        Couleur = coul;
    }
    
    // ajout d'un commentaire
    public String lireCouleur(){
        return Couleur;
    }
}

