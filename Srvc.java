public class Srvc implements IEmploye {
   
    protected int id;    
    protected  String libelle;


    public Srvc (){       
    }
    public Srvc (String libelle){              
      this.libelle=libelle;
    }  

    public int getId(){
        return id;
    }
    public String getLibelle(){
        return libelle;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setLibelle(String libelle){
        this.libelle=libelle;
    }

    @Override
    public String affiche(){
       return "Id: "+id+"Libelle : "+libelle;
    }
}

   