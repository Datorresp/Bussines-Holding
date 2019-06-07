package model;
import java.util.ArrayList;

public class TechnologyCompany extends ServiceCompany{
    
    private ArrayList <String> services;

    public TechnologyCompany(ArrayList<String> services, String name, String nit, String adress, long phone, int employees, double valuesAssets, String constitutionDate, char type, String legalRepresentative) {
        super(name, nit, adress, phone, employees, valuesAssets, constitutionDate, type, legalRepresentative);
        this.services = services;
    }
    
    
}
