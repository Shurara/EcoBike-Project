package factories;

import model.*;
import ui.InputBikeData;

import static data_processing.Fields.BATTERYCAPACITY;
import static data_processing.Fields.BIKEWEIGHT;
import static data_processing.Fields.BRAND;
import static data_processing.Fields.COLOR;
import static data_processing.Fields.EBIKE;
import static data_processing.Fields.FOLDINGBIKE;
import static data_processing.Fields.GEARSNUMBER;
import static data_processing.Fields.ISFRONTANDBACKLIGHT;
import static data_processing.Fields.MAXSPEED;
import static data_processing.Fields.PRICE;
import static data_processing.Fields.SPEEDELEC;
import static data_processing.Fields.TYPE;
import static data_processing.Fields.WHEELSSIZEINCH;

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

    public static Bike getBike(Product product) {
        Bike bike = new Bike();
        String bikeType = product.getFeatures().get(TYPE.getName());
        switch (bikeType) {
            case "FOLDING BIKE":
                bike = getFoldingBike(product);
                break;
            case "SPEEDELEC":
                bike = getSpeedelec(bikeType, product);
                break;
            case "E-BIKE":
                bike = getEBike(bikeType, product);
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
        System.out.println("There is a new instance of " + eBike);
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
        System.out.println("There is a new instance of " + eBike);
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
        System.out.println("There is a new instance of " + foldingBike);
        return foldingBike;

    }

    private static FoldingBike getFoldingBike(Product product) {
        FoldingBike foldingBike = new FoldingBike.Builder()
                .setBrand(product.getFeatures().get(BRAND.getName()))
                .setWheelsSizeInch(Integer.parseInt(product.getFeatures().get(WHEELSSIZEINCH.getName())))
                .setGearsNumber(Integer.parseInt(product.getFeatures().get(GEARSNUMBER.getName())))
                .setBikeWeight(Integer.parseInt(product.getFeatures().get(BIKEWEIGHT.getName())))
                .setFrontAndBackLight(Boolean.parseBoolean(product.getFeatures().get(ISFRONTANDBACKLIGHT.getName())))
                .setColor(product.getFeatures().get(COLOR.getName()))
                .setPrice(Integer.parseInt(product.getFeatures().get(PRICE.getName())))
                .build();
        return foldingBike;

    }

    private static ElectroBike getSpeedelec(String bikeType, Product product) {
        ElectroBike eBike = new Speedelec.Builder()
                .setBrand(product.getFeatures().get(BRAND.getName()))
                .setMaxSpeed(Integer.parseInt(product.getFeatures().get(MAXSPEED.getName())))
                .setBikeWeight(Integer.parseInt(product.getFeatures().get(BIKEWEIGHT.getName())))
                .setFrontAndBackLight(Boolean.parseBoolean(product.getFeatures().get(ISFRONTANDBACKLIGHT.getName())))
                .setBatteryCapacity(Integer.parseInt(product.getFeatures().get(BATTERYCAPACITY.getName())))
                .setColor(product.getFeatures().get(COLOR.getName()))
                .setPrice(Integer.parseInt(product.getFeatures().get(PRICE.getName())))
                .build(bikeType);
       // System.out.println(eBike);
        return eBike;
    }

    private static ElectroBike getEBike(String bikeType, Product product) {
        ElectroBike eBike = new EBike.Builder()
                .setBrand(product.getFeatures().get(BRAND.getName()))
                .setMaxSpeed(Integer.parseInt(product.getFeatures().get(MAXSPEED.getName())))
                .setBikeWeight(Integer.parseInt(product.getFeatures().get(BIKEWEIGHT.getName())))
                .setFrontAndBackLight(Boolean.parseBoolean(product.getFeatures().get(ISFRONTANDBACKLIGHT.getName())))
                .setBatteryCapacity(Integer.parseInt(product.getFeatures().get(BATTERYCAPACITY.getName())))
                .setColor(product.getFeatures().get(COLOR.getName()))
                .setPrice(Integer.parseInt(product.getFeatures().get(PRICE.getName())))
                .build(bikeType);
       // System.out.println(eBike);
        return eBike;
    }

}
