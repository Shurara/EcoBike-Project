package model;

public class EBike extends ElectroBike {

    public EBike(String brand, int maxSpeed, int bikeWeight, boolean isFrontAndBackLight, int batteryCapacity, String color, int price) {
        super(brand, maxSpeed, bikeWeight, isFrontAndBackLight, batteryCapacity, color, price);
    }

    public String toString() {
        return  "E-BIKE " + super.toString();
    }

    @Override
    public String showFullInfo() {

        return  "E-Bike " + super.showFullInfo() +
                "maxSpeed=" + getMaxSpeed() +
                ", batteryCapacity=" + getBatteryCapacity() +
                "} ";
    }
}
