import java.awt.*;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Barre extends JPanel {
    
    //concerne le vent 
    private JComboBox vent = new JComboBox(); 
    private JLabel ventlabel = new JLabel("Vent : (m/s)"); 
    //concerne la planète 
    private JComboBox planete = new JComboBox(); 
    private JLabel planetelabel = new JLabel("Planète :"); 
    //concerne le poids
    private JComboBox poids = new JComboBox(); 
    private JLabel poidslabel = new JLabel("Poids : (kg)"); 
    //concerne l’angle
    private JComboBox angle = new JComboBox(); 
    private JLabel anglelabel = new JLabel("Angle : (°)"); 
    //concerne la force
    private JComboBox force = new JComboBox(); 
    private JLabel forcelabel = new JLabel("Force : (N)"); //intensité ne serait-il pas plus clair dans l’esprit des gens ??


//pour la récupération des items sélectionnés
	private JLabel ventchoisi; 
	private JLabel planetechoisie; 
	private JLabel poidschoisi; 
	private JLabel anglechoisi; 
	private JLabel forcechoisie;
	
	private String saisievent = new String();
	private String saisieplanete = new String();
	private String saisiepoids = new String();
	private String saisieangle = new String();
	private String saisieforce = new String();
    
    /**Constructeur**/
    public Barre () {
        this.setSize(this.getWidth(), 400);
        this.setBackground(Color.white);
        //concerne le vent //création du menu défilant
          vent.addItemListener (new VentItem()); //listener de choix du vent
          vent.addActionListener(new VentAction()); //listener d’action de choix du vent
          vent.setPreferredSize(new Dimension(100, 20)); //choix de la taille du cadre défilant 
          vent.addItem("10"); //choix des options
          vent.addItem("20");
          vent.addItem("30");
          vent.addItem("50");
          vent.addItem("70");
          vent.addItem("100");
        //concerne les planètes //création du menu défilant
          planete.addItemListener (new PlaneteItem()); //listener de choix de la planète
          planete.addActionListener(new PlaneteAction()); //listener d’action de choix de la planète
          planete.setPreferredSize(new Dimension(100, 20)); //choix de la taille du cadre défilant 
          planete.addItem("Pluton"); //choix des options
          planete.addItem("Terre");
          planete.addItem("Mercure");
          planete.addItem("Saturne");
          planete.addItem("Mars");
          planete.addItem("Vénus");
          planete.addItem("Uranus");
          planete.addItem("Jupiter");
          planete.addItem("Neptune");
          planete.addItem("Lune");
        //concerne le poids //création du menu défilant
          poids.addItemListener (new PoidsItem()); //listener d’item de choix du poids    
          poids.addActionListener(new PoidsAction()); //listener d’action de choix du poids
          poids.setPreferredSize(new Dimension(100, 20)); //choix de la taille du cadre défilant 
          poids.addItem("1"); //choix des options
          poids.addItem("5");
          poids.addItem("8");
          poids.addItem("10");
          poids.addItem("30");
          poids.addItem("50");
          poids.addItem("80");
          poids.addItem("100");
        //concerne l’angle //création du menu défilant
          angle.addItemListener (new AngleItem()); //listener d’item de choix de l’angle   
          angle.addActionListener(new AngleAction()); //listener d’action de choix de l’angle
          angle.setPreferredSize(new Dimension(100, 20)); //choix de la taille du cadre défilant 
          angle.addItem("10"); //choix des options
          angle.addItem("20");
          angle.addItem("30");
          angle.addItem("40");
          angle.addItem("50");
          angle.addItem("60");
          angle.addItem("70");
          angle.addItem("80");
        //concerne la force //création du menu défilant
          force.addItemListener (new ForceItem()); //listener d’item de choix de la force   
          force.addActionListener(new ForceAction()); //listener d’action de choix de la force
          force.setPreferredSize(new Dimension(100, 20)); //choix de la taille du cadre défilant 
          force.addItem("5"); //choix des options
          force.addItem("10");
          force.addItem("30");
          force.addItem("50");
          force.addItem("80");
          force.addItem("100");


          JPanel top = new JPanel(); //création d’un panel dans lequel on va mettre tout ce qui concerne les sélections/choix de l’utilisateur
          top.add(ventlabel); //on ajoute tous les labels et combobox dans le jpanel
          top.add(vent);
          top.add(planetelabel);
          top.add(planete);
          top.add(poidslabel);
          top.add(poids);
          top.add(anglelabel);
          top.add(angle);
          top.add(forcelabel);
          top.add(force);
          
          ventchoisi = new JLabel("Vent :" + saisievent);
          planetechoisie = new JLabel("Planète :" + saisieplanete); 
          poidschoisi = new JLabel("Poids :" + saisiepoids);
          anglechoisi = new JLabel("Poids :" + saisieangle); 
          forcechoisie = new JLabel("Force :" + saisieforce);
          
          JPanel topbis = new JPanel();
          topbis.add(ventchoisi);
          topbis.add(planetechoisie);
          topbis.add(poidschoisi);
          topbis.add(anglechoisi);
          topbis.add(forcechoisie);
         
          this.add(top); //pour faire apparaître dans le container le JPanel nommé “top” en haut du container //Armand tu peux ajouter ton autre code dans un autre container normalement et tout mettre dans un jpanel que tu mettras “south” 
          this.add(topbis);
          this.setVisible(true);     //pour rendre le truc visible  //normalement déjà mise    
    }
    
    public void paintComponent(Graphics g) {
        Font font = new Font ("courier",Font.ITALIC,60);
        g.setFont(font);
        g.setColor(Color.black);
        g.drawString("Barre (zone d'affichage des boutons)", 50, 100);
        
    }
    
    //classes qui gèrent les listener d’items
    class VentItem implements ItemListener{
      public void itemStateChanged(ItemEvent choixvent) { //permet d’afficher les choix effectués
        System.out.println("Le choix du vent est : " + choixvent.getItem()); 
     }
    }
    class PlaneteItem implements ItemListener{
      public void itemStateChanged(ItemEvent choixplanete) { //planète
        System.out.println("Le choix de la planète est : " + choixplanete.getItem()); 
     }
    }
    class PoidsItem implements ItemListener{
     public void itemStateChanged(ItemEvent choixpoids) { //poids
        System.out.println("Le choix du poids est : " + choixpoids.getItem()); 
     }
    }
    class AngleItem implements ItemListener{
    public void itemStateChanged(ItemEvent choixangle) { //angle
        System.out.println("Le choix de l’angle est : " + choixangle.getItem()); 
     }
    }
    class ForceItem implements ItemListener{
    public void itemStateChanged(ItemEvent choixforce) { //force
        System.out.println("Le choix de la force est : " + choixforce.getItem()); 
      }
    }

    //actionListener
    class VentAction implements ActionListener{
      public void actionPerformed(ActionEvent choixvent) {
        System.out.println("ActionListener : vent sur " + vent.getSelectedItem()); //affiche le vent sélectionné
        saisievent = (String) vent.getSelectedItem(); //paramétrage de la variable saisievent
      }               
    }
    class PlaneteAction implements ActionListener{
      public void actionPerformed(ActionEvent choixplanete) {
        System.out.println("ActionListener : planète sur " + planete.getSelectedItem()); //affiche la planète sélectionnée
        saisieplanete = (String) planete.getSelectedItem();
      }               
    }
    class PoidsAction implements ActionListener{
      public void actionPerformed(ActionEvent choixpoids) {
        System.out.println("ActionListener : poids sur " + poids.getSelectedItem()); //affiche le poids sélectionné
        saisiepoids = (String) poids.getSelectedItem();
      }               
    }
    class AngleAction implements ActionListener{
      public void actionPerformed(ActionEvent choixangle) {
        System.out.println("ActionListener : angle sur " + angle.getSelectedItem()); //affiche l’angle sélectionné
        saisieangle = (String) angle.getSelectedItem();
      }               
    }
    class ForceAction implements ActionListener{
      public void actionPerformed(ActionEvent choixforce) {
        System.out.println("ActionListener : force sur " + force.getSelectedItem()); //affiche la force sélectionnée
        saisieforce = (String) force.getSelectedItem();
      }       
    
}


