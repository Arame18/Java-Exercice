public class Appartement extends Local{
    private int nbrePiece;
   
    public Appartement(String localisation, String ref, float prix, int tauxloc, String numeroRef, int nbrePiece) {
        super(localisation, ref, prix, tauxloc, numeroRef);
        this.nbrePiece = nbrePiece;
    }

    public Appartement(String localisation, String ref, float prix, int tauxloc, String numeroRef) {
            super(localisation, ref, prix, tauxloc, numeroRef);
            //TODO Auto-generated constructor stub
        }

    public int getNbrePiece() {
        return this.nbrePiece;
    }
    public void setNbrePiece(int nbrePiece) {
        this.nbrePiece = nbrePiece;
    }

	
	public String afficher(){
        return " nombre de piéce : " + this.nbrePiece;
    }

    public Local getLocal() {
        return null;
    }
    
}

