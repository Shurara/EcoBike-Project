package model;

public class ElectroBike extends Bike {
    public int maxSpeed;
    public int batteryCapacity;

    public ElectroBike(String brand, int maxSpeed, int bikeWeight, boolean isFrontAndBackLight, int batteryCapacity, String color, int price) {
        super(brand, bikeWeight, isFrontAndBackLight, color, price);
        this.maxSpeed = maxSpeed;
        this.batteryCapacity = batteryCapacity;
    }


    public String toString() {
        return brand + " with " + batteryCapacity
                + " mAh battery " + getLightInfo(isFrontAndBackLight)
                + "\nPrice: " + price + " euros.";

    }

    public static class Builder {
        public String bikeType;
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
            if("SPEEDELEC".equals(bikeType)){
               return electroBike;
            }
            if("E-BIKE".equals(bikeType)){
                electroBike = new EBike(brand, maxSpeed, bikeWeight, isFrontAndBackLight, batteryCapacity, color, price);
            }
            return electroBike;

        }

    }
}
