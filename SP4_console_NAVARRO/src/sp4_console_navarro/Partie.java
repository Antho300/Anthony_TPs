// Classe Partie
package sp4_console_navarro;

import java.util.Scanner;

/**
 *
 * @author Anthony
 */
public class Partie {
    
    Joueur [] ListeJoueurs = new Joueur [2];
    Joueur joueurCourant;
    Grille grilleJeu;
    int JC = 3;
    
    public Partie (Joueur joueur1 , Joueur joueur2){
        
        Joueur j1 = joueur1;
        Joueur j2 = joueur2;
        
        ListeJoueurs[0] = j1;
        ListeJoueurs[1] = j2;
     
}
    
    public void attribuerCouleursAuxJoueurs(){
        double nb = Math.random();
        int nb1;
        int nb2;
        
        System.out.println(nb);
        
        if (nb >= 0.5){
            nb1 = 1;
        }else{
            nb1 = 0;
        }
        
        nb2 = 1-nb1;
        
        
        ListeJoueurs[nb1].affecterCouleur("Rouge");
        ListeJoueurs[nb2].affecterCouleur("Jaune");
        
    }
    
    public void initialiserPartie(){
      grilleJeu = new Grille();
      
      
      for (int i = 0; i < 21; i++){
          Jeton jeton1 = new Jeton(ListeJoueurs[0].Couleur);
          Jeton jeton2 = new Jeton(ListeJoueurs[1].Couleur);
          ListeJoueurs[0].ajouterJeton(jeton1);
          ListeJoueurs[1].ajouterJeton(jeton2);
        
      }
     
    }
    
    public void debuterPartie(){ 
        
        Scanner sc = new Scanner(System.in); // permet de prendre les entrées de l'utilisateur
        boolean partieFinie = false;
        String causePartieFinie = "Non déterminée";
        Joueur joueurCourant = new Joueur("joueur");
        Joueur adversaireCourant = new Joueur("adversaire");
        Jeton jetonCourant = new Jeton("Non définie"); // jetonCourant avec Couleur non définit
        
        if(JC == 0) {
            joueurCourant = ListeJoueurs[1];   
            adversaireCourant = ListeJoueurs[0];
            jetonCourant.Couleur = joueurCourant.Couleur;
            JC=1; // permet de changer de joueur au prochain appel de cette méthode
        }
        else{
            joueurCourant = ListeJoueurs[0];
            adversaireCourant = ListeJoueurs[1];
            jetonCourant.Couleur = joueurCourant.Couleur;
            JC = 0;
        }
        
        // 2 tests pour voir si la partie est terminée
        if (grilleJeu.etreRemplie() == true){
            partieFinie = true;
            causePartieFinie = "Grille Remplie";
        }
        if (grilleJeu.etreGagnantePourJoueur(adversaireCourant) == true){
            partieFinie = true;
            causePartieFinie = "Adversaire gagne";
        }
        
        //cas où la partie n'est pas terminée, le tour est lancé
        if (partieFinie!= true){
            
            grilleJeu.afficherGrilleSurConsole();
            
            System.out.println("\nC'est à votre tour de placer votre jeton\nEntrez un numéro de colone");
            int colonne = sc.nextInt();
            
            boolean placementDispo = grilleJeu.colonneRemplie(colonne);// test si l'emplacement est dispo
            
            while (placementDispo == true) { // à refaire jusqu'à ce que le choix de colonne soit valide
               System.out.println("Erreur : la colonne " + colonne + " est remplie.\nEntrez un autre numéro de colone"); 
               colonne = sc.nextInt();
               placementDispo = grilleJeu.colonneRemplie(colonne);
            }
            
            // le boolean "doitEtreTrue" renvoyé doit etre true car on a deja testé si l'emplacement était dispo.
            boolean doitEtreTrue = grilleJeu.ajouterJetonDansColonne(jetonCourant, colonne); 

            //partRJ: pour retirer jeton de la liste des jetons du joueur actuel.

            int rang = 0;
            for (int i=0; i<joueurCourant.ListeJetons.length; i++){
                if (joueurCourant.ListeJetons[i]== null){
                    rang = i-1;
                    break;
                }
            }
            joueurCourant.ListeJetons[rang] = null;

            //fin partRJ.
            }

            // cas où la partie doit être terminée, partieFinie = true
            else{
                System.out.println("La partie est terminée");
                if ("Adversaire gagne".equals(causePartieFinie)){
                    System.out.println(adversaireCourant.Nom + " a gagné la partie ");
                }
                else{
                    System.out.println("Il y a égalité entre les 2 joueurs");
                }
            }
    }

    
}
