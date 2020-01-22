package factories;

import model.*;

public class BikeFactory implements Factory {

    public Bike getBike(String bikeType, String[] properties) {
        Bike bike = new Bike();
        switch (bikeType) {
            case "FOLDING BIKE":
                bike = getFoldingBike(properties);
                break;
            case "SPEEDELEC":
                bike = getSpeedelec(properties, bikeType);
                break;
            case "E-BIKE":
                bike = getEBike(properties, bikeType);
        }
        return bike;


    }

    private ElectroBike getEBike(String[] properties, String bikeType) {
        return new EBike.Builder()
                .setBrand(properties[0].trim())
                .setMaxSpeed(Integer.parseInt(properties[1].trim()))
                .setBikeWeight(Integer.parseInt(properties[2].trim()))
                .setFrontAndBackLight(Boolean.parseBoolean(properties[3].trim()))
                .setBatteryCapacity(Integer.parseInt(properties[4].trim()))
                .setColor(properties[5].trim())
                .setPrice(Integer.parseInt(properties[6].trim()))
                .build(bikeType);
    }

    private ElectroBike getSpeedelec(String[] properties, String bikeType) {
        return new Speedelec.Builder()
                .setBrand(properties[0].trim())
                .setMaxSpeed(Integer.parseInt(properties[1].trim()))
                .setBikeWeight(Integer.parseInt(properties[2].trim()))
                .setFrontAndBackLight(Boolean.parseBoolean(properties[3].trim()))
                .setBatteryCapacity(Integer.parseInt(properties[4].trim()))
                .setColor(properties[5].trim())
                .setPrice(Integer.parseInt(properties[6].trim()))
                .build(bikeType);
    }

    private FoldingBike getFoldingBike(String[] properties) {
        return new FoldingBike.Builder()
                .setBrand(properties[0].trim())
                .setWheelsSizeInch(Integer.parseInt(properties[1].trim()))
                .setGearsNumber(Integer.parseInt(properties[2].trim()))
                .setBikeWeight(Integer.parseInt(properties[3].trim()))
                .setFrontAndBackLight(Boolean.parseBoolean(properties[4].trim()))
                .setColor(properties[5].trim())
                .setPrice(Integer.parseInt(properties[6].trim()))
                .build();
    }

}
