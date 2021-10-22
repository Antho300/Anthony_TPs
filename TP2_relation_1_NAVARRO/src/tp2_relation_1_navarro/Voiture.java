/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_navarro;

/**
 *
 * @author Anthony
 */
public class Voiture {
    
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne Proprietaire;
    
    public Voiture (String Modele1, String Marque1, int Puissance) {
        Modele = Modele1;
        Marque = Marque1;
        PuissanceCV = Puissance;
        Proprietaire = null;
        
    }
        
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = Modele + Marque + PuissanceCV ; 
        
        return chaine_a_retourner ;
    }   
        
    
    
    
}
