
package model;
import java.util.ArrayList;

/**
 *
 * @author diegoandrestorres
 */
public class ServiceCompany extends Company{
    
    private ArrayList<Poll> polls;

    public ServiceCompany(String name, String nit, String adress, long phone, int employees, double valuesAssets, String constitutionDate, char type, String legalRepresentative) {
        super(name, nit, adress, phone, employees, valuesAssets, constitutionDate, type, legalRepresentative);
        polls = new ArrayList<>();
    }

    public void addPolls(ArrayList<Poll> polls1){
        
        polls = polls1;
        
    }
    
    public String getPoll(){
        
        String msj = "";

        for(int i = 0 ; i < polls.size();i++){

            msj += polls.get(i).toString();

        }
        return msj;
    }

    @Override
    public String toString() {
        return "ServiceCompany{" + "name=" + name + ", nit=" + nit + ", adress=" + adress + ", phone=" + phone + ", employees=" + employees + ", valuesAssets=" + valuesAssets + ", constitutionDate=" + constitutionDate + ", type=" + type + ", legalRepresentative=" + legalRepresentative + '}';
    }

    public String promediateOfThis(){

        String msj = "";
        int service = 0;
        int answerTime = 0;
        int relation = 0;
            for(int i = 0; i < polls.size();i++){
                
                service += polls.get(i).getServiceDoIt();
                answerTime += polls.get(i).getAnswerTime();
                relation += polls.get(i).getRelationCostXBenefit();

                msj += "Service:" + service + "Answer Time:" + answerTime + "relation:" + relation;
            }
        return msj;

    }

    
    
}
