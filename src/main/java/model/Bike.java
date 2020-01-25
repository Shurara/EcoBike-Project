package model;

import java.util.Objects;

public class Bike {

    private String brand;
    private int bikeWeight;
    private boolean isFrontAndBackLight;
    private String color;
    private int price;

    public String getLightInfo(boolean isFrontAndBackLight) {
        String result = isFrontAndBackLight ? "and head/tail light." : "and no head/tail light.";
        return result;
    }

    public Bike() {
    }

    public Bike(String brand, int bikeWeight, boolean isFrontAndBackLight, String color, int price) {
        this.brand = brand;
        this.bikeWeight = bikeWeight;
        this.isFrontAndBackLight = isFrontAndBackLight;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "brand = '" + getBrand() + '\'' +
                        ", bikeWeight = " + getBikeWeight() +
                        ", isFrontAndBackLight = " + getFrontAndBackLight() +
                        ", color =' " + getColor() + '\'' +
                        ", price = " + getPrice();
    }

    public String convertBikeToSring() {
        return getBrand();
    }

    public String showBikeInCatalog() {
        return "";
    }

    public String getBrand() {
        return brand;
    }

    public int getBikeWeight() {
        return bikeWeight;
    }

    public boolean getFrontAndBackLight() {
        return isFrontAndBackLight;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bike bike = (Bike) o;
        return bikeWeight == bike.bikeWeight &&
                isFrontAndBackLight == bike.isFrontAndBackLight &&
                price == bike.price &&
                Objects.equals(brand, bike.brand) &&
                Objects.equals(color, bike.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, bikeWeight, isFrontAndBackLight, color, price);
    }
}
