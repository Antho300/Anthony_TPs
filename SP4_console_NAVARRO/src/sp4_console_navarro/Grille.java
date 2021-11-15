// Classe Grille
package sp4_console_navarro;

/**
 *
 * @author Anthony
 */
public class Grille {
    
    Cellule [][] CellulesJeu = new Cellule [6][7];
        
    public Grille(){
        
    }
    
    
    public boolean ajouterJetonDansColonne(Jeton m, int c){
        int colonne = c;
        Jeton j = m;
        
        for (int i = 0; i < 6; i++){
            if (i == 5 && CellulesJeu [i][colonne].jetonCourant != null){
                return false;
                
            } else if (CellulesJeu [i][colonne].jetonCourant == null){
                CellulesJeu [i][colonne].affecterJeton(j);
                return true;
                
            }else{
                continue;
            }
            
        }
       return false; 
    }
    
    public boolean etreRemplie(){
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 7; j++){
                if (CellulesJeu [i][j].jetonCourant != null){
                    continue;
                }else{
                    return false; // Ca finit directement la methode? oui
                }
            }
        }
        return true; // Ca return true même si ça a déja return le false avant? non
    }
    
    public void viderGrille(){
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 7; j++){
                CellulesJeu [i][j].jetonCourant = null;
            }
        }
    }
    
    
    public void afficherGrilleSurConsole(){
        
        for (int i = 0; i < 6; i++){
            System.out.println("");
            for (int j = 0; j < 7; j++){
                System.out.print(CellulesJeu [i][j].jetonCourant + " ");
            }
        }
    }
    
    
    public boolean colonneRemplie(int colonne){
        int c = colonne;
        for (int i =0; i < 6; i++){
            if (CellulesJeu [i][c].jetonCourant == null){
                return false;
            }   
        }
        return true;
        
    }
    
    
    
    
}
