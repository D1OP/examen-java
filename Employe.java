import java.time.LocalDate;
public class Employe implements IEmploye {

    private int id;
    private int dateEmbauche;
    private String nomComplet;
    private Srvc srvcEmp;


    public Employe(){
    }
    public Employe(LocalDate dateEmbauche,String nomComplet){
        this.dateEmbauche=dateEmbauche;
        this.nomComplet=nomComplet;
    }

    public int getId(){
        return id;
    }
    public int getNomComplet(){
        return nomComplet;
    }
    public int getDateEmbauche(){
        return dateEmbauche;
    }
    public void setNomComplet(String nomComplet){
        this.nomComplet=nomComplet;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setDateEmbauche(int dateEmbauche){
        this.dateEmbauche=dateEmbauche;
    }

    @Override
    public String affiche(){
       return "Id: "+id+" NomComplet : "+nomComplet+" DateEmbauche:"+dateEmbauche;
    }
    @Override
    public String compare(){
       return 0;
    }

}


   