import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame {
    
    /**Attributs**/
    
    
    /**Constructeur**/
    public Fenetre (String nom) {
        super(nom);
        
        //r�cup�ration de la dimension r�elle de l'�cran et param�trage des dimensions
        Dimension dimEcran = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setSize((int)dimEcran.getWidth(),(int)dimEcran.getHeight());
        setResizable(false);
        
        //cr�ation d'une ouleur et param�trage de la couleur de fond
        Color sky = new Color(27, 94, 161);
        setBackground(sky);
        
        //param�trage (et test) de l'icone et des caract�ristiques de la fenetre
        try {
        	setIconImage(new ImageIcon(getClass().getResource("picture/icon.gif")).getImage());
        } catch (NullPointerException e) {}
        
        //Instanciation des objets Panneau et Barre
        Panneau panneau = new Panneau();
        Barre barre = new Barre();
        
        
        //cr�ation du JPanel d�finissant le ContentPane
        JPanel cttpane = new JPanel();
        cttpane.setLayout(new BorderLayout());
        cttpane.add(barre,BorderLayout.SOUTH);
        cttpane.add(panneau,BorderLayout.CENTER);
        
        this.setContentPane(cttpane);
        
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
