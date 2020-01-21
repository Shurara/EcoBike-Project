package model;

public class FoldingBike extends Bike {
    public int wheelsSizeInch;
    public int gearsNumber;



    public String toString() {
        return this.bikeType + " " + brand + " with " +
                gearsNumber + " gear(s) " +
                getLightInfo(isFrontAndBackLight) +
                "\nPrice: " + price + " euros.";
    }
}
