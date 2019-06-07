
package model;

public class Product {
    
    private String name;
    private String code;
    private double waterAmount;
    private int units;
    
    private Sanitation s1;
    private Invima i1;

    public Product(String name, String code, double waterAmount, int units, Sanitation s1, Invima i1) {
        this.name = name;
        this.code = code;
        this.waterAmount = waterAmount;
        this.units = units;
        this.s1 = s1;
        this.i1 = i1;
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

    public Sanitation getS1() {
        return s1;
    }

    public void setS1(Sanitation s1) {
        this.s1 = s1;
    }

    public Invima getI1() {
        return i1;
    }

    public void setI1(Invima i1) {
        this.i1 = i1;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", code=" + code + ", waterAmount=" + waterAmount + ", units=" + units + ", s1=" + s1 + ", i1=" + i1 + '}';
    }
    
    
}
