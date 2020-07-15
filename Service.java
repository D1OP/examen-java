public class Service {

    final int TAILLE=50;
    private int nbreSrvc=0;
    private Srvc tabsrvc[];
    private int nbreEmploye=0;
    private Srvc tabemploye[];

    public Service(){
        tabsrvc=new Srvc[TAILLE]; 
        tabemploye=new Employe[TAILLE]; 
    }

    public void ajouterSrvc(Srvc sv){
        tabsrvc[nbreSrvc]=sv;
            nbreSrvc++;
    }

    public void listerSrvc(){
        for(int i=0;i<nbreSrvc;i++){
            System.out.println(tabsrvc[i].affiche());
        }        
    }

    public void ajouterEmploye(Employe emp){
        tabemploye[nbreEmploye]=emp;
            nbreEmploye++;
    }

    public void listerEmployeRetraite(Srvc srvc){
        for(int i=0;i<nbreEpmloye;i++){
            if(tabemploye[i] instanceof Employe){
                if(((Employe)tabemploye[i]).getSrvc().getId()==srvc.getId()){
                    System.out.println(tabemploye[i].affiche());
                }
            }
           
        }
    }
   


}