// 04/10/2021 Exercice 1 TP1 : Saisie et manipulation de nombres

package manipnombresint_navarro;

import java.util.Scanner;

/**
 *
 * @author Anthony
 */
public class ManipNombresInt_NAVARRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int nb1;
        int nb2;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer un nombre :");
        nb1 = sc.nextInt();
        System.out.println("\n Entrer un autre nombre :");
        nb2 = sc.nextInt();
        
        System.out.println("Voici les nombres choisis :");
        System.out.println(nb1 + " " + nb2);
        System.out.println("Voici leur somme :");
        System.out.println(nb1+nb2);
        System.out.println("Voici leur différence :");
        System.out.println(nb1-nb2);
        System.out.println("Voici leur produit :");
        System.out.println(nb1*nb2);
        System.out.println("Voici le quotient :");
        System.out.println(nb1/nb2);
        System.out.println("Voici le reste :");
        System.out.println(nb1%nb2);
        
        
        
        
               
       
        



// TODO code application logic here
    }
    
}
