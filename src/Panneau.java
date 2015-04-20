import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Panneau extends JPanel {
	
	/**Consructeur**/
	public Panneau () {
		this.setSize(this.getWidth(), this.getHeight()-400);
	}
	
	public void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D)g;
		
		//création du fond du panneau (le ciel)
	    GradientPaint gp; 
	    gp = new GradientPaint(0, 0, new Color(0, 135, 255), 0, this.getHeight(), new Color(200, 230, 255), false);
	    g2d.setPaint(gp);
	    g2d.fillRect(0, 0, this.getWidth(), this.getHeight());               
	    
	    //
	    g.setColor(Color.DARK_GRAY);
		g.drawLine(0, 0, getWidth(), getHeight());
		g.drawLine(0, getHeight(), getWidth(), 0);
		Font font = new Font ("courier",Font.ITALIC,60);
		g.setFont(font);
		g.setColor(Color.white);
		g.drawString("Panneau (zone d'affichage du Buffer)", 50, 100);
		
	}               
}