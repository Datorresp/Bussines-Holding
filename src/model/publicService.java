
package model;

/**
 *
 * @author diegoandrestorres
 */
public class publicService extends Company{
    
     public static final String SEWERAGE = "Alcantarillado";
     public static final String ENERGY = "Energia";
     public static final String AQUEDUCT = "Acueducto";
     
     private String  typeA;
     private int totalSubs;
     private int totalSubsOneAndTwo;

    public publicService(String typeA, int totalSubs, int totalSubsOneAndTwo, String name, String nit, String adress, long phone, int employees, double valuesAssets, String constitutionDate, char type, String legalRepresentative) {
        super(name, nit, adress, phone, employees, valuesAssets, constitutionDate, type, legalRepresentative);
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
     
    
     
     
}