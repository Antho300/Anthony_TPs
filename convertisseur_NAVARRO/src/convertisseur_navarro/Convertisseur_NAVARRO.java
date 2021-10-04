// 04/10/2021 TP1 ex2 : Un convertisseur de températures

package convertisseur_navarro;

import java.util.Scanner;

/**
 *
 * @author Anthony
 */
public class Convertisseur_NAVARRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double nb1;
        double Kelvin;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer un nombre :");
        nb1 = sc.nextDouble();
        System.out.println("Voici votre nombre : " + nb1);
        Kelvin = nb1 + 273.15;
        System.out.println("Voici votre température en Kelvin : " + Kelvin);
        
        
        
       
    
    }
    
}
