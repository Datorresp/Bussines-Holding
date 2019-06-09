
package model;

/**
 *
 * @author diegoandrestorres
 */
public class Cubicle {
    
    
    private String EmployeeName;
    private long extention;
    private String position;
    private String email;
    private boolean disponibility;

    public Cubicle(String EmployeeName, long extention, String position, String email, boolean disponibility) {
        this.EmployeeName = EmployeeName;
        this.extention = extention;
        this.position = position;
        this.email = email;
        this.disponibility = disponibility;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isDisponibility() {
        return disponibility;
    }

    public void setDisponibility(boolean disponibility) {
        this.disponibility = disponibility;
    }
    
    
    
    
}
