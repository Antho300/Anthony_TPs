// TP2 ex3, Manipulation des objets (par leur référence) 17/10/2021


package tp2_manip_navarro;

/**
 *
 * @author Anthony
 */
public class TP2_manip_NAVARRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Tartiflette assiette1 = new Tartiflette (500);
        Tartiflette assiette2 = new Tartiflette (600);
        
        Tartiflette assiette3 = assiette2;
        assiette2 = assiette1;
        assiette1 = assiette3;
        
        // Moussaka assiette4 = assiette1; // FAUX
        // Moussaka assiette5 = new Tartiflette(); // FAUX
        
        Moussaka [] tab = new Moussaka [10];
        tab[0] = new Moussaka(1);
        tab[1] = new Moussaka(1);
        tab[2] = new Moussaka(1);
        tab[3] = new Moussaka(1);
        tab[4] = new Moussaka(1);
        tab[5] = new Moussaka(1);
        tab[6] = new Moussaka(1);
        tab[7] = new Moussaka(1);
        tab[8] = new Moussaka(1);
        tab[9] = new Moussaka(1);
        
        System.out.println("nb de calories de Assiette 2 : " + (assiette2.nbCalories + 2));
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);
        
        
        
        
        
        
    }
    
}
