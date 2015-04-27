import java.awt.*;

import javax.swing.*;

public class Barre extends JPanel {
	
	/**Consructeur**/
	public Barre () {
		this.setSize(this.getWidth(), 400);
		this.setBackground(Color.white);
		this.add(new JButton("bouton de la barre"));
	}
	
	public void paintComponent(Graphics g) {
		Font font = new Font ("courier",Font.ITALIC,60);
		g.setFont(font);
		g.setColor(Color.black);
		g.drawString("Barre (zone d'affichage des boutons)", 50, 100);
		
		
	}
	
	
}
