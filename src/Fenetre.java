import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class Fenetre extends JFrame {
    
    //Attributs
    
    
    //Constructeur
    public Fenetre (String nom) {
        super(nom);
        
        Dimension dimensionUtile = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        
        setSize((int)dimensionUtile.getWidth(),(int)dimensionUtile.getHeight());
        setResizable(false);
        setAlwaysOnTop(true);
       // setIconImage(new ImageIcon(getClass().getResource("picture/icon.gif")).getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Fenetre fenetre = new Fenetre("Canon Crash");
    }
}
