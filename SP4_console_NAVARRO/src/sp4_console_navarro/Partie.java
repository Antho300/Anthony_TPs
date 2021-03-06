// Classe Partie
package sp4_console_navarro;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Anthony
 */
public class Partie {

    Joueur[] ListeJoueurs = new Joueur[2];
    Joueur joueurCourant;
    Grille grilleJeu;
    int JC = 3;

    public Partie() {

        //Joueur j1 = joueur1;
        //Joueur j2 = joueur2;

        //ListeJoueurs[0] = j1;
        //ListeJoueurs[1] = j2;

    }

    public void attribuerCouleursAuxJoueurs() {
        double nb = Math.random();
        int nb1;
        int nb2;

        if (nb >= 0.5) {
            nb1 = 1;
        } else {
            nb1 = 0;
        }

        nb2 = 1 - nb1;

        ListeJoueurs[nb1].affecterCouleur("Rouge");
        ListeJoueurs[nb2].affecterCouleur("Jaune");

    }

    public void initialiserPartie() {
        grilleJeu = new Grille();

        Joueur joueur1;
        Joueur joueur2;
        
        Joueur JoueurCourant;

        Scanner j1 = new Scanner(System.in);
        System.out.println("Rentrez le nom du Joueur 1 :");
        joueur1 = new Joueur(j1.nextLine()); // demander à l'utilisateur de rentrer un message
        System.out.println("Rentrez le nom du Joueur 2 :");
        joueur2 = new Joueur(j1.nextLine());

        ListeJoueurs[0] = joueur1;
        ListeJoueurs[1] = joueur2;

        attribuerCouleursAuxJoueurs();

        for (int i = 0; i < 21; i++) {
            Jeton jeton1 = new Jeton(ListeJoueurs[0].Couleur);
            Jeton jeton2 = new Jeton(ListeJoueurs[1].Couleur);
            ListeJoueurs[0].ajouterJeton(jeton1);
            ListeJoueurs[1].ajouterJeton(jeton2);

        }
        
        // Déterminer de manière aléatoire le premier joueur à jouer.
        //Random r = new Random();
        //boolean premier = r.nextBoolean();
        //if (premier){
            //JoueurCourant = ListeJoueurs[0];
        //}else{
            //JoueurCourant = ListeJoueurs[1];
        //}

        Random alea = new Random();
        int cpt = 0;

        int l_trouNoir;
        int col_trouNoir;
        int l_desin;
        int col_desin;

        for (int j = 0; j < 5; j++) {
            l_trouNoir = alea.nextInt(6) + 1;
            col_trouNoir = alea.nextInt(7) + 1;
            /* ici le random envoie un nbr aleatoire entre 0 et 6 sauf que le 
                reste du programme gère les entrées du joueurs cad les numéros 
                de colonnes entre 1 et 7 d'ou le plus 1.*/
            if (grilleJeu.CellulesJeu[l_trouNoir-1][col_trouNoir-1].presenceTrouNoir() == true){
                j--;
                

            }else{
                grilleJeu.placerTrouNoir(l_trouNoir,col_trouNoir);
                if (j <= 1 && cpt < 2){
                    cpt ++;
                    grilleJeu.placerDesintegrateur(l_trouNoir,col_trouNoir);
                } 
            }
            // while (grilleJeu.CellulesJeu[l_trouNoir][col_trouNoir].presenceTrouNoir() == true) {
                // l_trouNoir = alea.nextInt(5) + 1;
                // col_trouNoir = alea.nextInt(6) + 1;

            
            
            // grilleJeu.placerTrouNoir(l_trouNoir, col_trouNoir);
            
            
            // if (j == 0 || j == 1) {
                // grilleJeu.placerDesintegrateur(l_trouNoir, col_trouNoir);
            // }

        }
        
        Random alea1 = new Random();

        for (int k = 0; k < 3; k++) {
            l_desin = (alea1.nextInt(6)) + 1;
            col_desin = (alea1.nextInt(7)) + 1;
            while (grilleJeu.CellulesJeu[l_desin-1][col_desin-1].presenceDesintegrateur() == true || grilleJeu.CellulesJeu[l_desin-1][col_desin-1].presenceTrouNoir() == true ) {
                l_desin = (alea1.nextInt(6)) + 1;
                col_desin = (alea1.nextInt(7)) + 1;
            }
            grilleJeu.placerDesintegrateur(l_desin, col_desin);

        }

    }

   

