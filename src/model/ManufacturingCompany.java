
package model;

import java.util.ArrayList;


public class ManufacturingCompany extends Company{
    
    private ArrayList <Product> products;

    public ManufacturingCompany(String name, String nit, String adress, long phone, int employees, double valuesAssets, String constitutionDate, char type, String legalRepresentative, Building build) {
        super(name, nit, adress, phone, employees, valuesAssets, constitutionDate, type, legalRepresentative, build);
        products = new ArrayList<>();
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
        return "name=" + name + ", nit=" + nit + ", adress=" + adress + ", phone=" + phone + ", employees=" + employees + ", valuesAssets=" + valuesAssets + ", constitutionDate=" + constitutionDate + ", type=" + type + ", legalRepresentative=" + legalRepresentative + getAdress()+ ShowProducts();
    }
    
    public void addProduct(Product pro){

        for (int i = 0; i < products.size(); i++) {
            
            if (products.get(i) == null) {
                
                products.add(pro);
            }
        }
    
    }
    
    
     
}
