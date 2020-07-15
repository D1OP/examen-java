import java.util.Scanner;
import java.time.LocalDate;

public class Main {

public static void main(String[] args) {
    String choix;
    Scanner clavier=new Scanner(System.in);
    Service service =new Service();
    do{
        System.out.println("1-Ajout srvc");
        System.out.println("2-Lister srvc ");
        System.out.println("3-Affecter un Employé dans un Service  ");
        System.out.println("4-Lister les Employés d'un  Service   ");
        System.out.println("5-Afficher les Employés qui doivent partir en retraite cette année");
        System.out.println("6-Quitter");
        System.out.println("Faites votre choix");
        choix=clavier.nextLine();
        switch(choix){
            case "1":
                System.out.println("Entrer le libelle du srvc");
                String libelle =clavier.nextLine();
                Srvc sv=new Srvc(libelle);
                service.ajouterSrvc(sv);
            break;
            case "2":
                service.listerSrvc();
            break;
            case "3":
                System.out.println("Entrer le Nom Complet");
                String nomComplet =clavier.nextLine();
                System.out.println("Entrer la date d'embauche");
                LocalDate dateEmbauche= LocalDate.now();
                System.out.println("Saisir l'ID du service");
                service.listerSrvc();
                int idClasse=clavier.nextInt();
                Srvc srvcemp=new Srvc();
                srvcemp.setId(idSrvc);

                Employe emp =new Employe(nomComplet, dateEmbauche);
                    emp.setSrvc(srvcemp);
                service.ajouterEmploye(emp);                
            break;
            case "4":
                service.listerEmploye();
            break;
            case "5":
                System.out.println("Saisir l'ID du service");
                service.listerSrvc();
                int id=clavier.nextInt();
                Srvc srvc=new Srvc();
                srvc.setId(id);
                service.listerEmployeRetraite(srvc);
            break;
            default:
            System.out.println("Choix invalide");
        }       
        }while (choix!="6");
    }
}        
