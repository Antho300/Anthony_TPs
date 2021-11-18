// Projet super puissance 4.
package sp4_console_navarro;

/**
 *
 * @author Anthony
 */
public class SP4_console_NAVARRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Jeton j = new Jeton("Jaune"); // Tester les classes
        // System.out.println(j.lireCouleur());
        
        // Cellule c = new Cellule();
        // System.out.println(c.lireCouleurDuJeton());
        // c.affecterJeton(j);
        // System.out.println(c.lireCouleurDuJeton());
        // Grille g = new Grille();
        // g.afficherGrilleSurConsole();
        // g.ajouterJetonDansColonne(j, 5);
        // g.afficherGrilleSurConsole();
        
        
        
        
        Joueur joueur1 = new Joueur("joueur1");
        Joueur joueur2 = new Joueur("joueur2");
        
        Partie partie = new Partie(joueur1 , joueur2);
        
        partie.initialiserPartie();
        partie.debuterPartie();
        
        
        
        
        
    }
    
}
