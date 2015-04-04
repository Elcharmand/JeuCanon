public class Canon extends Objet{
    private double vitesse; 
    private double angle; 
    
    public Canon(double X, double Y, boolean actif,double vitesse, double angle){
        super(X,Y,true);
        this.vitesse=vitesse; 
        this.angle=angle; 
    }
    
    public void setAngle (double angle){
        this.angle=angle; 
    }
    
    public void setVitesse (double vitesse){
        this.vitesse=vitesse; 
    }
    
    public double getAngle(){
        return angle;
    }
    public double getVitesse(){
        return vitesse;
    }
}
