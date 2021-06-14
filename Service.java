public class Service {

    final int TAILLE = 5;
    private int nombreDeClientReel;
    private int tailleReelle;
    int nombreReelle;

    
    // CREATION TABLEAU 
    Client[] tableauDeClient = new Client[TAILLE];

    public void createClient(Client client) {
        if (nombreDeClientReel < TAILLE) {
            tableauDeClient[nombreDeClientReel] = client;
            nombreDeClientReel++;
        } else {
            System.out.println("Table de client plein  :( )");
        }
    }

    // RECHERCHE CLIENT PAR NCI
    public Client searchClient(int i) {
        for (Client client : tableauDeClient) {
            if (client != null) {
                if (client.getNci() == i) {
                    return client;
                }
            }
        }
        return null;
    }

    // TABLEAU LOCAL

    static Local tableLocal[] = new Local[5];

    public void addLocal(Local local) {
        if (tailleReelle < TAILLE) {
            tableLocal[tailleReelle] = local;
            tailleReelle++;
        } else {
            System.out.println("Le tableau Local est est plein");
        }

    }

    public void listerLocal() {
        for (Local element : tableLocal) {
            if (element != null) {
                System.out.println(element.afficher());
                System.out.println("");
            }

        }
    }
    public void listerChambre(String ref) {
        for (Local local : tableLocal) {
            if (((Local) local).getTypeLocal() == 1) {
                System.out.println(local.afficher());

            }

        }
    }
    public static void listerChambre(Local[] tableLocal2) {
        for (Local local : tableLocal) {
            if (((Local) local).getTypeLocal() == 1) {
                System.out.println(local.afficher());

            }

        }

    }

    public static void listerAppartement(String reference) {
        for (Local local : tableLocal) {
            if (local.getTypeLocal() == 2) {
                System.out.println(local.afficher());

            }

        }

    }

    public int getTailleReelle() {
        return 0;
    }

    public void setTailleReelle(int i) {
    }

    // CREATION TABLEAU DE RESERVATION
    Reservation[] tableReservation = new Reservation[5];

    public void addReservation(Reservation reservation)
    {
        
        if (nombreReelle < TAILLE) {
            tableReservation[nombreReelle] = reservation;
            nombreReelle++;
        } else {
            System.out.println("Le tableau des reservation est est plein");
        }
    }

    public void viewDetail(int id)
    {
        for (int i = 0; i < nombreReelle; i++) {
            for (Reservation reservation : tableReservation) {
                if(reservation != null) {
                    if(reservation.getId() == id) {
                        System.out.println(tableReservation[i].afficher());
                    }
                }
            
            }
            id++;
        }
    }

   

}

