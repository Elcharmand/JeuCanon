import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame {
    
    /**Attributs**/
    
    //test
    
    
    /**Constructeur**/
    public Fenetre (String nom) {
        super(nom);
        
        //récupération de la dimension réelle de l'écran et paramétrage des dimensions
        Dimension dimEcran = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setSize((int)dimEcran.getWidth(),(int)dimEcran.getHeight());
        setResizable(false);
        
        //création d'une ouleur et paramétrage de la couleur de fond
        Color sky = new Color(27, 94, 161);
        setBackground(sky);
        
        //paramétrage (et test) de l'icone et des caractéristiques de la fenetre
        try {
        	setIconImage(new ImageIcon(getClass().getResource("picture/icon.gif")).getImage());
        } catch (NullPointerException e) {}
        
        //Instanciation des objets Panneau et Barre
        Panneau panneau = new Panneau();
        Barre barre = new Barre();
        
        
        //création du JPanel définissant le ContentPane
        JPanel cttpane = new JPanel();
        cttpane.setLayout(new BorderLayout());
        cttpane.add(barre,BorderLayout.SOUTH);
        cttpane.add(panneau,BorderLayout.CENTER);
        
        this.setContentPane(cttpane);
        
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
