public class Equation {
    private double vent;
    private double hygro;
    private double pression;
    private double temperature;

    public Equation(double vent, double hygro, double pression, double temperature) {

        this.vent = vent;
        this.hygro = hygro;
        this.pression = pression;
        this.temperature = temperature;
    }
    // Ci après les différents set pour mettre en place les données

    public void setVent(double vent) {
        this.vent = vent;
    }

    public void setHygro(double hygro) {
        this.hygro = hygro;
    }

    public void setPression(double pression) {
        this.pression = pression;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int[] calcul(int t, Canon canon, Planete planete) {

        int[] position = new int[2];
        position[0] = ((int) (canon.getVitesse() * Math.cos(canon.getAngle()) * t));
        position[1] =
            (int) (-(1 / 2) * planete.getGravite() * t * t + canon.getVitesse() * Math.sin(canon.getAngle()) * t);
        // position correspond au point de départ que l'on modifie ensuite avec les formules c'est un point de coordonnées X,Y
        // Avec les équations, on calcule les postitions successives :
        // en 0 la position en X, en 1 la position en Y

        return position;
    }


}
