
package model;

/**
 *
 * @author diegoandrestorres
 */
public class publicService extends Company implements Taxable{
    
     public static final String SEWERAGE = "Alcantarillado";
     public static final String ENERGY = "Energia";
     public static final String AQUEDUCT = "Acueducto";
     
     private String  typeA;
     private int totalSubs;
     private int totalSubsOneAndTwo;

    public publicService(String typeA, int totalSubs, int totalSubsOneAndTwo, String name, String nit, String adress, long phone, int employees, double valuesAssets, String constitutionDate, char type, String legalRepresentative, Building build) {
        super(name, nit, adress, phone, employees, valuesAssets, constitutionDate, type, legalRepresentative, build);
        this.typeA = typeA;
        this.totalSubs = totalSubs;
        this.totalSubsOneAndTwo = totalSubsOneAndTwo;
    }

     

    public String getTypeA() {
        return typeA;
    }

    public void setTypeA(String typeA) {
        this.typeA = typeA;
    }

    public int getTotalSubs() {
        return totalSubs;
    }

    public void setTotalSubs(int totalSubs) {
        this.totalSubs = totalSubs;
    }

    public int getTotalSubsOneAndTwo() {
        return totalSubsOneAndTwo;
    }

    public void setTotalSubsOneAndTwo(int totalSubsOneAndTwo) {
        this.totalSubsOneAndTwo = totalSubsOneAndTwo;
    }

    @Override
    public String toString() {
        return "publicService{" + "name=" + name + ", nit=" + nit + ", adress=" + adress + ", phone=" + phone + ", employees=" + employees + ", valuesAssets=" + valuesAssets + ", constitutionDate=" + constitutionDate + ", type=" + type + ", legalRepresentative=" + legalRepresentative + "typeA=" + typeA + ", totalSubs=" + totalSubs + ", totalSubsOneAndTwo=" + totalSubsOneAndTwo + '}';
    }

    /**
     *
     * @return
     */
    @Override
    public double calculateTaxes() {
        double proCultura = 0.0;

        proCultura += 40 - (totalSubs/100);

        if(proCultura < 0){

        proCultura = 0.0;

    }

    return proCultura;


    }
    

    
     
    
     
     
}
