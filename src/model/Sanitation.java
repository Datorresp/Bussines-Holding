
package model;

public class Sanitation {
    
    public static final String ROOM_TEMPERATURE = "temperatura ambiente";
    public static final String REFRIGERATION = "Refrigeracion";
    public static final String FREEZING = "Congelacion";
    
    private boolean imported;
    private String conservation;

    public Sanitation(boolean imported, String conservation) {
        this.imported = imported;
        this.conservation = conservation;
    }

    public boolean isImported() {
        return imported;
    }

    public void setImported(boolean imported) {
        this.imported = imported;
    }

    public String getConservation() {
        return conservation;
    }

    public void setConservation(String conservation) {
        this.conservation = conservation;
    }
    
    
}
