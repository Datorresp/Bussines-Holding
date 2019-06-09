/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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

    public ArrayList<Company> getCom() {
        return com;
    }

    public void setCom(ArrayList<Company> com) {
        this.com = com;
    }
    
     
    
    public String addCompany(Company comp){
        
        String msj = " ";
        boolean found = false;
        
        for (int i = 0; i < com.size() && !found; i++) {
            
            if (com.get(i) == null) {
                
                com.add(comp);
                msj += " Se ha creado la compañia" + "\n";
            }
        }
        return msj;
    }
    
    public void addCompanyPolls(Company companyName, Poll polls){

        com.add(companyName);
        ((ServiceCompany)companyName).addPolls(polls);
    }
    
    public void addCompanyProducts(Company companyName,Product p){

        com.add(companyName);
        ((ManufacturingCompany) companyName).addProduct(p);
    }
    @Override
    public String toString() {
        return "Holding{" + "name=" + name + ", nit=" + nit + ", companies=" + companies()+ '}';
    }
    
    public String companies(){
        
        String msj = " ";
        
        for (int i = 0; i < com.size(); i++) {
            
            msj= com.get(i).toString();
        }
        
        return msj;
    }
    

    public String comaniesNames(){
        
        String msj = "";

	for(int i = 0; i < com.size();i++){

            if(com.get(i) instanceof ServiceCompany){

                 msj += com.get(i).getName();

            }
        }

        return msj;

    }
    
    public String Products  (String nombre){
        
        String msj = "";

        for(int i = 0; i < com.size();i++){

             if(com.get(i) instanceof ManufacturingCompany){

                
                 if(com.get(i).getName().equals(nombre)){

                     msj += com.get(i).toString();

               }
           }
       }
        return msj;
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
    
    public String showBuildingE(String companyName,String employeeName){
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
