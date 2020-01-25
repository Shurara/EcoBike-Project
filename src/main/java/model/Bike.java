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

        if (bikeWeight != bike.bikeWeight) return false;
        if (isFrontAndBackLight != bike.isFrontAndBackLight) return false;
        if (price != bike.price) return false;
        if (brand != null ? !brand.equals(bike.brand) : bike.brand != null) return false;
        return color != null ? color.equals(bike.color) : bike.color == null;
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + bikeWeight;
        result = 31 * result + (isFrontAndBackLight ? 1 : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + price;
        return result;
    }
}
