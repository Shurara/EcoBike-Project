package model;

public class FoldingBike extends Bike {
    private int wheelsSizeInch;
    private int gearsNumber;

    public FoldingBike(String brand, int wheelsSizeInch, int gearsNumber, int bikeWeight, boolean isFrontAndBackLight, String color, int price) {
        super(brand, bikeWeight, isFrontAndBackLight, color, price);
        this.wheelsSizeInch = wheelsSizeInch;
        this.gearsNumber = gearsNumber;
    }


    public String showBikeInCatalog() {
        return "FOLDING BIKE " + getBrand() + " with " +
                getGearsNumber() + " gear(s) " +
                getLightInfo(getFrontAndBackLight()) +
                "\nPrice: " + getPrice() + " euros.";
    }


    public String toString() {
        return "Folding Bike: {" + super.toString() +
                ", wheelsSizeInch = " + wheelsSizeInch +
                ", gearsNumber = " + gearsNumber +
                "} ";
    }

    @Override
    public String convertBikeToWrite() {
        return "FOLDING BIKE " + super.convertBikeToWrite() + "; " +
                getWheelsSizeInch() + "; " +
                getGearsNumber() + "; " +
                getBikeWeight() + "; " +
                getFrontAndBackLight() + "; " +
                getColor() + "; " +
                getPrice();

    }

    public int getWheelsSizeInch() {
        return wheelsSizeInch;
    }

    public int getGearsNumber() {
        return gearsNumber;
    }

    public static class Builder {
        private String brand;
        private int wheelsSizeInch;
        private int gearsNumber;
        private int bikeWeight;
        private boolean isFrontAndBackLight;
        private String color;
        private int price;

        public Builder() {
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setWheelsSizeInch(int wheelsSizeInch) {
            this.wheelsSizeInch = wheelsSizeInch;
            return this;
        }

        public Builder setGearsNumber(int gearsNumber) {
            this.gearsNumber = gearsNumber;
            return this;
        }

        public Builder setBikeWeight(int bikeWeight) {
            this.bikeWeight = bikeWeight;
            return this;
        }

        public Builder setFrontAndBackLight(boolean isFrontAndBackLight) {
            this.isFrontAndBackLight = isFrontAndBackLight;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setPrice(int price) {
            this.price = price;
            return this;
        }

        public FoldingBike build() {
            return new FoldingBike(brand, wheelsSizeInch, gearsNumber, bikeWeight, isFrontAndBackLight, color, price);
        }

    }


}
