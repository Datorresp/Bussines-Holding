package model;

import java.util.ArrayList;

public class ServiceCompany extends Company{

//Relaciones
private ArrayList<Poll> polls;

    public ServiceCompany(String name, String nit, String adress, String phone, int employees, double valuesAssets, String constitutionDate, char type, String legalRepresentative, Building build) {
        super(name, nit, adress, phone, employees, valuesAssets, constitutionDate, type, legalRepresentative, build);
        
    }



    

    public void addPolls(ArrayList<Poll> client){
        polls = client;
    }


    @Override
    public String toString() {
        return "ServiceCompany{" + "name=" + super.getName() + ", nit=" + super.getNit() + ", adress=" + super.getAdress() + ", phone=" + super.getPhone() + ", employees=" + super.getEmployees() + ", valuesAssets=" + super.getValuesAssets() + ", constitutionDate=" + super.getConstitutionDate() + ", type=" + super.getType() + ", legalRepresentative=" + super.getLegalRepresentative() + getAdress() + '}';
    }










    }
