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
        int utilisateur;
        double Kelvin;
        double Celcius;
        double Fahrenheit;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nBonjour, saisissez une valeur :");
        nb1 = sc.nextDouble();
        System.out.println("\nSaisissez la conversion que vous souhaitez effectuer :\n1) De Celcius vers Kelvin\n2) De Kelvin vers Celcius\n3) De Fahrenheit vers Celcius\n4) De Celcius vers Fahrenheit\n5) De Kelvin vers Fahrenheit\n6) De Fahrenheit vers Kelvin");
        utilisateur = sc.nextInt();
        System.out.println("Voici votre choix : " + utilisateur);
        
        if (utilisateur == 1){
            Celcius = nb1;
            Kelvin = CelciusVersKelvin(Celcius);
            System.out.println(Celcius + " °C est égal à " + Kelvin + " K.");
        } else if (utilisateur == 2){
            Kelvin = nb1;
            Celcius = KelvinVersCelcius(Kelvin);
            System.out.println(Kelvin + " K est égal à " + Celcius + " °C.");
       
        } else if (utilisateur == 3){
            Fahrenheit = nb1;
            Celcius = FarenheitVersCelcius(Fahrenheit);
            System.out.println(Fahrenheit + " °F est égal à " + Celcius + " °C.");
       
        } else if (utilisateur == 4){
            Celcius = nb1;
            Fahrenheit = CelciusVersFarenheit(Celcius);
            System.out.println(Celcius + " °C est égal à " + Fahrenheit + " °F.");
       
            
        } else if (utilisateur == 5){
            
        } else if (utilisateur == 6){
            
        } else {
            System.out.println("Désolé, je n'ai pas compris...");
        }
        
        
        
       
    
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
    
    public static double FarenheitVersKelvin(double TempFarenheit){
        double kelvin = (TempFarenheit - 32) / 1.8 + 273.15 ;
        return kelvin;
    }
}
