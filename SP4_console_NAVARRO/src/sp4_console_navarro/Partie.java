// Classe Partie
package sp4_console_navarro;

/**
 *
 * @author Anthony
 */
public class Partie {
    
    Joueur [] ListeJoueurs = new Joueur [2];
    Joueur joueurCourant;
    Grille grilleJeu;
    
    public void attribuerCouleursAuxJoueurs(){
        ListeJoueurs[0].affecterCouleur("Rouge");
        ListeJoueurs[1].affecterCouleur("Jaune");
        
    }
    
    public void initialiserPartie(){
      grilleJeu = new Grille();
      Jeton jeton1 = new Jeton("Rouge");
      Jeton jeton2 = new Jeton("Jaune");
      ListeJoueurs[0].ajouterJeton(jeton1);
      ListeJoueurs[1].ajouterJeton(jeton2);
    }
    
}
