package model;

public class EBike extends ElectroBike {

    public EBike(String brand, int maxSpeed, int bikeWeight, boolean isFrontAndBackLight, int batteryCapacity, String color, int price) {
        super(brand, maxSpeed, bikeWeight, isFrontAndBackLight, batteryCapacity, color, price);
    }

   /* @Override
    public String toString() {
        return "E-BIKE " + brand + " with " + batteryCapacity
                + " mAh battery " + getLightInfo(isFrontAndBackLight)
                + "\nPrice: " + price + " euros.";

    }*/

    public String toString() {
        return  "E-BIKE " + super.toString();
    }
}
