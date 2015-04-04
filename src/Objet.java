import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;

public abstract class  Objet {
   private Point2D.Double position;  
   private boolean actif;

   public Objet (double X, double Y, boolean actif){
       position=new Point2D.Double(X,Y);
       this.actif=actif; 
   }
}
