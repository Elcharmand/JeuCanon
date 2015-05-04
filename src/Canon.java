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
    
    //Gestion du draw du canon 
    public void draw (Graphics g){
     // Gestion de l'angle du canon 
   	 // The required drawing location
   	    int drawLocationX = 10;
   	    int drawLocationY = 600;

   	    // Rotation information

   	    double rotationRequired = Math.toRadians(-angle); // On rotationne en fonction de "angle" qui est un attribut de canon.
   	    double locationX = image.getWidth(null) / 2;
   	    double locationY = image.getHeight(null) / 2;
   	    AffineTransform tx = AffineTransform.getRotateInstance(rotationRequired, locationX, locationY);
   	    AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);

   	    // Drawing the rotated image at the required drawing locations 
   	    // On dessine le canon 
   	    g.drawImage(op.filter((BufferedImage) image, null), drawLocationX, drawLocationY, null);
    }
    
    
}

