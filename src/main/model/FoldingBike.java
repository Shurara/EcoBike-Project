package model;

public class FoldingBike extends Bike {
    public int wheelsSizeInch;
    public int gearsNumber;


    @Override
   /* FOLDING BIKE Dahon with 1 gear(s) and no head/tail light.
    Price: 899 euros.*/


    public String toString() {
        return this.bikeType + " " + brand + " with " +
                gearsNumber + " gear(s) " +
                getLightInfo(isFrontAndBackLight) +
                "\nPrice: " + price + " euros.";
    }
}
