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
    	//g.drawImage(image,(int)X,(int)Y,null);
    	// TEST
   	 // The required drawing location
   	    int drawLocationX = 10;
   	    int drawLocationY = 600;

   	    // Rotation information

   	    double rotationRequired = Math.toRadians(angle);
   	    double locationX = image.getWidth(null) / 2;
   	    double locationY = image.getHeight(null) / 2;
   	    AffineTransform tx = AffineTransform.getRotateInstance(rotationRequired, locationX, locationY);
   	    AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);

   	    // Drawing the rotated image at the required drawing locations
   	    g.drawImage(op.filter((BufferedImage) image, null), drawLocationX, drawLocationY, null);
   	    // FIN TEST 
    }
    
}

