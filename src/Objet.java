import java.awt.*;
import java.io.File;

import javax.imageio.ImageIO;

public abstract class Objet {
    
	/**Attibuts**/
	private double X; 
    private double Y; 
    private boolean actif;
    public Image image;
    public float vitesse;
    
    
    
    /**Constructeur**/ 
    public Objet(double X, double Y, boolean actif, float vitesse, String NomImage) {
        this.X=X; 
        this.Y=Y;
        this.vitesse = vitesse;
        this.actif = actif;
        // R�cup�rer l'image de l'objet 
        try {
            image = ImageIO.read(new File(NomImage));
        } catch (Exception err) {
            System.out.println("Image introuvable !");
        }
    }
    
    
    
    	/**M�thode draw pour pouvoir dessiner les objets plus tard**/
        public void draw (Graphics g){
    	g.drawImage(image,(int)X,(int)Y,null);
    }
}

