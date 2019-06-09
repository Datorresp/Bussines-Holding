package model;
import java.util.ArrayList;

public class TechnologyCompany extends ServiceCompany implements Consuption{
    
    public static final String CAPATATION = "Consultoria";
    public static final String INFRASTRUCTURE = "Infraestructura";
    public static final String SOFTWARE_DEVELOP = "Desarrollo de software"; 
    public static final String SERVICE_OF_PLATAFORM = "Plataforma como servicio";
    public static final String SERVICE_OF_SOFTWARE = "Software como servicio";
   
    private int consuptiomKilowatts;
    private String service;
    
    private ArrayList <String> services;

    public TechnologyCompany(int consuptiomKilowatts, String service, String name, String nit, String adress, long phone, int employees, double valuesAssets, String constitutionDate, char type, String legalRepresentative, Building build) {
        super(name, nit, adress, phone, employees, valuesAssets, constitutionDate, type, legalRepresentative, build);
        this.consuptiomKilowatts = consuptiomKilowatts;
        this.service = service;
        
        services = new ArrayList<>();
	services.add(CAPATATION);
        services.add(INFRASTRUCTURE);
	services.add(SOFTWARE_DEVELOP);
        services.add(SERVICE_OF_PLATAFORM);
	services.add(SERVICE_OF_SOFTWARE);
    }

    

    public int getConsuptiomKilowatts() {
        return consuptiomKilowatts;
    }

    public void setConsuptiomKilowatts(int consuptiomKilowatts) {
        this.consuptiomKilowatts = consuptiomKilowatts;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public ArrayList<String> getServices() {
        return services;
    }

    public void setServices(ArrayList<String> services) {
        this.services = services;
    }

    @Override
    public String toString() {
        return "TechnologyCompany{" + super.toString() + "consuptiomKilowatts=" + consuptiomKilowatts + ", service=" + service + ", services=" + services + '}';
    }
    
    

    @Override
    public int WaterXTree() {
        int amountTreeEnergy = 0;

        if(consuptiomKilowatts > 1 && consuptiomKilowatts < 1000){

            amountTreeEnergy = 8;

        }else if(consuptiomKilowatts > 1001 && consuptiomKilowatts < 3000){

            amountTreeEnergy = 35;

        }else if(consuptiomKilowatts > 3000){

            amountTreeEnergy = 500;

        }

        return amountTreeEnergy;

    }
    
    
}
