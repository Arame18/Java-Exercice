public abstract class Local implements IAffiche{

    protected String localisation;
    protected String ref;

public String getRef() {
	return this.ref;
}
public void setRef(String ref) {
	this.ref = ref;
}

    protected float prix;
    protected int tauxloc;
    private final int FORMAT = 8;
    private static int generateRef;
    

    private String generateNumero()
    {
        
        String nombreZero = "";
        String nombreDeRefString = String.valueOf(++generateRef);
        for(int i=1; i<=(FORMAT - nombreDeRefString.length()); i++)
        {
            nombreZero += "0";
        }
        return "REF"+nombreZero + nombreDeRefString;
    }

public void setRenombreDeRefStringf(String ref) {
	this.ref = ref;
}

   

public String getLocalisation() {
	return this.localisation;
}
public void setLocalisation(String localisation) {
	this.localisation = localisation;
}

   

public float getPrix() {
	return this.prix;
}
public void setPrix(float prix) {
	this.prix = prix;
}

    

public int getTauxloc() {
	return this.tauxloc;
}
public void setTauxloc(int tauxloc) {
	this.tauxloc = tauxloc;
}



public Local(String localisation, float prix, int tauxloc) {
    this.localisation = localisation;
    this.prix = prix;
    this.tauxloc = tauxloc;
}

public Local(String localisation, int tauxloc) {
    this.localisation = localisation;
    this.tauxloc = tauxloc;
}

public Local(String ref, String numeroRef) {
    numeroRef =  generateNumero();
    
}

public Local(String localisation, String ref, float prix, int tauxloc, String numeroRef) {
    this.localisation = localisation;
    numeroRef =  generateNumero();
    this.prix = prix;
    this.tauxloc = tauxloc;
}
    public double cout() {
        return this.prix + (this.tauxloc * this.prix);
    }



        public String afficher(){
                return " localisation : " + getLocalisation()
                + "\n reference : " + getRef()
                + "\n prix : " + getPrix()
                + "\n taux localisation : " + getTauxloc();
            }
    public void addLocal(Service service) {
    if(service.getTailleReelle() < service.TAILLE)
    {
        Service.tableLocal[((Service) service).getTailleReelle()] = this;
        service.setTailleReelle(service.getTailleReelle() + 1);
    }
    else 
    {
        System.out.println("Le tableau est plein");
    }
    }
    public int getTypeLocal() {
        return 0;
    }
   
   
    }

