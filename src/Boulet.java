public class Boulet extends Objet {
    private double poids;
    private double rayon;
    
    public Boulet (double X,double Y, boolean actif, double poids,double rayon){
        super(X,Y,actif);
            this.poids=poids;
            this.rayon=rayon;
    }
    
}
