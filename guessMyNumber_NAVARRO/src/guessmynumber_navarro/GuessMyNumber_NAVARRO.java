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
        int cauchemar = generateurAleat.nextInt(100);
        int utilisateur = 101;
        int tentative = 0;
        int mode = 0;
        int echoue = 0;
        int proba = 0;
        
        while (mode < 1 || mode > 4){
            System.out.println("Choisissez votre mode de difficulté :\n1 = Facile\n2 = Normal\n3 = Difficile\n4 = Cauchemar");
            Scanner sc2 = new Scanner(System.in);
            mode = sc2.nextInt();
        }
       
        if (mode == 1){
            
            while (utilisateur != n){
            tentative += 1;
            System.out.println("Saisissez un nombre entre 0 et 100 uniquement.");
            Scanner sc = new Scanner(System.in);
            utilisateur = sc.nextInt();
            if (utilisateur > n){
                if (utilisateur - n > 20){
                    System.out.println("Trop grand de plus de 20.");
                } else if (utilisateur - n < 20 && utilisateur - n > 10){
                    System.out.println("Trop grand de plus de 10 mais moins de 20.");
                } else {
                    System.out.println("Vous vous rapprochez (moins de 10), mais c'est trop grand.");
                }
               
            } else if (utilisateur < n) {
                if (n - utilisateur > 20){
                    System.out.println("Trop petit de plus de 20.");
                } else if (n - utilisateur < 20 && n - utilisateur > 10){
                    System.out.println("Trop petit de plus de 10 mais moins de 20.");
                } else {
                    System.out.println("Vous vous rapprochez (moins de 10), mais c'est trop petit.");
                }
            }
        }
            
        } else if (mode == 2){
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
            
        } else if (mode == 3){
            System.out.println("Attention, vous n'avez que 4 tentatives, et aucune aide d'intervalle.");
            while (utilisateur != n && echoue != 4){
            tentative += 1;
            echoue += 1;
            System.out.println("Saisissez un nombre entre 0 et 100 uniquement.");
            Scanner sc = new Scanner(System.in);
            utilisateur = sc.nextInt();
            if (utilisateur > n){
                System.out.println("Trop grand.");
            } else if (utilisateur < n) {
                System.out.println("Trop petit.");
            }
        }
        }else if (mode == 4){
            System.out.println("Attention, vous avez selectionné le mode 'cauchemar', vous n'avez aucune aide d'intervalle.");
            
            while (utilisateur != n){
            proba = generateurAleat.nextInt(100);
            tentative += 1;
            System.out.println("Saisissez un nombre entre 0 et 100 uniquement.");
            Scanner sc = new Scanner(System.in);
            utilisateur = sc.nextInt();
            
            if (proba <= 30){
                if (utilisateur > n){
                    System.out.println("Trop petit.");
                } else if (utilisateur < n) {
                    System.out.println("Trop grand.");
            }
            } else if (proba > 30){
                if (utilisateur > n){
                    System.out.println("Trop grand.");
                } else if (utilisateur < n) {
                    System.out.println("Trop petit.");
            }
            
        }
        }
            
             
        
        
        if (utilisateur == n){
            System.out.println("Egal au nombre généré aléatoirement.");
            System.out.println("Le nombre de tentatives est de : " + tentative);
        } else if (echoue == 4){
            System.out.println("Le nombre de tentatives est de : " + tentative);
            System.out.println("Vous avez donc atteint le nombre maximal de coups, c'est perdu...");
        }
        
        
        
        
    }
    
}
