import javax.swing.*;
import java.awt.*;

public class Panneau extends JPanel { 
	
	public void paintComponent(Graphics g){
	    //Vous verrez cette phrase chaque fois que la m�thode sera invoqu�e
		System.out.println("Je suis ex�cut�e !"); 
		g.setColor(Color.DARK_GRAY);
		g.drawLine(0, 0, getWidth(), getHeight());
		g.drawLine(0, getHeight(), getWidth(), 0);
	}               
}