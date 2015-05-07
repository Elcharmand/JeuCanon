import java.awt.*;
import javax.swing.*;

public class Barrebis extends JPanel{
		private JLabel ventchoisi; 
		private JLabel planetechoisie; 
		private JLabel poidschoisi; 
		private JLabel anglechoisi; 
		private JLabel forcechoisie;
		
		public Barrebis () {
			this.setSize(this.getWidth(), 400);
			this.setBackground(Color.white);
			
			ventchoisi = new JLabel("Vent :" /*+ Barre.Recupvent()*/);
			planetechoisie = new JLabel("Planète :" /* + Barre.planete.getSelectedItem()*/); 
			poidschoisi = new JLabel("Poids :" /* + Barre.poids.getSelectedItem()*/);
			anglechoisi = new JLabel("Poids :" /*+ Barre.angle.getSelectedItem()*/); 
			forcechoisie = new JLabel("Force :" /* + Barre.force.getSelectedItem()*/);
		
			this.add(ventchoisi);
			this.add(planetechoisie);
			this.add(poidschoisi);
			this.add(anglechoisi);
			this.add(forcechoisie);
			
			this.setVisible(true); 
			
		}

	
}
