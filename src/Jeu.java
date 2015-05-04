import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.swing.*;

public class Jeu extends JFrame {
	
	/**Attributs**/
	private Timer timer; 
    private long temps;
    private Canon canon;
    private Boulet boulet;
    private BufferedImage ArrierePlan;
    private Graphics buffer;
    private boolean ToucheHaut, ToucheBas, ToucheEspace;
    private Rectangle EcranPanneau;
    private boolean finJeu;
    
    
    
    /**Constructeur**/
    public Jeu(){
    	// Définition des dimensions du Frame
        setSize(700,480);
        setResizable(false);

        temps=0;
        ToucheHaut=false;
        ToucheBas=false;
        ToucheEspace=false;
        EcranPanneau=new Rectangle(getInsets().left,getInsets().top,getSize().width-getInsets().right-getInsets().left,getSize().height-getInsets().bottom-getInsets().top);
        ArrierePlan =new BufferedImage(getSize().width,getSize().height,BufferedImage.TYPE_INT_RGB);
        buffer = ArrierePlan.getGraphics();
        
        // déclaration du timer et des objets
        timer = new Timer(60, new TimerAction());
        
        finJeu=false;
        
        timer.start();
        
        this.addKeyListener(new Jeu_this_keyAdapter());
        
        //opérations de la fenêtre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    
    
  	/**Classe de gestion des listeners**/
    private class Jeu_this_keyAdapter extends KeyAdapter {
        
        public void keyPressed (KeyEvent e) {
            int code = e.getKeyCode();
            switch (code) {
            case KeyEvent.VK_SPACE :
                ToucheEspace = true;
                break;
            case KeyEvent.VK_UP :
                ToucheHaut = true;
                break;
            case KeyEvent.VK_DOWN :
                ToucheBas = true;
                break;
            case KeyEvent.VK_ESCAPE :
                System.exit(0);
                break;
            case KeyEvent.VK_ENTER :
                if (timer.isRunning())
                    timer.stop();
                else
                    timer.start();
                break;
            }

        }
        
        
        
        public void keyReleased (KeyEvent e) {
            int code = e.getKeyCode();
            switch (code) {
            case KeyEvent.VK_SPACE :
                ToucheEspace = false;
                break;
            case KeyEvent.VK_UP :
                ToucheHaut = false;
                break;
            case KeyEvent.VK_DOWN :
                ToucheBas = false;
                break;
            }
        }
        
    }
    
    
    
    /**Classe de gestion du timer**/
    private class TimerAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            boucle_principale_jeu();
            temps++;
        }
    }
    
    
    
    /**méthode de gestion du plateau de jeu**/
    public void boucle_principale_jeu() {
    	
    }
    
    
    
    /**Main**/
    public static void main (String[] args) {
        Jeu jeu1 = new Jeu ();
    }
}
