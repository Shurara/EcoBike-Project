package factories;

import model.*;
import ui.InputBikeData;

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

    public Bike getBike(String bikeType) {
        Bike bike = new Bike();
        switch (bikeType) {
            case "FOLDING BIKE":
                bike = getFoldingBike();
                break;
            case "SPEEDELEC":
                bike = getSpeedelec(bikeType);
                break;
            case "E-BIKE":
                bike = getEBike(bikeType);
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

    private ElectroBike getEBike(String bikeType) {
        return new EBike.Builder()
                .setBrand(InputBikeData.getBrand())
                .setMaxSpeed(InputBikeData.getMaxSpeed())
                .setBikeWeight(InputBikeData.getBikeWeight())
                .setFrontAndBackLight(InputBikeData.isFrontAndBackLight())
                .setBatteryCapacity(InputBikeData.getBatteryCapacity())
                .setColor(InputBikeData.getColor())
                .setPrice(InputBikeData.getPrice())
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

    private ElectroBike getSpeedelec(String bikeType) {
        return new Speedelec.Builder()
                .setBrand(InputBikeData.getBrand())
                .setMaxSpeed(InputBikeData.getMaxSpeed())
                .setBikeWeight(InputBikeData.getBikeWeight())
                .setFrontAndBackLight(InputBikeData.isFrontAndBackLight())
                .setBatteryCapacity(InputBikeData.getBatteryCapacity())
                .setColor(InputBikeData.getColor())
                .setPrice(InputBikeData.getPrice())
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

    private FoldingBike getFoldingBike() {
        return new FoldingBike.Builder()
                .setBrand(InputBikeData.getBrand())
                .setWheelsSizeInch(InputBikeData.getWheelsSizeInch())
                .setGearsNumber(InputBikeData.getGearsNumber())
                .setBikeWeight(InputBikeData.getBikeWeight())
                .setFrontAndBackLight(InputBikeData.isFrontAndBackLight())
                .setColor(InputBikeData.getColor())
                .setPrice(InputBikeData.getPrice())
                .build();
    }
}
