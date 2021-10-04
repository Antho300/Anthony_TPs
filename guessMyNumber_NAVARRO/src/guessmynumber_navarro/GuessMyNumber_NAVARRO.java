// 04/10/2021 TP1 ex3 GuessMyNumber
package guessmynumber_navarro;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Anthony
 */
public class GuessMyNumber_NAVARRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random generateurAleat = new Random();
        //int n = generateurAleat.nextInt(100); // n prend une valeur aléatoire inférieure ou égale à 100
        //System.out.println(n);
        //n = generateurAleat.nextInt(100);
        //System.out.println(n);
        //n = generateurAleat.nextInt(100);
        //System.out.println(n);
        //n = generateurAleat.nextInt(100);
        //System.out.println(n);
        //n = generateurAleat.nextInt(100);
        //System.out.println(n);
        
        int n = generateurAleat.nextInt(100);
        int utilisateur = 101;
        int tentative = 0;
        while (utilisateur != n){
            tentative += 1;
            System.out.println("Saisissez un nombre entre 0 et 100 uniquement.");
            Scanner sc = new Scanner(System.in);
            utilisateur = sc.nextInt();
            if (utilisateur > n){
                System.out.println("Trop grand.");
            } else if (utilisateur < n) {
                System.out.println("Trop petit.");
            }
        }
        
        if (utilisateur == n){
            System.out.println("Egal au nombre généré aléatoirement.");
            System.out.println("Le nombre de tentatives est de : " + tentative);
        }
        
        
        
        
    }
    
}
