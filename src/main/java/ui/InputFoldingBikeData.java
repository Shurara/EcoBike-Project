package ui;

import data_processing.BikeCatalog;
import model.FoldingBike;

import java.util.Scanner;

public class InputFoldingBikeData {

    public static FoldingBike createUsersFoldingBike() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input brand of Folding Bike..");
        String brand = DataChecker.getStringValue(str -> str == null || str.trim().isEmpty(), "String must be not empty. Input brand");

        System.out.println("Please input the size of the wheels (in inch) for Folding Bike..");
        int wheelsSizeInch = DataChecker.getNubmerValue(i -> i < 0, "Entered number must be > 0");

        System.out.println("Please input the number of gears for Folding Bike..");
        int gearsNumber = DataChecker.getNubmerValue(i -> i < 0, "Entered number must be > 0");

        System.out.println("Please input the weight of the bike (in grams) for Folding Bike..");
        int bikeWeight = DataChecker.getNubmerValue(i -> i < 0, "Entered number must be > 0");

        System.out.println("Please input the availability of lights at front and back (TRUE/FALSE) for Folding Bike..");
        //boolean isFrontAndBackLight = scanner.nextBoolean();
        boolean isFrontAndBackLight = DataChecker.getBooleanValue(value -> "true".equalsIgnoreCase(value) && "false".equalsIgnoreCase(value), "Value can be only true or false");

        System.out.println("Please input the color for Folding Bike..");
        String color = DataChecker.getStringValue(str -> str == null || str.trim().isEmpty(), "String must be not empty");

        System.out.println("Please input the price for Folding Bike..");
        int price = DataChecker.getNubmerValue(i -> i < 0, "Entered number must be > 0");

        FoldingBike createdFoldingBike = new  FoldingBike.Builder()
                .setBrand(brand)
                .setWheelsSizeInch(wheelsSizeInch)
                .setGearsNumber(gearsNumber)
                .setBikeWeight(bikeWeight)
                .setFrontAndBackLight(isFrontAndBackLight)
                .setColor(color)
                .setPrice(price)
                .build();
        return createdFoldingBike;
    }

    public static void showCreatedBike(){
        System.out.println(createUsersFoldingBike());
    }

    public static void addBiketoList(){
        BikeCatalog.getListOfBikes().add(createUsersFoldingBike());
        BikeCatalog.setChanged(true);
    }
}
