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
            String couleur = jetonCourant.lireCouleur();
            return couleur;
            
        }else{
            return "vide";
        }
        
    }
    
    public Jeton recupererJeton(){
        return jetonCourant;
    }
    
    public boolean supprimerJeton(){
        if (jetonCourant == null){
            System.out.println("Pas de jeton présent");
            return false;
            
        }else{
            jetonCourant = null;
            return true;
            
        }
        
    }
    
    
}
