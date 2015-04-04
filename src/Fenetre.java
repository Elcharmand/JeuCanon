import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame {
    
    //Attributs
    
    
    //Constructeur
    public Fenetre (String nom) {
        super(nom);
        
        //récupération de la dimension réelle de l'écran
        Dimension dimensionUtile = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        
        //paramétrage de la dimension
        setSize((int)dimensionUtile.getWidth(),(int)dimensionUtile.getHeight());
        setResizable(false);
        setAlwaysOnTop(true);
        //paramétrage de l'icone de la fenetre
        setIconImage(new ImageIcon(getClass().getResource("picture/icon.gif")).getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Fenetre fenetre = new Fenetre("Canon Crash");
    }
}
