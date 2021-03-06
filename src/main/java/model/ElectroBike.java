package model;

import java.util.Objects;

public class ElectroBike extends Bike {
    private int maxSpeed;
    private int batteryCapacity;

    public ElectroBike(String brand, int maxSpeed, int bikeWeight, boolean isFrontAndBackLight, int batteryCapacity, String color, int price) {
        super(brand, bikeWeight, isFrontAndBackLight, color, price);
        this.maxSpeed = maxSpeed;
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return super.toString() +
                " , maxSpeed = " + maxSpeed +
                ", batteryCapacity = " + batteryCapacity;
    }

    public String showBikeInCatalog() {
        return getBrand() + " with " + getBatteryCapacity()
                + " mAh battery " + getLightInfo(getFrontAndBackLight())
                + "\nPrice: " + getPrice() + " euros.";

    }

    @Override
    public String convertBikeToSring() {
        return super.convertBikeToSring() + "; " +
                getMaxSpeed() + "; " +
                getBikeWeight() + "; " +
                getFrontAndBackLight() + "; " +
                getBatteryCapacity() + "; " +
                getColor() + "; " +
                getPrice();
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public static class Builder {
        private String brand;
        private int maxSpeed;
        private int bikeWeight;
        private boolean isFrontAndBackLight;
        private int batteryCapacity;
        private String color;
        private int price;


        public Builder() {
        }

        public ElectroBike.Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public ElectroBike.Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }


        public ElectroBike.Builder setBikeWeight(int bikeWeight) {
            this.bikeWeight = bikeWeight;
            return this;
        }

        public ElectroBike.Builder setFrontAndBackLight(boolean isFrontAndBackLight) {
            this.isFrontAndBackLight = isFrontAndBackLight;
            return this;
        }

        public ElectroBike.Builder setBatteryCapacity(int batteryCapacity) {
            this.batteryCapacity = batteryCapacity;
            return this;
        }

        public ElectroBike.Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public ElectroBike.Builder setPrice(int price) {
            this.price = price;
            return this;
        }

        public ElectroBike build(String bikeType) {
            ElectroBike electroBike = new Speedelec(brand, maxSpeed, bikeWeight, isFrontAndBackLight, batteryCapacity, color, price);
            if ("SPEEDELEC".equals(bikeType)) {
                return electroBike;
            }
            if ("E-BIKE".equals(bikeType)) {
                electroBike = new EBike(brand, maxSpeed, bikeWeight, isFrontAndBackLight, batteryCapacity, color, price);
            }
            return electroBike;

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Builder builder = (Builder) o;

            if (maxSpeed != builder.maxSpeed) return false;
            if (bikeWeight != builder.bikeWeight) return false;
            if (isFrontAndBackLight != builder.isFrontAndBackLight) return false;
            if (batteryCapacity != builder.batteryCapacity) return false;
            if (price != builder.price) return false;
            if (brand != null ? !brand.equals(builder.brand) : builder.brand != null) return false;
            return color != null ? color.equals(builder.color) : builder.color == null;
        }

        @Override
        public int hashCode() {
            int result = brand != null ? brand.hashCode() : 0;
            result = 31 * result + maxSpeed;
            result = 31 * result + bikeWeight;
            result = 31 * result + (isFrontAndBackLight ? 1 : 0);
            result = 31 * result + batteryCapacity;
            result = 31 * result + (color != null ? color.hashCode() : 0);
            result = 31 * result + price;
            return result;
        }
    }
}
