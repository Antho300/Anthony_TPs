// Class JetonsCouleurs
        
package mastermind_navarro_anthony;

import java.util.Random;

/**
 *
 * @author Anthony
 */
public class JetonsCouleurs {
    String Couleur;
    
    public JetonsCouleurs(String C){
        Couleur = C;
    }
    
    public String LireCouleur(){
        return Couleur;
    }
    
    public void CreerLigneReference(){
        Random alea = new Random();
        
        
        int couleur = alea.nextInt(6);
        
    }
     
}
