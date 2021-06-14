public class Client implements IAffiche {
	final int TAILLE = 10;
	private int nci;
    private String nomComplet;
	private int tel;
	private String adresse;
	private String email;

public int getNci() {
	return this.nci;
}
public void setNci(int nci) {
	this.nci = nci;
}


	public String getNomComplet() {
		return this.nomComplet;
	}
	public void setNomComplet(String nomComplet) {
		this.nomComplet = nomComplet;
	}


	public int getTel() {
		return this.tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}


	public String getAdresse() {
		return this.adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

    
    
    public Client(int nci,String nomComplet, int i, String adresse, String email) {
        this.nomComplet = nomComplet;
        this.adresse = adresse;
        this.email = email;
		this.nci = nci;
    }
    public Client(int nci, int tel) {
        this.nci = nci;
        this.tel = tel;
    }
    public Client(String nci2, String nomComplet2, String nomComplet3) {
    }
    
	public Client(String nci2, String nomComplet2, int tel2, String adresse2, String email2) {
    }
    public String afficher(){
        return " nci : " + getNci()
        + "\n nomComplet : " + getNomComplet()
        + "\n telephone : " + getTel() 
        + "\n adresse : " + getAdresse()
        + "\n email : " + getEmail();
    }

	
	
}
