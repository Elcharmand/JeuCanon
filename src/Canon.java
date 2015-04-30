public class Canon extends Objet{
    private double angle; 
    
    public Canon(double X, double Y, float vitesse, double angle){
        // Attention le nom de l'image du canon doit être appellée "Canon". 
        super (X,Y,true,vitesse,"Canon");
        this.angle=angle; 
    }
    
    //Permet de donner l'angle 
    public void setAngle (double angle){
        this.angle=angle; 
    }
    // Permet de donner la vitesse 
    public void setVitesse (float vitesse){
        this.vitesse=vitesse; 
    }
    
    public double getAngle(){
        return angle;
    }
    public double getVitesse(){
        return vitesse;
    }
}

