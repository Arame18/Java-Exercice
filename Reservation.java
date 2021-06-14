import java.time.LocalDate;

public class Reservation extends Local{
    private LocalDate date;
    private LocalDate duree;
    private String etat;
    private int id;
    private static int nombreLocal;
    
    

    public Reservation(String localisation, int tauxloc, int id) {
        super(localisation, tauxloc);
        this.id = id;
        
    }


    public Reservation(String localisation, float prix, int tauxloc, LocalDate date, LocalDate duree, String etat,
            int id) {
        super(localisation, prix, tauxloc);
        this.date = date;
        this.duree = duree;
        this.etat = etat;
        this.id = id;
        
    }


  


    public Reservation(String localisation, int tauxloc) {
        super(localisation, tauxloc);
        id = ++ nombreLocal;
        nombreLocal ++;
        
    }


    public Reservation(String localisation, int tauxloc, String etat, int id) {
        super(localisation, tauxloc);
        id = ++ nombreLocal;
        nombreLocal ++;
        this.etat = etat;
        this.id = id;
    }


    public Reservation(String ref, String numeroRef, LocalDate date, LocalDate duree, String etat, int id) {
        super(ref, numeroRef);
        id = ++ nombreLocal;
        nombreLocal ++;
        this.date = date;
        this.duree = duree;
        this.etat = etat;
        this.id = id;
    }
    
    public LocalDate getDate() {
        return this.date;
    }
    public static int getNombreLocal() {
        return nombreLocal;
    }
    public static void setNombreLocal(int nombreLocal) {
        Reservation.nombreLocal = nombreLocal;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }


    public LocalDate getDuree() {
    	return this.duree;
    }
    public void setDuree(LocalDate duree) {
    	this.duree = duree;
    }


    public String getEtat() {
    	return this.etat;
    }
    public void setEtat(String etat) {
    	this.etat = etat;
    }


    public int getId() {
    	return this.id;
    }
    public void setId(int id) {
    	this.id = id;
    }

   
public String afficher(){
        return " la date d'enregistrement : " + getDate()
        + "\n la duree : " + getDuree()
        + "\n l'etat : " + getEtat()
        + "\n l'identifiant  : " + getId() ;
    }
   
    
 
}
