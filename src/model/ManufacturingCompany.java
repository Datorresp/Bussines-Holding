
package model;

import java.util.ArrayList;


public class ManufacturingCompany extends Company{
    
    private ArrayList <Product> products;
    
    public ManufacturingCompany(String name, String nit, String adress, long phone, int employees, double valuesAssets, String constitutionDate, char type, String legalRepresentative) {
        super(name, nit, adress, phone, employees, valuesAssets, constitutionDate, type, legalRepresentative);
        
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
            
            msj += "los productos son: " + products.get(i).toString();
        }
        
        return  msj;
    }

    @Override
    public String toString() {
        return  "El nombre de comercio es:" + getName() + " productos=" + products + " El nit es:" + getNit() +" La direccion es:" + getAdress()+  " El numero  celular es:" + getPhone()+ " La cantidad de empleados es:" + getEmployees() + " La cantidad de activos es:" + getValuesAssets() + "La fecha de creacion: " + getConstitutionDate() + "El tipo de organizacion es:" + getType() + " El nombre legal es:" + getType() + ShowProducts();
    }
    
    
     
}
