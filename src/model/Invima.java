
package model;

public class Invima extends ManufacturingCompany implements Consuption{
    
    public static final char MANUFACTURE_EXPORT = 'A';
    public static final char MANUFACTURE_SELL = 'B';
    public static final char IMPORT_SELL = 'C';
    
    private String sanitaryRegistration;
    private String status;
    private String expiration;
    private char modality;

    public Invima(String sanitaryRegistration, String status, String expiration, char modality, String name, String nit, String adress, long phone, int employees, double valuesAssets, String constitutionDate, char type, String legalRepresentative) {
        super(name, nit, adress, phone, employees, valuesAssets, constitutionDate, type, legalRepresentative);
        this.sanitaryRegistration = sanitaryRegistration;
        this.status = status;
        this.expiration = expiration;
        this.modality = modality;
    }

    
    public String getSanitaryRegistration() {
        return sanitaryRegistration;
    }

    public void setSanitaryRegistration(String sanitaryRegistration) {
        this.sanitaryRegistration = sanitaryRegistration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public char getModality() {
        return modality;
    }

    public void setModality(char modality) {
        this.modality = modality;
    }

    @Override
    public String toString() {
        return "Invima{" + "Registro Sanitario=" + sanitaryRegistration + ", Estatus=" + status + ", Expiracion=" + expiration + ", modalidad=" + modality + '}';
    }

    @Override
    public int WaterXTree() {
        int amountTree = 0;

        for(int i = 0; i < getProducts().size(); i++){
            
            Product m = getProducts().get(i);
            
            if(m.getWaterAmount() > 1 && m.getWaterAmount()  < 140){

                amountTree = 6;

            }else if(m.getWaterAmount()  >41&& m.getWaterAmount()  < 800){

                amountTree = 25;

            }else if(m.getWaterAmount() >800){

                amountTree = 200;        
            }
        }

        return amountTree;
    }
    
    
}