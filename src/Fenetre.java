import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame {
    
    //Attributs
    
    
    //Constructeur
    public Fenetre (String nom) {
        super(nom);
        
        //r�cup�ration de la dimension r�elle de l'�cran
        Dimension dimensionUtile = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        
        //param�trage de la dimension
        setSize((int)dimensionUtile.getWidth(),(int)dimensionUtile.getHeight());
        setResizable(false);
        setAlwaysOnTop(true);
        //param�trage de l'icone de la fenetre
        setIconImage(new ImageIcon(getClass().getResource("picture/icon.gif")).getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Fenetre fenetre = new Fenetre("Canon Crash");
    }
}
