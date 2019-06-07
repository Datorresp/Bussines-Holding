
package model;

/**
 *
 * @author diegoandrestorres
 */
public class ServiceCompany extends Company{

    public ServiceCompany(String name, String nit, String adress, long phone, int employees, double valuesAssets, String constitutionDate, char type, String legalRepresentative) {
        super(name, nit, adress, phone, employees, valuesAssets, constitutionDate, type, legalRepresentative);
    }

    @Override
    public String toString() {
        return "ServiceCompany{" + "name=" + name + ", nit=" + nit + ", adress=" + adress + ", phone=" + phone + ", employees=" + employees + ", valuesAssets=" + valuesAssets + ", constitutionDate=" + constitutionDate + ", type=" + type + ", legalRepresentative=" + legalRepresentative + '}';
    }

    
    
    
}
