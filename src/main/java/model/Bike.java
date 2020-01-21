package model;

public class Bike {

    public String bikeType;
    public String brand;
    public  int bikeWeight;
    public boolean isFrontAndBackLight;
    public String color;
    public int price;

    public String getLightInfo(boolean isFrontAndBackLight){
        String result = isFrontAndBackLight ? "and head/tail light." : "and no head/tail light.";
        return result;
    }




}