       public void debuterPartie() {

        Scanner sc = new Scanner(System.in); // permet de prendre les entrées de l'utilisateur

        boolean partieFinie = false;

        String causePartieFinie = "Non déterminée";

        Joueur joueurCourant;

        Joueur adversaireCourant;

        Jeton jetonCourant = null;
        
        
        while (!partieFinie) {

            if (JC == 0) {

                joueurCourant = ListeJoueurs[1];
                adversaireCourant = ListeJoueurs[0];

                JC = 1; // permet de changer de joueur au prochain appel de cette méthode

            } else { // soit 3 pour le premier tour , soit 1

                joueurCourant = ListeJoueurs[0];
                adversaireCourant = ListeJoueurs[1];

                JC = 0;

            }

            jetonCourant = joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants - 1];
            joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants - 1] = null;
            joueurCourant.nombreJetonsRestants--;

            // 2 tests pour voir si la partie est terminée
            if (grilleJeu.etreRemplie()) {
                partieFinie = true;
                causePartieFinie = "Grille Remplie";
            }

            if (grilleJeu.etreGagnantePourJoueur(adversaireCourant)) {
                partieFinie = true;
                causePartieFinie = "Adversaire gagne";

            }

            //cas où la partie n'est pas terminée, le tour est lancé
            if (!partieFinie) {

                grilleJeu.afficherGrilleSurConsole();
                String OuiNon = "";
                
                if (joueurCourant.nombreDesintegrateurs>0){
                    System.out.println("\nC'est au tour de " + joueurCourant.Nom + " de placer votre jeton\nEst ce que vous souhaitez utiliser un de vos désintégrateur? (O/N)");
                    OuiNon = sc.nextLine();
                    while (!"N".equals(OuiNon) && !"O".equals(OuiNon)){
                        System.out.println("Erreur il faut rentrer O pour oui ou N pour Non\nEst ce que vous souhaitez utiliser un de vos désintégrateur? (O/N)");
                        OuiNon = sc.nextLine();
                    }
                    
                if ("O".equals(OuiNon)){
                    
                    int colDes;
                    int lDes;
                    
                    System.out.println("Entrez les coordonnées du jeton a désintégrer:");
                    System.out.println("Entrez la colonne du jeton a désintégrer:");
                    
                    colDes = sc.nextInt() - 1;
                    while (colDes > 6 || colDes < 0) {
                        System.out.println("Erreur : veuillez saisir une colonne valide :");
                        colDes = sc.nextInt() - 1;
                    }
                    
                    System.out.println("Veuillez saisir la ligne :");
                    lDes = 5 - sc.nextInt();
                    while (lDes> 5 || lDes < 0) {
                        System.out.println("Erreur : veuillez saisir une ligne valide :");
                        lDes = 5 - sc.nextInt() ;
                    }

                    if (grilleJeu.CellulesJeu[lDes][colDes].jetonCourant != null && !grilleJeu.CellulesJeu[lDes][colDes].lireCouleurDuJeton().equals(joueurCourant.Couleur)) {
                        grilleJeu.supprimerJeton(lDes, colDes);
                        grilleJeu.tasserGrille(colDes);
                        joueurCourant.utiliserDesintegrateur();
                    }
                }
                }
                
                System.out.println("\nC'est au tour de "+ joueurCourant.Nom+ " de placer votre jeton\nEntrez un numéro de colonne");
                int colonne = sc.nextInt();

                boolean placementImpossible = grilleJeu.colonneRemplie(colonne);// test si l'emplacement est dispo
                
                while (placementImpossible == true) { // à refaire jusqu'à ce que le choix de colonne soit valide

                    System.out.println("Erreur : la colonne " + colonne + " est remplie.\nEntrez un autre numéro de colonne");
                    colonne = sc.nextInt();

                    placementImpossible = grilleJeu.colonneRemplie(colonne);

                }                
                             
                boolean placerJeton = true; // avant de tester si il y a trou noir
                
                for ( int i = 0 ; i<7 ; i++){
                    if (grilleJeu.CellulesJeu[i][colonne-1].jetonCourant == null)
                        
                        if (grilleJeu.CellulesJeu[i][colonne-1].presenceDesintegrateur() == true){
                            joueurCourant.obtenirDesintegrateur();
                            grilleJeu.CellulesJeu[i][colonne-1].recupererDesintegrateur();
                            
                        }
                        
                        if (grilleJeu.CellulesJeu[i][colonne-1].presenceTrouNoir()){
                            grilleJeu.CellulesJeu[i][colonne-1].activerTrouNoir();
                            boolean PlacerJeton = false;
                        }
                
                        break;
                        
                }
                if (placerJeton){
                    grilleJeu.ajouterJetonDansColonne(joueurCourant, colonne);
                }

            }

            // cas où la partie doit être terminée, partieFinie = true
            if (partieFinie) {
                System.out.println("La partie est terminée");

                if ("Adversaire gagne".equals(causePartieFinie)) {
                    System.out.println(adversaireCourant.Nom + " a gagné la partie ");

                } else {
                    System.out.println("Il y a égalité entre les 2 joueurs");

                }

            }
        }

    }

}



    



