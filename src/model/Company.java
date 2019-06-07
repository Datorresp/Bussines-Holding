
package model;

/**
 *
 * @author diegoandrestorres
 */
public abstract class Company {

    public static final char AGRI_SILVI_HUNT_FISH = 'A';
    public static final char EXPLO_MINES_OUARRIES = 'B';
    public static final char MANUFACTURING = 'C';
    public static final char ELEC_GAS_STEAM = 'D';
    public static final char CONSTRUCTION = 'E';
    public static final char COMMERCE_MM = 'F';
    public static final char TRANS_STORAGE_COMU = 'G';
    public static final char EST_INSU_ESTATE_SERV = 'H';
    public static final char SOCIAL_COMUNALS = 'I';

    protected String name;
    protected String nit;
    protected String adress;
    protected long phone;
    protected int employees;
    protected double valuesAssets;
    protected String constitutionDate;
    protected char type;
    protected String legalRepresentative;

    public Company(String name, String nit, String adress, long phone, int employees, double valuesAssets, String constitutionDate, char type, String legalRepresentative) {
        this.name = name;
        this.nit = nit;
        this.adress = adress;
        this.phone = phone;
        this.employees = employees;
        this.valuesAssets = valuesAssets;
        this.constitutionDate = constitutionDate;
        this.type = type;
        this.legalRepresentative = legalRepresentative;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public double getValuesAssets() {
        return valuesAssets;
    }

    public void setValuesAssets(double valuesAssets) {
        this.valuesAssets = valuesAssets;
    }

    public String getConstitutionDate() {
        return constitutionDate;
    }

    public void setConstitutionDate(String constitutionDate) {
        this.constitutionDate = constitutionDate;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }
    
    public abstract String toString();
    
    
}
