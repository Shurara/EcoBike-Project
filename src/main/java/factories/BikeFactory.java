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
                break;
        }
        return bike;

    }

    public static Bike getBike(String bikeType, InputBikeData data) {
        Bike bike = new Bike();
        switch (bikeType) {
            case "FOLDING BIKE":
                bike = getFoldingBike(data);
                break;
            case "SPEEDELEC":
                bike = getSpeedelec(bikeType, data);
                break;
            case "E-BIKE":
                bike = getEBike(bikeType, data);
                break;
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

    private static ElectroBike getEBike(String bikeType, InputBikeData data) {
        ElectroBike eBike = new EBike.Builder()
                .setBrand(data.getBrand())
                .setMaxSpeed(data.getMaxSpeed())
                .setBikeWeight(data.getBikeWeight())
                .setFrontAndBackLight(data.isFrontAndBackLight())
                .setBatteryCapacity(data.getBatteryCapacity())
                .setColor(data.getColor())
                .setPrice(data.getPrice())
                .build(bikeType);
        System.out.println(eBike);
        return eBike;
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

    private static ElectroBike getSpeedelec(String bikeType, InputBikeData data) {
        ElectroBike eBike = new Speedelec.Builder()
                .setBrand(data.getBrand())
                .setMaxSpeed(data.getMaxSpeed())
                .setBikeWeight(data.getBikeWeight())
                .setFrontAndBackLight(data.isFrontAndBackLight())
                .setBatteryCapacity(data.getBatteryCapacity())
                .setColor(data.getColor())
                .setPrice(data.getPrice())
                .build(bikeType);
        System.out.println(eBike);
        return eBike;
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

    private static FoldingBike getFoldingBike(InputBikeData data) {
        FoldingBike foldingBike = new FoldingBike.Builder()
                .setBrand(data.getBrand())
                .setWheelsSizeInch(data.getWheelsSizeInch())
                .setGearsNumber(data.getGearsNumber())
                .setBikeWeight(data.getBikeWeight())
                .setFrontAndBackLight(data.isFrontAndBackLight())
                .setColor(data.getColor())
                .setPrice(data.getPrice())
                .build();
        System.out.println(foldingBike);
        return foldingBike;

    }
}
