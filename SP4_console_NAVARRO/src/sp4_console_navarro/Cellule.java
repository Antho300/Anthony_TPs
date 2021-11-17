// Classe Cellule
package sp4_console_navarro;

/**
 *
 * @author Anthony
 */
class Cellule {
    
    Jeton jetonCourant;
    boolean desintegrateur;
    
    
    
    
    public Cellule(){
        jetonCourant = null;
        desintegrateur = false;
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
    
    public boolean placerDesintegrateur(){
        if (desintegrateur == false){
            desintegrateur = true;
            return true;
        }else{
            System.out.println("désintegrateur déjà présent");
            return false;
        }
    }
    
    public boolean presenceDesintegrateur(){
        if (desintegrateur == true){
            return true;
            
        }else{
            return false;
            
        }
        
    }
    
    public boolean recupererDesintegrateur(){
        if (desintegrateur == true){
            desintegrateur = false;
            return true;
            
        }else{
            System.out.println("Aucun désintegrateur présent");
            return false;
            
        }
        
    }
    
    
}
