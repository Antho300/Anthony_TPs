// Class Ligne
package mastermind_navarro_anthony;

import java.util.Random;

/**
 *
 * @author Anthony
 */
public class Grille {
    
    Boule grille [][] = new Boule[12][4]; // initialise notre grille
    String combi [] = new String[4]; // initialise une ligne pour la combinaison
    String listecoul[]={"jaune ","rouge ","bleu ","vert "};
    
    
    public Grille() {
        for (int i=0; i<12; i++) {
            for (int j=0; j<4; j++) {
                grille[i][j] = null;
            }
        }
    }
    
    public void creercombinaison(){
        Random nb = new Random();
        for(int i= 0 ; i<4; i++){
            int alea = nb.nextInt(4);
            combi[i] = listecoul[alea];
        }
        for(int i= 0 ; i<4; i++){
            System.out.print(combi[i]);
        }
    }
    
    public void ajouterboule(int l, int c, String coul){
        Boule boule1 = new Boule();
        grille[l][c] = boule1;
        boule1 = Boule(coul) ;
    }
    
    public void affichercombinaison(){
        
    }
    
    public void verifiercombi(){
        
    }
    public void affichergrille(){
        
    }

    
    
}
