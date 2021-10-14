// Classe "Convertisseur" EX 2 TP2, 14/10/2021
package tp2_convertisseurobjet_navarro;

/**
 *
 * @author Anthony
 */
public class Convertisseur {
    
    public Convertisseur () {
        int nbConversions = 0;
    }
    
    public void CelciusVersKelvin (double Celcius) {
        double TempCelcius = Celcius;
        double Tempkelvin = Celcius + 273.15;
        System.out.println(TempCelcius + " °C est égal à " + Tempkelvin + " K.");
    }
    
    public void KelvinVersCelcius (double Kelvin){
        double TempKelvin = Kelvin;
        double TempCelcius = TempKelvin - 273.15;
        System.out.println(TempKelvin + " K est égal à " + TempCelcius + " °C.");
    }
    
    public void FarenheightVersCelcius (double Farenheight){
        double TempFarenheight = Farenheight;
        double TempsCelcius = (TempFarenheight - 32) * 5/9;
        System.out.println(TempFarenheight + " °F est égal à " + TempsCelcius + " °C.");
    
    }
    
    
    public void CelciusVersFarenheight (double Celcius) {
        double TempCelcius = Celcius;
        double Farenheit = TempCelcius * 9/5 + 32;
        System.out.println(TempCelcius + " °C est égal à " + Farenheit + " °F.");
    }
    
    
    public void FarenheightVersKelvin (double Farenheight){
        double TempFarenheight = Farenheight;
        double kelvin = (TempFarenheight - 32) / 1.8 + 273.15 ;
        System.out.println(TempFarenheight + " °F est égal à " + kelvin + " K.");
    }
    
    
    public void KelvinVersFarenheight (double Kelvin){
        double TempKelvin = Kelvin;
        double Farenheit = (TempKelvin - 273.15) * 1.8 + 32 ;
        System.out.println(TempKelvin + " K est égal à " + Farenheit + " °F.");
    }
    
    @Override
    public String toString () {
        return "nb de conversions"+ nbConversions;
    }

    
    
    
        
    
        
        
    
    
    
}
