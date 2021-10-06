// TP 1, ex 4 (Statistiques), 06/10/2021
package stats_navarro;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Anthony
 */
public class Stats_NAVARRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int de [];
        de = new int[6];
        double m;
        int n;
        Random generateurAleat = new Random();
        
        System.out.println("Rentrez un entier");
        Scanner sc = new Scanner (System.in);
        m = sc.nextInt();
        
        for (int i = 0 ; i < m ; i++){
            n = generateurAleat.nextInt(6);
            de[n] += 1;
        }
        
        System.out.println("Voici le pourcentage de tirage de chaque chiffre :");
        for (int j =0 ; j < 6 ; j++){
            int l = j+1;
            System.out.println("Le "+ l +" = "+ de[j] * 100/m+"%.");
        }
        
        
        
        
        
        
      
    }
    
}
