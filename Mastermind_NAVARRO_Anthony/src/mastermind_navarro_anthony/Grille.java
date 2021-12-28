// Class Ligne
package mastermind_navarro_anthony;

import java.util.Random;

/**
 *
 * @author Anthony
 */
public class Grille {
    Boule grillemode1 [][] = new Boule[12][3]; // initialise notre grille du mode 1
    Boule grillemode2 [][] = new Boule[12][4]; // initialise notre grille du mode 2
    Boule grillemode3 [][] = new Boule[15][5]; // initialise notre grille du mode 3
    String combi1 [] = new String[3]; // initialise une ligne pour la combinaison mode 1
    String combi2 [] = new String[4]; // initialise une ligne pour la combinaison mode 2
    String combi3 [] = new String[5]; // initialise une ligne pour la combinaison mode 3
    String listecoul12[]={"jaune","rouge","bleu","vert"}; // couleurs mode 1 et 2
    String listecoul3[]={"jaune","rouge","bleu","vert"}; //couleurs mode 3
    int aide[][] = new int [12][2]; // grille qui nous donnera le nombre de jetons correctement^placée et le nombre de jetons de la bonne couleur présents
    
    
    public Grille(int mode) { // constructeur qui remplit la grille avec des boules null = cases vides
        if (mode == 1){
            for (int i=0; i<12; i++) {
                for (int j=0; j<3; j++) {
                    grillemode1[i][j] = null;
                }
            }
        }else if (mode == 2){
            for (int i=0; i<12; i++) {
                for (int j=0; j<4; j++) {
                    grillemode2[i][j] = null;
                }
            }
        }else if (mode == 3){
            for (int i=0; i<15; i++) {
                for (int j=0; j<5; j++) {
                    grillemode3[i][j] = null;
                }
            }
        }
        
    }
    
    public void creercombinaison(){ // permet de creer la combinaison aléatoire a trouver 
        Random nb = new Random();
        for(int i= 0 ; i<4; i++){
            int alea = nb.nextInt(4);
            combi[i] = listecoul[alea];
        }
    }
    
    public void ajouterboule(Boule b1, int l, int c){
        grille[l][c] = b1;
    }
    
    public void retirerboule(int l, int c){
        grille[l][c] = null;
    }
    
    public void affichercombinaison(){
        for(int i= 0 ; i<4; i++){
            if(combi[i] == "jaune"){
                System.out.print("J ");
            }else if(combi[i] == "rouge"){
                System.out.print("R ");
            }else if(combi[i] == "bleu"){
                System.out.print("B ");
            }else if(combi[i] == "vert"){
                System.out.print("Ve ");
            }
        }
    }
    
    public int[] verifiercombi(int l) {
        int nbR = 0; // nombre rouge final
        int nbB = 0;  // nombre blanc final
        boolean Check[] = new boolean[4];

        for (int i = 0; i < 4; i++) {
            if (grille[l][i].Couleur == combi[i]) {
                nbR += 1;
                Check[i] = true;
            }
        }

        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 4; k++) {
                if (grille[l][j].Couleur != combi[j] && Check[k] == false && grille[l][k].Couleur == combi[j]) {
                    nbB += 1;
                    Check[k] = true;
                    break;
                }

            }

        }
        
        for (int n = 0; n < 2; n++){
            if (n == 0){
                aide[l][n] = nbR;
            }else{
                aide[l][n] = nbB;
            }
        }
        
        int [] valeursRB = {nbR, nbB}; // Comme je ne peux pas retourner deux int, je retourne un tableau contenant mes deux valeurs avec le nombre de rouge en premier.
        
        return valeursRB;
    } 
        
     
    
    
    
    
    public void affichergrilleetindic() {
        /*int valeursRB1 [] = new int[2];
        for (int l = 0 ; l < 2; l++){
            valeursRB1 [l] = val[l];
        }
         */
        int val = 0;

        System.out.print("Voici la grille de jeu :                       ");
        System.out.print("Voici les indications de l'ordinateur :");
        System.out.println(" ");
        System.out.println("________________________                       _______________________________________");

        for (int i = 0; i < 12; i++) {
            val = 0;
            for (int j = 0; j < 6; j++) {
                if (j < 4){
                    if (grille[i][j] != null) {
                        if (j == 0) {
                            if(grille[i][j].Couleur == "rouge"){
                                System.out.print("      |\033[31mR\033[0m|");
                            }else if(grille[i][j].Couleur == "vert"){
                                System.out.print("      |V|");
                            }else if(grille[i][j].Couleur == "bleu"){
                                System.out.print("      |B|");
                            }else if(grille[i][j].Couleur == "jaune"){
                                System.out.print("      |J|");
                            }
                            val = 1;
                        } else {
                            if(grille[i][j].Couleur == "rouge"){
                                System.out.print("\033[31mR\033[0m|");
                            }else if(grille[i][j].Couleur == "vert"){
                                System.out.print("V|");
                            }else if(grille[i][j].Couleur == "bleu"){
                                System.out.print("B|");
                            }else if(grille[i][j].Couleur == "jaune"){
                                System.out.print("J|");
                            }
                        }
                    } else {
                        if (j == 0) {
                            System.out.print("      |");
                        } else {
                            System.out.print(" |");
                        }
                    }
                }else{
                    if (j == 4) {
                        if (val == 1){
                            System.out.print("                                              |" + aide[i][0] + "|");
                        }else{
                            System.out.print(" |                                              |" + aide[i][0] + "|");
                        }
                    } else {
                        System.out.print(aide[i][1] + "|");
                    }
                    
                }
            }
        System.out.println(" ");
        }
        
    }
        
        
        
    public void verifcombi(){
        
    }
    
    public void ajoutercouleur(){
        
    }
    
}

