import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Jeu extends JFrame{
    private Timer timer; 
    private long temps; 
    private Fenetre fenetreJeu; 
    private Canon canon; 
    private Boulet boulet; 
    private Brique brique; 
    private boolean finJeu; 
    private LinkedList<Objet> Objets; 
    
    
    public Jeu(){
        // Gestion du temps 
        temps=0;
        timer = new Timer(50,new TimerAction()); 
        timer.start();
        timer.setDelay(50);
        canon = new Canon(10,600,0,15);
        //
        // Création d'une liste d'objets 
        Objets = new LinkedList<Objet>();
        Objets.add(canon);
        Objets.add(boulet);
        Objets.add(brique);
        //
        // Gestion de la fenêtre 
        fenetreJeu = new Fenetre("Plateau de jeu 1"); 
        //
        // Création des objets présents 
        // On crée le boulet : X, Y, actif , masse en kg, rayon en pixel 
        boulet = new Boulet(0,0,true, 10, 10);      
        finJeu= false; 
    }
    
    private class TimerAction implements ActionListener{
        public void actionPerformed(ActionEvent e){
            temps++;
        }
    }
    
    public static void main (String[] args) {
        Jeu CanonCrash=new Jeu(); 
    }
}
