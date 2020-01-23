package ui;

import data_processing.BikeCatalog;
import model.Bike;
import model.FoldingBike;

import java.util.Scanner;

public class InputBikeData {
    Bike createdBike;

    public static FoldingBike createUsersFoldingBike() {

        Scanner scanner = new Scanner(System.in);

        String brand = inputBrand(Message.getInputWelcomeMessage(), Message.getBrand(), Message.getNotEmptyStringMessage());

        int wheelsSizeInch = inputWheelsSize(Message.getInputWelcomeMessage(), Message.getWheelsSizeInch(), Message.getPositiveNumberMessage());

        int gearsNumber = inputGearsNumber(Message.getInputWelcomeMessage(), Message.getGearsNumber(), Message.getPositiveNumberMessage());

        int bikeWeight = inputBikeWeight(Message.getInputWelcomeMessage(), Message.getBikeWeight(), Message.getPositiveNumberMessage());

        boolean isFrontAndBackLight = inputFrontAndBackLight(Message.getInputWelcomeMessage(), Message.getFrontAndBackLight(), Message.getBooleanValueMessage());

        String color = inputColor(Message.getInputWelcomeMessage(), Message.getColor(), Message.getNotEmptyStringMessage());

        int price = inputPrices(Message.getInputWelcomeMessage(), Message.getPrice(), Message.getPositiveNumberMessage());

        FoldingBike createdFoldingBike = new FoldingBike.Builder()
                .setBrand(brand)
                .setWheelsSizeInch(wheelsSizeInch)
                .setGearsNumber(gearsNumber)
                .setBikeWeight(bikeWeight)
                .setFrontAndBackLight(isFrontAndBackLight)
                .setColor(color)
                .setPrice(price)
                .build();
        System.out.println(createdFoldingBike.showFullInfo());
        return createdFoldingBike;
    }

    private static int inputPrices(String welcomeMessage, String param, String mistakeMessage) {
        System.out.printf(welcomeMessage, param);
        return InputDataChecker.getNubmerValue(i -> i < 0, mistakeMessage);
    }

    private static String inputColor(String welcomeMessage, String param, String mistakeMessage) {
        System.out.printf(welcomeMessage, param);
        return InputDataChecker.getStringValue(str -> str == null || str.trim().isEmpty(), mistakeMessage);
    }

    private static boolean inputFrontAndBackLight(String welcomeMessage, String param, String mistakeMessage) {
        System.out.printf(welcomeMessage, param);
        return InputDataChecker.getBooleanValue(value -> !"true".equalsIgnoreCase(value) && !"false".equalsIgnoreCase(value), mistakeMessage);
    }

    private static int inputBikeWeight(String welcomeMessage, String param, String mistakeMessage) {
        System.out.printf(welcomeMessage, param);
        return InputDataChecker.getNubmerValue(i -> i < 0, mistakeMessage);
    }

    private static int inputGearsNumber(String welcomeMessage, String param, String mistakeMessage) {
        System.out.println(welcomeMessage);
        return InputDataChecker.getNubmerValue(i -> i < 0, mistakeMessage);
    }

    private static int inputWheelsSize(String welcomeMessage, String param, String mistakeMessage) {
        System.out.printf(welcomeMessage, param);
        return InputDataChecker.getNubmerValue(i -> i < 0, mistakeMessage);
    }

    private static String inputBrand(String welcomeMessage, String param, String mistakeMessage) {
        System.out.printf(welcomeMessage, param);
        return InputDataChecker.getStringValue(str -> str == null || str.trim().isEmpty(), mistakeMessage);
    }


    public static void addBiketoList() {
        BikeCatalog.getListOfBikes().add(createUsersFoldingBike());
        BikeCatalog.setChanged(true);
    }
}
