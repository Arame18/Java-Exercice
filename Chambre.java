public class Chambre extends Local{
    private float dimension;
    
    public Chambre(String localisation, String ref, float prix, int tauxloc, String numeroRef, float dimension) {
        super(localisation, ref, prix, tauxloc, numeroRef);
        this.dimension = dimension;
    }
    public float getDimension() {
        return this.dimension;
    }
    public void setDimension(float dimension) {
        this.dimension = dimension;
    }

    public Chambre(String localisation, String ref, float prix, int tauxloc, String numeroRef) {
        super(localisation, ref, prix, tauxloc, numeroRef);
        //TODO Auto-generated constructor stub
    }

   

    

    public String afficher(){
        return " dimension : " + this.dimension
        + "\n localisation : " + getLocalisation()
        + "\n reference : " + getRef()
        + "\n prix : " + getPrix()
        + "\n taux localisation : " + getTauxloc();
    }
    public Local getLocal() {
        return null;
    }
   


}
