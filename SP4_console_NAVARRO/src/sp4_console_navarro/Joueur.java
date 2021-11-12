// Classe Joueur
package sp4_console_navarro;

/**
 *
 * @author Anthony
 */
public class Joueur {
    String Nom;
    String Couleur;
    Jeton [] ListeJetons= new Jeton [21];
    int nombreJetonsRestants;
    
    public Joueur (String nom){
        Nom = nom;
    }
    
    public void affecterCouleur (String couleur){
        Couleur = couleur;
    }
    
    public boolean ajouterJeton(Jeton n){
        int position = 21 - nombreJetonsRestants;
        ListeJetons[position] = n;
        
    }
    
}
