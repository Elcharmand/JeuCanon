public class Brique extends Objet {

	/**Attributs**/
	private int hauteur; 
    private int largeur; 
    
    
    
    /**Constructeur**/
    public Brique (double X, double Y, boolean actif,int h,int l){
       super(X,Y,actif, 0, "Brique.png");
       hauteur=h;
       largeur=l;
    }

}