// Extension d'une cellule avec des propriétés graphiques.



package sp4_console_navarro;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Anthony
 */
public class CelluleGraphique extends JButton {
    Cellule celluleAssociee;
    ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/Images/celluleVide.png"));
    
    public CelluleGraphique (Cellule uneCellule){
        celluleAssociee = uneCellule;
         
    }
    
    @Override
    public void paintComponent (Graphics G){
        super.paintComponent(G);
        setIcon(img_vide); // On attribue l'image celluleVide.png
    }
    
    
}
