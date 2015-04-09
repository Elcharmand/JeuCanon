import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame {
    
    /**Attributs**/
    
    
    /**Constructeur**/
    public Fenetre (String nom) {
        super(nom);
        
        //récupération de la dimension réelle de l'écran et paramétrage des dimensions
        Dimension dimensionUtile = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setSize((int)dimensionUtile.getWidth(),(int)dimensionUtile.getHeight());
        setResizable(false);
        
        //paramétrage (et test) de l'icone et des caractéristiques de la fenetre
        try {
        	setIconImage(new ImageIcon(getClass().getResource("picture/icon.gif")).getImage());
        } catch (NullPointerException Exp) {}
        
        //création d'un JPanel et définition du ContentPane
        setContentPane(new Panneau());
        
        //paramétrages des opérations primaires
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Fenetre fenetre = new Fenetre("Canon Crash");
    }
}
