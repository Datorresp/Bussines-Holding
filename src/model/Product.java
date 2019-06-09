
package model;

public class Product {
    
    private String name;
    private String code;
    private double waterAmount;
    private int units;
   

    public Product(String name, String code, double waterAmount, int units) {
        this.name = name;
        this.code = code;
        this.waterAmount = waterAmount;
        this.units = units;
        
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getWaterAmount() {
        return waterAmount;
    }

    public void setWaterAmount(double waterAmount) {
        this.waterAmount = waterAmount;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", code=" + code + ", waterAmount=" + waterAmount + ", units=" + units + '}';
    }
    
        
}
