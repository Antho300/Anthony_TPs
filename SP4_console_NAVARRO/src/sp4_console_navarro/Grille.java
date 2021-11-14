// Classe Grille
package sp4_console_navarro;

/**
 *
 * @author Anthony
 */
public class Grille {
    
    Cellule [][] CellulesJeu = new Cellule [6][7];
    Cellule cellule = new Cellule();
    
    public Grille(){
        
    }
    
    
    public boolean ajouterJetonDansColonne(Jeton m, int c){
        int colonne = c;
        Jeton j = m;
        
        for (int i = 0; i < 6; i++){
            if (i == 5 && CellulesJeu [i][colonne] != null){
                return false;
                
            } else if (CellulesJeu [i][colonne] == null){
                cellule.affecterJeton(j);
                CellulesJeu [i][colonne] = cellule;
                return true;
                
            }else{
                continue;
            }
            
        }
        
    }
    
    public boolean etreRemplie(){
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 7; j++){
                if (CellulesJeu [i][j] != null){
                    continue;
                }else{
                    return false; // Ca finit directement la methode?
                }
            }
        }
        return true; // Ca return true même si ça a déja return le false avant?
    }
    
    public void viderGrille(){
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 7; j++){
                CellulesJeu [i][j] = null;
            }
        }
    }
    
    
    public void afficherGrilleSurConsole(){
        
        for (int i = 0; i < 6; i++){
            System.out.println("");
            for (int j = 0; j < 7; j++){
                System.out.print(CellulesJeu [i][j] + " ");
            }
        }
    }
    
}
