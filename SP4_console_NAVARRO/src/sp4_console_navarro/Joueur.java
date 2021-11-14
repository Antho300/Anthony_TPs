// Classe Joueur
package sp4_console_navarro;

/**
 *
 * @author Anthony
 */
public class Joueur {
    String Nom;
    String Couleur;
    Jeton [] ListeJetons = new Jeton [21];
    int nombreJetonsRestants;
    
    public Joueur (String nom){
        Nom = nom;
    }
    
    public void affecterCouleur (String couleur){
        Couleur = couleur;
    }
    
    public boolean ajouterJeton(Jeton n){
        if (ListeJetons [20] != null){
            return false;
        } else {
            for (int i = 0; i < 21; i++){
                if (ListeJetons[i] == null){
                    ListeJetons[i] = n;
                    break;
                
                
                }   
            }
        } return true;
        
    }
    
}
