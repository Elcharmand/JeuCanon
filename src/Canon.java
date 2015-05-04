public class Canon extends Objet{
    
	/**Attributs**/
	private double angle; 
    
    
    
    /**Constructeur**/
    public Canon(double X, double Y, float vitesse, double angle){
        // Attention le nom de l'image du canon doit être appellée "Canon". 
        super (X,Y,true,vitesse,"Canon");
        this.angle=angle; 
    }
    
    
    
    /**Getters**/ 
    public double getAngle(){
        return angle;
    }
    
    public double getVitesse(){
        return vitesse;
    }
    
    /**Setters**/
    public void setAngle (double angle){
        this.angle=angle; 
    }
    
    public void setVitesse (float vitesse){
        this.vitesse=vitesse; 
    }
    
}

