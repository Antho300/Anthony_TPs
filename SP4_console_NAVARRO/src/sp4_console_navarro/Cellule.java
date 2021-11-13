// Classe Cellule
package sp4_console_navarro;

/**
 *
 * @author Anthony
 */
class Cellule {
    
    Jeton jetonCourant;
    
    
    
    
    public Cellule(){
        jetonCourant = null;
    }
    
    public boolean affecterJeton(Jeton v){
        if (jetonCourant == null){
            jetonCourant = v;
            return true;
        }else{
            return false;
        }
            
    }
    
    public String lireCouleurDuJeton(){
        if (jetonCourant != null){
            lireCouleur();
            return jetonCourant;
            
        }else{
            return "vide";
        }
        
    }
    
    
    
    
}
