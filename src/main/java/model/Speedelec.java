package model;

public class Speedelec extends ElectroBike {

    public Speedelec(String brand, int maxSpeed, int bikeWeight, boolean isFrontAndBackLight, int batteryCapacity, String color, int price) {
        super(brand, maxSpeed, bikeWeight, isFrontAndBackLight, batteryCapacity, color, price);
    }

    @Override
    public String toString() {
        return  "SPEEDELEC " + super.toString();
    }

    @Override
    public String showFullInfo() {

        return  "SPEEDELEC " + super.showFullInfo() +
                "maxSpeed=" + getMaxSpeed() +
                ", batteryCapacity=" + getBatteryCapacity() +
                "} ";
    }
}
