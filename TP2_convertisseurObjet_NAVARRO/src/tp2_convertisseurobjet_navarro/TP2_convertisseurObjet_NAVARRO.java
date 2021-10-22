// Ex 2 TP2, convertisseur mais avec l'utilisation objet 14/10/2021
package tp2_convertisseurobjet_navarro;

import java.util.Scanner;

/**
 *
 * @author Anthony
 */
public class TP2_convertisseurObjet_NAVARRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double nb1;
        int utilisateur;
        
        
        Convertisseur convertisseur = new Convertisseur(); // Initialise nbConversions à 0.
        
        Scanner sc = new Scanner(System.in);
        
        
        
        while (1 == 1){
               
            System.out.println("\nVeuillez saisir une valeur :");
            nb1 = sc.nextDouble();
            System.out.println("\nSaisissez la conversion que vous souhaitez effectuer :\n1) De Celcius vers Kelvin\n2) De Kelvin vers Celcius\n3) De Fahrenheit vers Celcius\n4) De Celcius vers Fahrenheit\n5) De Kelvin vers Fahrenheit\n6) De Fahrenheit vers Kelvin\n7) Je veux quitter.");
            utilisateur = sc.nextInt();
            System.out.println("Voici votre choix : " + utilisateur);

            if (utilisateur == 1){
                convertisseur.CelciusVersKelvin(nb1);

            } else if (utilisateur == 2){
                convertisseur.KelvinVersCelcius(nb1);

            } else if (utilisateur == 3){
                convertisseur.FarenheightVersCelcius(nb1);

            } else if (utilisateur == 4){
                convertisseur.CelciusVersFarenheight(nb1);

            } else if (utilisateur == 5){
                convertisseur.KelvinVersFarenheight(nb1);

            } else if (utilisateur == 6){
                convertisseur.FarenheightVersKelvin(nb1);

            } else if (utilisateur == 7) {
                break;

            } else {
                System.out.println("Désolé, je n'ai pas compris...");
                continue;
            }

            
            
            
            
            
            
            
        }
        
        System.out.println(convertisseur);
        
        
    }     
        
   
    
}
