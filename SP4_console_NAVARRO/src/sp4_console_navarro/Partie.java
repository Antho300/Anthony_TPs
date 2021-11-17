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
    
}
