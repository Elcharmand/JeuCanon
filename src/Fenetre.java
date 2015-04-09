import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame {
    
    /**Attributs**/
    
    
    /**Constructeur**/
    public Fenetre (String nom) {
        super(nom);
        
        //r�cup�ration de la dimension r�elle de l'�cran et param�trage des dimensions
        Dimension dimensionUtile = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setSize((int)dimensionUtile.getWidth(),(int)dimensionUtile.getHeight());
        setResizable(false);
        
        //param�trage (et test) de l'icone et des caract�ristiques de la fenetre
        try {
        	setIconImage(new ImageIcon(getClass().getResource("picture/icon.gif")).getImage());
        } catch (NullPointerException Exp) {}
        
        //cr�ation d'un JPanel et d�finition du ContentPane
        setContentPane(new Panneau());
        
        //param�trages des op�rations primaires
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Fenetre fenetre = new Fenetre("Canon Crash");
    }
}
