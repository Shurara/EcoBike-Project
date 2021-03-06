package model;

public class Speedelec extends ElectroBike {

    public Speedelec(String brand, int maxSpeed, int bikeWeight, boolean isFrontAndBackLight, int batteryCapacity, String color, int price) {
        super(brand, maxSpeed, bikeWeight, isFrontAndBackLight, batteryCapacity, color, price);
    }

    @Override
    public String showBikeInCatalog() {
        return "SPEEDELEC " + super.showBikeInCatalog();
    }

    @Override
    public String toString() {
        return "SPEEDELEC: {" + super.toString() + "} ";

    }

    @Override
    public String convertBikeToSring() {
        return "SPEEDELEC " + super.convertBikeToSring();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
