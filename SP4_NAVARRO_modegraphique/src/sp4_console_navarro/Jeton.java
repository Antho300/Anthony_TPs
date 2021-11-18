// Classe Jeton
package sp4_console_navarro;

/**
 *
 * @author Anthony
 */
public class Jeton {
    
    String Couleur;
    
    Jeton (String couleur){
        Couleur = couleur;
    }
    
    String lireCouleur(){
       return Couleur; 
    }
}

