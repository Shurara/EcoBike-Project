package factories;

import model.*;

public class BikeFactory implements Factory {

    public Bike getBike(String bikeType, String[] properties) {
        Bike bike = new Bike();
        switch (bikeType) {
            case "FOLDING BIKE":
                bike = new FoldingBike.Builder().setBikeType("FOLDING BIKE")
                        .setBrand(properties[0].trim())
                        .setWheelsSizeInch(Integer.parseInt(properties[1].trim()))
                        .setGearsNumber(Integer.parseInt(properties[2].trim()))
                        .setBikeWeight(Integer.parseInt(properties[3].trim()))
                        .setFrontAndBackLight(Boolean.parseBoolean(properties[4].trim()))
                        .setColor(properties[5].trim())
                        .setPrice(Integer.parseInt(properties[6].trim()))
                        .build();
                break;
            case "SPEEDELEC":
                bike = new ElectroBike.Builder().setBikeType("SPEEDELEC")
                        .setBrand(properties[0].trim())
                        .setMaxSpeed(Integer.parseInt(properties[1].trim()))
                        .setBikeWeight(Integer.parseInt(properties[2].trim()))
                        .setFrontAndBackLight(Boolean.parseBoolean(properties[3].trim()))
                        .setBatteryCapacity(Integer.parseInt(properties[4].trim()))
                        .setColor(properties[5].trim())
                        .setPrice(Integer.parseInt(properties[6].trim()))
                        .build();
                break;
            case "E-BIKE":
                bike = new ElectroBike.Builder().setBikeType("E-BIKE")
                        .setBrand(properties[0].trim())
                        .setMaxSpeed(Integer.parseInt(properties[1].trim()))
                        .setBikeWeight(Integer.parseInt(properties[2].trim()))
                        .setFrontAndBackLight(Boolean.parseBoolean(properties[3].trim()))
                        .setBatteryCapacity(Integer.parseInt(properties[4].trim()))
                        .setColor(properties[5].trim())
                        .setPrice(Integer.parseInt(properties[6].trim()))
                        .build();
        }
        return bike;


    }

}
