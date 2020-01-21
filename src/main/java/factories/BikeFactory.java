package factories;

import model.*;

public class BikeFactory implements Factory {
    public Bike getBike(String bikeType, String[] properties) {
        Bike bike = new Bike();
        switch (bikeType) {
            case "FOLDING BIKE":
                bike = new FoldingBike.Builder().setBikeType("FOLDING BIKE")
                        .setBrand(properties[0])
                        .setWheelsSizeInch(Integer.parseInt(properties[1]))
                        .setGearsNumber(Integer.parseInt(properties[2]))
                        .setBikeWeight(Integer.parseInt(properties[3]))
                        .setFrontAndBackLight(Boolean.parseBoolean(properties[4]))
                        .setColor(properties[5])
                        .setPrice(Integer.parseInt(properties[3]))
                        .build();
            case "SPEEDELEC":
                bike = new ElectroBike.Builder().setBikeType("SPEEDELEC")
                        .setBrand(properties[0])
                        .setMaxSpeed(Integer.parseInt(properties[1]))
                        .setBikeWeight(Integer.parseInt(properties[2]))
                        .setFrontAndBackLight(Boolean.parseBoolean(properties[3]))
                        .setBatteryCapacity(Integer.parseInt(properties[4]))
                        .setColor(properties[5])
                        .setPrice(Integer.parseInt(properties[6]))
                        .build();
            case "E-BIKE":
                bike = new ElectroBike.Builder().setBikeType("E-BIKE")
                        .setBrand(properties[0])
                        .setMaxSpeed(Integer.parseInt(properties[1]))
                        .setBikeWeight(Integer.parseInt(properties[2]))
                        .setFrontAndBackLight(Boolean.parseBoolean(properties[3]))
                        .setBatteryCapacity(Integer.parseInt(properties[4]))
                        .setColor(properties[5])
                        .setPrice(Integer.parseInt(properties[6]))
                        .build();
        }
        return bike;


    }
}
