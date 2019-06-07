
package model;

/**
 *
 * @author diegoandrestorres
 */
public class Cubicle {
    
    
    private String EmployeeName;
    private long extention;
    private String position;

    public Cubicle(String EmployeeName, long extention, String position) {
        this.EmployeeName = EmployeeName;
        this.extention = extention;
        this.position = position;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    public long getExtention() {
        return extention;
    }

    public void setExtention(long extention) {
        this.extention = extention;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    
}
