package ui;

import data_processing.BikeCatalog;
import model.FoldingBike;

public class InputBikeData {

    private static String brand;
    private static int bikeWeight;
    private static boolean isFrontAndBackLight;
    private static String color;
    private static int price;
    private static int wheelsSizeInch;
    private static int gearsNumber;
    private static int maxSpeed;
    private static int batteryCapacity;

    static void inputBaseBikeParams() {
        brand = inputBrand(Message.getInputWelcomeMessage(), Message.getBrand(), Message.getNotEmptyStringMessage());
        bikeWeight = inputBikeWeight(Message.getInputWelcomeMessage(), Message.getBikeWeight(), Message.getPositiveNumberMessage());
        isFrontAndBackLight = inputFrontAndBackLight(Message.getInputWelcomeMessage(),Message.getFrontAndBackLight(),Message.getBooleanValueMessage() );
        color = inputColor(Message.getInputWelcomeMessage(), Message.getColor(), Message.getNotEmptyStringMessage());
        price = inputPrice(Message.getInputWelcomeMessage(), Message.getPrice(), Message.getPositiveNumberMessage());
    }

    static void inputFoldingBikeParams() {
        wheelsSizeInch = inputWheelsSize(Message.getInputWelcomeMessage(), Message.getWheelsSizeInch(), Message.getPositiveNumberMessage());
        batteryCapacity = inputBatteryCapacity(Message.getInputWelcomeMessage(), Message.getBatteryCapacity(), Message.getPositiveNumberMessage());

    }

    static void inputElectroBikeParams() {
        maxSpeed = inputMaxSpeed(Message.getInputWelcomeMessage(), Message.getMaxSpeed(), Message.getPositiveNumberMessage());
        gearsNumber = inputGearsNumber(Message.getInputWelcomeMessage(), Message.getGearsNumber(), Message.getPositiveNumberMessage());

    }

    static void getFullinfo() {
        inputBaseBikeParams();
        inputFoldingBikeParams();
    }

    public static FoldingBike createUsersFoldingBike() {

        getFullinfo();

        FoldingBike createdBike = new FoldingBike.Builder()
                .setBrand(brand)
                .setWheelsSizeInch(wheelsSizeInch)
                .setGearsNumber(gearsNumber)
                .setBikeWeight(bikeWeight)
                .setFrontAndBackLight(isFrontAndBackLight)
                .setColor(color)
                .setPrice(price)
                .build();
        System.out.println(createdBike.showFullInfo());
        return createdBike;
    }

    private static int inputPrice(String welcomeMessage, String param, String mistakeMessage) {
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
        System.out.printf(welcomeMessage, param);
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

    private static int inputMaxSpeed(String welcomeMessage, String param, String mistakeMessage) {
        System.out.printf(welcomeMessage, param);
        return InputDataChecker.getNubmerValue(i -> i < 0, mistakeMessage);
    }

    private static int inputBatteryCapacity(String welcomeMessage, String param, String mistakeMessage) {
        System.out.printf(welcomeMessage, param);
        return InputDataChecker.getNubmerValue(i -> i < 0, mistakeMessage);
    }


    public static void addBiketoList() {
        BikeCatalog.getListOfBikes().add(createUsersFoldingBike());
        BikeCatalog.setChanged(true);
    }

    public static String getBrand() {
        return brand;
    }

    public static int getBikeWeight() {
        return bikeWeight;
    }

    public static boolean isFrontAndBackLight() {
        return isFrontAndBackLight;
    }

    public static String getColor() {
        return color;
    }

    public static int getPrice() {
        return price;
    }

    public static int getWheelsSizeInch() {
        return wheelsSizeInch;
    }

    public static int getGearsNumber() {
        return gearsNumber;
    }

    public static int getMaxSpeed() {
        return maxSpeed;
    }

    public static int getBatteryCapacity() {
        return batteryCapacity;
    }
}
