
package model;

public class Invima extends ManufacturingCompany implements Consuption{
    
    public static final char MANUFACTURE_EXPORT = 'A';
    public static final char MANUFACTURE_SELL = 'B';
    public static final char IMPORT_SELL = 'C';
    
    private String sanitaryRegistration;
    private String status;
    private String expiration;
    private char modality;

    public Invima(String sanitaryRegistration, String status, String expiration, char modality, String name, String nit, String adress, long phone, int employees, double valuesAssets, String constitutionDate, char type, String legalRepresentative, Building build) {
        super(name, nit, adress, phone, employees, valuesAssets, constitutionDate, type, legalRepresentative, build);
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
        return "Invima{" + super.toString() +"sanitaryRegistration=" + sanitaryRegistration + ", status=" + status + ", expiration=" + expiration + ", modality=" + modality + '}';
    }

    

    @Override
    public int WaterXTree() {
        
        int trees = 0;

        for(int i = 0; i < getProducts().size(); i++){
            
            Product p = getProducts().get(i);
            
            if(p.getWaterAmount() > 1   &&   p.getWaterAmount() < 140){

                trees = 6;

            }else if(p.getWaterAmount() > 41  &&  p.getWaterAmount() < 800){

                trees = 25;

            }else if(p.getWaterAmount()  >   800){

                trees = 200;        
            }
        }

        return trees;
    }
    
    
}
