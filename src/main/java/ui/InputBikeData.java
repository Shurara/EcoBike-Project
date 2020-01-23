package ui;

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
        brand = inputBrand(TextConstants.getInputWelcomeMessage(), TextConstants.getBrand(), TextConstants.getNotEmptyStringMessage());
        bikeWeight = inputBikeWeight(TextConstants.getInputWelcomeMessage(), TextConstants.getBikeWeight(), TextConstants.getPositiveNumberMessage());
        isFrontAndBackLight = inputFrontAndBackLight(TextConstants.getInputWelcomeMessage(), TextConstants.getFrontAndBackLight(), TextConstants.getBooleanValueMessage() );
        color = inputColor(TextConstants.getInputWelcomeMessage(), TextConstants.getColor(), TextConstants.getNotEmptyStringMessage());
        price = inputPrice(TextConstants.getInputWelcomeMessage(), TextConstants.getPrice(), TextConstants.getPositiveNumberMessage());
    }

    static void inputFoldingBikeParams() {
        wheelsSizeInch = inputWheelsSize(TextConstants.getInputWelcomeMessage(), TextConstants.getWheelsSizeInch(), TextConstants.getPositiveNumberMessage());
        gearsNumber = inputGearsNumber(TextConstants.getInputWelcomeMessage(), TextConstants.getGearsNumber(), TextConstants.getPositiveNumberMessage());

    }

    static void inputElectroBikeParams() {
        maxSpeed = inputMaxSpeed(TextConstants.getInputWelcomeMessage(), TextConstants.getMaxSpeed(), TextConstants.getPositiveNumberMessage());

        batteryCapacity = inputBatteryCapacity(TextConstants.getInputWelcomeMessage(), TextConstants.getBatteryCapacity(), TextConstants.getPositiveNumberMessage());

    }

    static void getFullFoldingBikeInfo() {
        inputBaseBikeParams();
        inputFoldingBikeParams();
    }

    static void getFullElectroBikeInfo() {
        inputBaseBikeParams();
        inputElectroBikeParams();
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
