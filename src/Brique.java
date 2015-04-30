

public class Brique extends Objet {
    private int hauteur; 
    private int largeur; 
    
    public Brique (double X, double Y, boolean actif,int h,int l){
       super(X,Y,actif, 0, "Brique.png");
       hauteur=h;
       largeur=l;
    }
}
