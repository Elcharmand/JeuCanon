public class Planete {
    private double gravite;
    private String NomPlanete;
    private int NumPlanete;

    public Planete(double gravite, String NomPlanete, int NumPlanete) {
        this.gravite = gravite;
        this.NomPlanete = NomPlanete;
        this.NumPlanete = NumPlanete;
    }

    public Planete(int NumPlanete) {
        switch (NumPlanete) {
        case 1:
            this.gravite=9.81;
            this.NomPlanete="Terre";
            this.NumPlanete=NumPlanete;
            break;
        case 2:
            this.gravite=1.63;
            this.NomPlanete="Lune";
            this.NumPlanete=NumPlanete;
            break;
        }
    }
    public double getGravite (){
        return gravite; 
    }
    public String getNomPlanete (){
        return NomPlanete; 
    }
}
