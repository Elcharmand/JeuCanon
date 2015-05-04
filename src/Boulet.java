public class Boulet extends Objet {
    
	/**Attributs**/
	private double poids;
    private double rayon;
    
    
    
    /**Constructeur**/
    public Boulet (double X,double Y, boolean actif, double poids,double rayon){
        super(X,Y,actif, 0, "Boulet.png");
            this.poids=poids;
            this.rayon=rayon;
    }
    
}
