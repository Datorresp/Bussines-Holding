package model;

public class EducationCompany extends ServiceCompany implements Taxable{
    
    private int noMen;
    private int acreeditedYear;
    private int positionSaber11;
    private int positionSaberPro;
    private String principalName;
    private String educationSector;
    private int quantity;
    private int amountStudentsStratum1and2;

    public EducationCompany(int noMen, int acreeditedYear, int positionSaber11, int positionSaberPro, String principalName, String educationSector, int quantity, int amountStudentsStratum1and2, String name, String nit, String adress, long phone, int employees, double valuesAssets, String constitutionDate, char type, String legalRepresentative, Building build) {
        super(name, nit, adress, phone, employees, valuesAssets, constitutionDate, type, legalRepresentative, build);
        this.noMen = noMen;
        this.acreeditedYear = acreeditedYear;
        this.positionSaber11 = positionSaber11;
        this.positionSaberPro = positionSaberPro;
        this.principalName = principalName;
        this.educationSector = educationSector;
        this.quantity = quantity;
        this.amountStudentsStratum1and2 = amountStudentsStratum1and2;
    }

    

    public int getNoMen() {
        return noMen;
    }

    public void setNoMen(int noMen) {
        this.noMen = noMen;
    }

    public int getAcreeditedYear() {
        return acreeditedYear;
    }

    public void setAcreeditedYear(int acreeditedYear) {
        this.acreeditedYear = acreeditedYear;
    }

    public int getPositionSaber11() {
        return positionSaber11;
    }

    public void setPositionSaber11(int positionSaber11) {
        this.positionSaber11 = positionSaber11;
    }

    public int getPositionSaberPro() {
        return positionSaberPro;
    }

    public void setPositionSaberPro(int positionSaberPro) {
        this.positionSaberPro = positionSaberPro;
    }

    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    public String getEducationSector() {
        return educationSector;
    }

    public void setEducationSector(String educationSector) {
        this.educationSector = educationSector;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getAmountStudentsStratum1and2() {
        return amountStudentsStratum1and2;
    }

    public void setAmountStudentsStratum1and2(int amountStudentsStratum1and2) {
        this.amountStudentsStratum1and2 = amountStudentsStratum1and2;
    }
    

    @Override
    public double calculateTaxes() {
        
        double porcentaje = 0.0;

        porcentaje += 20 - ( amountStudentsStratum1and2/100);

        if(porcentaje < 0){

            porcentaje = 0.0;

        }

        return porcentaje;
    }

    @Override
    public String toString() {
        return "EducationCompany{" + super.toString() +"noMen=" + noMen + ", acreeditedYear=" + acreeditedYear + ", positionSaber11=" + positionSaber11 + ", positionSaberPro=" + positionSaberPro + ", principalName=" + principalName + ", educationSector=" + educationSector + ", quantity=" + quantity + ", amountStudentsStratum1and2=" + amountStudentsStratum1and2 + '}';
    }

     
    
    
    
}
