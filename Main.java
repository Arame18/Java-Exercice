import java.util.*;

public class Main{

    /**
     *
     */
    
    
    public static Scanner clavier = new Scanner(System.in);

    public static void main(String args[])
    {
        var service = new Service();
        int choix;
        do{
            choix = menu();

            switch(choix){
            case 1:
                System.out.println("Ajouter un local : ");
                String name;
                int namelen;
                do{
                    System.out.println("Veiller saisir le numéro du local souhaitez : "
                    + "\n 1 pour Chambre " + "\n"
                    + "\n 2 pour Appartement" + "\n");
                    name = clavier.nextLine();
                    namelen = Integer.parseInt(name);
                }while (namelen != 1 && namelen != 2);

                if (namelen == 1)/*pour ajouter le local chambre*/ {
                    System.out.println("Veiller saisir la localisation du local souhaitez");
                    String localisation = clavier.nextLine();
                    System.out.println("Veiller saisir les dimensions du local souhaitez");
                    String dimension = clavier.nextLine();
                    System.out.println("Veiller saisir le prix  du local souhaitez");
                    String prix = clavier.nextLine();
                    System.out.println("Veiller saisir le taux de localisation du local souhaitez");
                    String tauxloc = clavier.nextLine();
                    Chambre chambre = new Chambre(localisation,name, 
                    Integer.parseInt(dimension),Integer.parseInt(prix),name, Integer.parseInt(tauxloc));
                    service.addLocal(chambre);

                } else /*pour ajouter le local appartement*/
                {
                    System.out.println("Veiller saisir la localisation du local souhaitez");
                    String localisation = clavier.nextLine();
                    System.out.println("Veiller saisir les dimensions du local souhaitez");
                    String dimension = clavier.nextLine();
                    System.out.println("Veiller saisir le prix  du local souhaitez");
                    String prix = clavier.nextLine();
                    System.out.println("Veiller saisir le taux de localisation du local souhaitez");
                    String tauxloc = clavier.nextLine();

                    String nbrePiece;
                    do {
                        System.out.println("Veiller saisir le nombre de piéce souhaitez : ");
                        nbrePiece = clavier.nextLine();
                        System.out.println("Un appartement n'a droit qu'a 3 pieces disponible, Merci...");
                    } 
                    while (Integer.parseInt(nbrePiece) < 3);
                        System.out.println("je souhaite un appartement de  : " + nbrePiece + "piéce");
                        
                    Appartement appartement = new Appartement(localisation,name, 
                    Integer.parseInt(dimension),Integer.parseInt(prix),name, Integer.parseInt(tauxloc));
                    service.addLocal(appartement);

                }
                break;
                case 2:
                    System.out.println("Lister par type les locaux : ");

                    System.out.println(" Veillez saisir la reference de la chambre :");
                    String ref= clavier.nextLine();
                   
                    service.listerChambre(ref);

                    
                    System.out.println("Veiller saisir la reference de l'appartement :");
                    String reference = clavier.nextLine();
                    Service.listerAppartement(reference);
                    break;
                
                
                
                case 3:
                name = clavier.nextLine();
                    namelen = Integer.parseInt(name);
                System.out.println("Lister les locaux par client : ");
                
                    System.out.println("Veillez saisir la valeur du nci : ");
                    String nci = clavier.nextLine();
                    Client client = service.searchClient(Integer.parseInt(nci));
                service.searchClient(namelen);
                
                
                break;
                case 4:
                name = clavier.nextLine();
                    namelen = Integer.parseInt(name);
                System.out.println("Voir les détail du  local : ");
                service.viewDetail(namelen);
                break;
            case 5:
            name = clavier.nextLine();
                    namelen = Integer.parseInt(name);
                System.out.println("Faire une réservation : ");
                System.out.println("Veillez saisir la valeur du nci : ");
                String ncisString = clavier.nextLine();
                Client client2 = service.searchClient(Integer.parseInt(ncisString));
                service.searchClient(namelen);

                
                if (client2 == null) {
                    name = clavier.nextLine();
                    namelen = Integer.parseInt(name);
                        System.out.print("Veiller saisir le Nom Complet du client : ");
                        String nomComplet = clavier.nextLine();

                        System.out.print("Veiller saisir le numero telephone : ");
                        String tel = clavier.nextLine();

                        System.out.print("Veiller saisir votre adresse : ");
                        String adresse = clavier.nextLine();

                        System.out.print("Veiller saisir votre email : ");
                        String email = clavier.nextLine();
client = new Client(Integer.parseInt(ncisString), nomComplet, Integer.parseInt(tel), adresse, email);
                service.createClient(client);
                    } else {
                        name = clavier.nextLine();
                        namelen = Integer.parseInt(name);
                        int jour;
                        int mois;
                        int annee;
                        System.out.print("Veiller saisir le jour de votre reservation ");
                        jour = clavier.nextInt();
                        System.out.print("Veiller saisir le mois de votre reservation ");
                        mois = clavier.nextInt();
                        System.out.print("Veiller saisir l'annee de votre reservation ");
                        annee = clavier.nextInt();

                        System.out.print(
                                "Veiller sasir la date du reservation " + "jour:" + jour 
                                + "mois :" + mois + "annee :" + annee);
                 //service.searchClient(Integer.parseInt(jour),Integer.parseInt(mois),Integer.parseInt(annee));

                        

                    }

                break;
                /*
                case 6:
                    System.out.println("Annuler une réservation  : ");
                    service.annulerResrvation();
                    break;
                case 7:
                    System.out.println("Lister les locaux disponible : ");
                    service.listerLocaldispo();
                    break;*/
            case 8:
                System.out.println("Quitter");
                break;
                default:
                System.out.println("Mauvais choix :(LES CHIFFRES SONT DE 1 A 8, MERCI!!! )");
        }
    } while(choix <= 8);
    }


    
    
    public Main() {
    }




    public static int menu() {
        int choix;
        try {
            System.out.println("Menu"
            + "\n 1-Ajouter un local"  
            + "\n 2-Lister les locaux  par type"
            + "\n 3-Lister les locaux par client"
            + "\n 4-Voir les detail du  local"
            + "\n 5-Faire une reservation"
            + "\n 6-Annuler une reservation" 
            + "\n 7-Lister les locaux disponible"
                    + "\n 8-Quitter");
                    System.out.println("Faites votre choix : ");
        choix = Integer.parseInt(clavier.nextLine());
        return choix;
        }
        catch (Exception err) {
            System.out.println("veiller choisir un entier :");
        }
        return menu();
       
        
    }

}

