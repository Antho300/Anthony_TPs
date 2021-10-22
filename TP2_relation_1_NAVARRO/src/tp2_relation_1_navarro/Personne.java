/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_navarro;

/**
 *
 * @author Anthony
 */
public class Personne {
    
    String nom;
    String prenom;
    int nbVoitures ;
    Voiture [] liste_voitures ;

    
    public Personne (String nom1, String prenom1){
        nom = nom1;
        prenom = prenom1;
        liste_voitures = new Voiture [3] ;
        nbVoitures = 0;
    }
    
    
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + prenom;
        
        return chaine_a_retourner ;
    }   
    
    
    
    
}
