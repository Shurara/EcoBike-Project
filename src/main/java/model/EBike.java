package model;

public class EBike extends ElectroBike {

    public EBike(String brand, int maxSpeed, int bikeWeight, boolean isFrontAndBackLight, int batteryCapacity, String color, int price) {
        super(brand, maxSpeed, bikeWeight, isFrontAndBackLight, batteryCapacity, color, price);
    }

    public String showBikeInCatalog() {
        return "E-BIKE " + super.showBikeInCatalog();
    }

    @Override
    public String toString() {
        return "E-Bike: {" + super.toString() + "} ";
    }

    @Override
    public String convertBikeToSring() {
        return "E-BIKE " + super.convertBikeToSring();
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
