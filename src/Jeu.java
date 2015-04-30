import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Jeu {
    private Timer timer; 
    private long temps; 
    private Fenetre fenetreJeu; 
    private Canon canon; 
    private Boulet boulet; 
    private boolean finJeu; 
    
    
    public Jeu(){
        // Gestion du temps 
        temps=0;
        timer = new Timer(50,new TimerAction()); 
        timer.start();
        timer.setDelay(50);
        //
        // Gestion de la fenêtre 
        fenetreJeu = new Fenetre("Plateau de jeu 1"); 
        //
        // Création des objets présents 
        // On crée le boulet : X, Y, actif , masse en kg, rayon en pixel 
        boulet = new Boulet(0,0,true, 10, 10);      
        // On crée le canon : X Y, actif, vitesse, angle
        canon = new Canon (0,0, 10, 45);
        finJeu= false; 
    }
    
    private class TimerAction implements ActionListener{
        public void actionPerformed(ActionEvent e){
            temps++;
        }
    }
    
    /*public static void main (String[] args) {
        
    }*/
}
