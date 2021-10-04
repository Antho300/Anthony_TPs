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
        Kelvin = CelciusVersKelvin(nb1);
        System.out.println("Voici votre température en Kelvin : " + Kelvin);
        
        
        
       
    
    }
    
    
    public static double CelciusVersKelvin(double TempCelcius){
        double kelvin = TempCelcius + 273.15;
        return kelvin;
    }
    
    public static double FarenheitVersCelcius(double TempFarenheit){
        double celcius = (TempFarenheit - 32) / 1.8;
        return celcius;
    }
    
    public static double CelciusVersFarenheit(double TempCelcius){
        double farenheit = TempCelcius * (9/5) + 32;
        return farenheit;
    }
    
    public static double KelvinVersFarenheit(double TempKelvin){
        double farenheit = (TempKelvin - 273.15) * 1.8 + 32 ;
        return farenheit;
    }
}
