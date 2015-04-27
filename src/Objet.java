import java.awt.Image;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;

import java.io.File;

import javax.imageio.ImageIO;

public abstract class Objet {
    private Point2D.Double position;
    private boolean actif;
    public Image image;
    public float vitesse;

    public Objet(double X, double Y, boolean actif, float vitesse, String NomImage) {
        position = new Point2D.Double(X, Y);
        this.vitesse = vitesse;
        this.actif = actif;
        // Récupérer l'image de l'objet 
        try {
            image = ImageIO.read(new File(NomImage));
        } catch (Exception err) {
            System.out.println("Image introuvable !");
        }
    }
}

