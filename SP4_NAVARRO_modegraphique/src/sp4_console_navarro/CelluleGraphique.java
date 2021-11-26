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
    ImageIcon img_desintegrateur = new javax.swing.ImageIcon(getClass().getResource("/Images/desintegrateur.png"));
    ImageIcon img_jetonJaune = new javax.swing.ImageIcon(getClass().getResource("/Images/jetonJaune.png"));
    ImageIcon img_jetonRouge = new javax.swing.ImageIcon(getClass().getResource("/Images/jetonRouge.png"));
    ImageIcon img_trouNoir = new javax.swing.ImageIcon(getClass().getResource("/Images/trouNoir.png"));

    public CelluleGraphique(Cellule uneCellule) {
        celluleAssociee = uneCellule;

    }

    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        if (celluleAssociee.presenceTrouNoir() == true) {
            setIcon(img_trouNoir);
        } else if (celluleAssociee.presenceDesintegrateur() == true) {
            setIcon(img_desintegrateur);

        } else {
            String couleur_jeton = celluleAssociee.lireCouleurDuJeton();
            switch (couleur_jeton) {
                case "vide":
                    setIcon(img_vide); // On attribue l'image celluleVide.png
                    break;
                case "Rouge":
                    setIcon(img_jetonRouge);
                    break;
                case "Jaune":
                    setIcon(img_jetonJaune);
                    break;
            }
        }

    }

}
