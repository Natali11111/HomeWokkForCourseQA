package Task3;

import java.math.BigDecimal;

public class Phone {
    private String manufacturer;
    private double cost;

   public Phone(String manufacturer, double cost){
        this.manufacturer = manufacturer;
        this.cost = cost;
    }
    public void setManufacturer(String manufacturer){
       this.manufacturer  =  manufacturer;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "manufacturer='" + manufacturer + '\'' +
                ", cost=" + cost + "$" +
                '}';
    }
}
