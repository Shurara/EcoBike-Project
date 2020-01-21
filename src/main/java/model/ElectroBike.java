package model;

public abstract class ElectroBike extends Bike {
    public int maxSpeed;
    public int batteryCapacity;


    @Override
    public String toString() {
        return "" + this.bikeType + " " + brand + " with " + batteryCapacity
                + " mAh battery " + getLightInfo(isFrontAndBackLight)
                + "\nPrice: " + price + " euros.";

    }
}
