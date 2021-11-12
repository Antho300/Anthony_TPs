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
    Jeton nombreJetonsRestants;
    
    public Joueur (String nom){
        Nom = nom;
    }
    
    public void affecterCouleur (String couleur){
        Couleur = couleur;
    }
    
    public boolean ajouterJeton(Jeton){
        
        ListeJetons[21 - nombreJetonsRestants] = Jeton;
        
    }
    
}
