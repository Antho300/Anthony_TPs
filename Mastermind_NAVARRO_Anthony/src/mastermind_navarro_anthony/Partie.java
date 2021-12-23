
package mastermind_navarro_anthony;

import java.util.Scanner;

/**
 *
 * @author Anthony
 */
public class Partie {
    Grille grillejeu;
    String nomjoueur;
    int mode = 0;
    
    void initialiserpartie(){
        grillejeu = new Grille();
        
        Scanner sc = new Scanner(System.in);
        int bon = 0;
        int modetemporaire = 0;
        System.out.println("___________________MASTERMIND by Matthieu and Anthony___________________");
        System.out.println("Bonjour !\nBienvenue sur le Mastermind imaginé par Matthieu et Anthony");
        System.out.println("Entrez votre nom :");
        nomjoueur = sc.next();
        System.out.println(" ");
        System.out.println("A vous de jouer " + nomjoueur + " !");
        System.out.println("Il existe 3 modes de jeu :\n1- Le mode 'Simple' (Aligne les 3 couleurs dans l'ordre imaginé par l'ordinateur en moins de 12 essais, tu as le choix entre 4 couleurs différentes)\n2- Le mode 'Normal' (Aligne 4 couleurs en moins de 12 essais, tu as le choix entre 4 couleurs différentes)\n3- Le mode 'Extrême' (Aligne 5 couleurs en moins de 15 essis,tu as le choix entre 6 couleurs différentes)");
        while (bon  != 1){
            System.out.println("\nVeuillez saisir un mode de jeu (1, 2, ou 3) :");
            modetemporaire = sc.nextInt();
            // System.out.println(modetemporaire);
            if (modetemporaire == 1 || modetemporaire == 2 || modetemporaire == 3){
                if (modetemporaire == 1){
                    mode = 1;
                }else if (modetemporaire == 2){
                    mode = 2;
                }else if (modetemporaire == 3){
                    mode = 3;
                }
                // System.out.println(mode);
                bon = 1;
            }else{
                System.out.println("Je n'ai pas compris...");
                System.out.println(" ");
                continue;
            }
        
        }
    
    }
    
    public void debuterpartie (){
        System.out.println("Allons ordinateur, initialise une suite de couleurs pour voir de quoi" + nomjoueur + "est capable");
        
        
        
        
    }
    
    
    
}

    
    
    

