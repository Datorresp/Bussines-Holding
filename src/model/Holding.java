
package model;

import java.util.ArrayList;

/**
 *
 * @author diegoandrestorres
 */
public class Holding {
    
    private String name;
    private long nit;
    private Building bu;
    
    private ArrayList<Company> com;

    public Holding(String name, long nit, Building bu) {
        this.name = name;
        this.nit = nit;
        this.bu = bu;
        com = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNit() {
        return nit;
    }

    public void setNit(long nit) {
        this.nit = nit;
    }

    public Building getBu() {
        return bu;
    }

    public void setBu(Building bu) {
        this.bu = bu;
    }

     
    
    public boolean addCompany(Company c){

      return com.add(c);

    }


    @Override
    public String toString() {
        return "Holding{" + "name=" + name + ", nit=" + nit + ", companies=" + showCompanies()+ '}';
    }
    
    public String showCompanies(){
        
        String msj = " ";
        
        for (int i = 0; i < com.size(); i++) {
            
            msj= com.get(i).toString();
        }
        
        return msj;
    }

    public String showInfo(){
        String msj = "";

            for(int i = 0; i < com.size(); i++){

            msj += com.get(i).toString();

            }
        return msj;
    }
    
    public void addCompanyProducts(Company k,ArrayList<Product> l){

        com.add(k);
        ((ManufacturingCompany) k).addProduct(l);


    }
    
    public void addCompanyWithPolls(Company k, ArrayList<Poll> polls){

        com.add(k);
        ((ServiceCompany)k).addPolls(polls);


    }
    
    
    public void addEmployee(String companyName, String employeeName, String employeePosition, String employeeEmail){
        
        for(int i = 0; i < com.size();i++){

            if(companyName.equals(com.get(i).getName())){
              
                if(com.get(i).getBuild().getCubicles() !=null){
                    
                    com.get(i).getBuild().addEmployee(employeeName,employeePosition,employeeEmail);
                }
            }
        }
    }
    
    public void addBuildingToCompany(String CompanyName,Building buildingNumber){

        for(int i = 0; i < com.size();i++){
            
          if(com.get(i).getName().equals(CompanyName)){
              
            if(com.get(i).getBuild().getCubicles()== null){
                
                com.get(i).setBuild(buildingNumber);
            }
          }
        }
    }  
    
    public String routeL(String comapanyName,String employeeName){
        String msj = "";

        for(int i = 0; i < com.size();i++){
            if(com.get(i).getName().equals(comapanyName)){

            msj += com.get(i).getBuild().routeL(employeeName);

            }

        }
        return msj;
    }
    
    public String routeZ(String comapanyName,String employeeName){
        
        String msj = "";

            for(int i = 0; i < com.size();i++){
                
                if(com.get(i).getName().equals(comapanyName)){

                    msj += com.get(i).getBuild().routeZ(employeeName);

                }

            }
            return msj;
    }
    
    public String routeO (String companyName,String employeeName){
        String msj = "";

        for(int i = 0; i < com.size();i++){
            if(com.get(i).getName().equals(companyName)){

                msj += com.get(i).getBuild().routeO(employeeName);

            }

        }
        
        return msj;
    }
    
    public String routeE(String companyName,String employeeName){
        String msj = "";

        for(int i = 0; i < com.size();i++){
        
            if(com.get(i).getName().equals(companyName)){

        
                msj += com.get(i).getBuild().routeE(employeeName);

        
            }

        }
        return msj;
    }
    
    public String espiral(String companyName,String employeeName){

        String msj = "";


        for(int i = 0; i < com.size();i++){

            if(com.get(i).getName().equals(companyName)){


                msj += com.get(i).getBuild().espriral(employeeName);

            }

        }
        return msj;
    }
    
    public String routeX(String companyName,String employeeName){

        String msj = "";


        for(int i = 0; i < com.size();i++){

            if(com.get(i).getName().equals(companyName)){

                msj += com.get(i).getBuild().routeX(employeeName);
            }

        }
        return msj;
    }

}
