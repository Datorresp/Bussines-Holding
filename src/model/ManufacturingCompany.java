
package model;

import java.util.ArrayList;


public class ManufacturingCompany extends Company{
    
    private ArrayList <Product> products;

    public ManufacturingCompany(String name, String nit, String adress, String phone, int employees, double valuesAssets, String constitutionDate, char type, String legalRepresentative, Building build) {
        super(name, nit, adress, phone, employees, valuesAssets, constitutionDate, type, legalRepresentative, build);
    }

    
    public void addProduct(ArrayList<Product> pro){

        products = pro;

    }
    
    
    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
    
    public String ShowProducts(){
        
        String msj = " ";
        
        for (int i = 0; i < products.size(); i++) {
            
            msj += "produts: " + products.get(i).toString();
        }
        
        return  msj;
    }

    @Override
    public String toString() {
        return "name=" + super.getName() + ", nit=" + super.getNit() + ", adress=" + super.getAdress() + ", phone=" + super.getPhone() + ", employees=" + super.getEmployees() + ", valuesAssets=" + super.getValuesAssets() + ", constitutionDate=" + super.getConstitutionDate() + ", type=" + super.getType() + ", legalRepresentative=" + super.getLegalRepresentative() + getAdress()+ ShowProducts();
    }
    
    
    
     
}
