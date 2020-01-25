package ui;

public class TextConstants {
    //PATH
    private static final String  PATH = "\"src/ecobike.txt\"";

    //TYPES OF BIKES
    private static final String  FOLDING_BIKE ="FOLDING BIKE";
    private static final String  SPEEDELEC ="SPEEDELEC";
    private static final String  E_BIKE ="E-BIKE";

    //MESSAGE
    private static final String WelcomeMessage = "Please input %s of Bike.. \n";
    private static final String inputPathMessage = "Please set path to data file. For example %s \n";
    private static final String notEmptyStringMessage = "String must be not empty \n";
    private static final String positiveNumberMessage = "Entered number must be > 0 \n";
    private static final String booleanValueMessage = "Value can be only true or false! \n";


    //FOLDING BIKE
    private static final String wheelsSizeInch = "size of the wheels (in inch)\n";
    private static String gearsNumber = "number of gears \n";

    //ELECTROBIKE
    private static final String maxSpeed = "maximum speed (in km/h)\n";
    private static final String batteryCapacity = "battery capacity (in mAh)\n";

    //BIKE
    private static final String brand = "brand";
    private static final String bikeWeight = "weight of the bike (in grams)\n";
    private static final String isFrontAndBackLight = "availability of lights at front and back (TRUE/FALSE) \n";
    private static final String color = "color \n";
    private static final String price = "price \n";

    public static String getInputWelcomeMessage() {
        return WelcomeMessage;
    }

    public static String getNotEmptyStringMessage() {
        return notEmptyStringMessage;
    }

    public static String getPositiveNumberMessage() {
        return positiveNumberMessage;
    }

    public static String getBooleanValueMessage() {
        return booleanValueMessage;
    }

    public static String getWheelsSizeInch() {
        return wheelsSizeInch;
    }

    public static String getGearsNumber() {
        return gearsNumber;
    }

    public static String getMaxSpeed() {
        return maxSpeed;
    }

    public static String getBatteryCapacity() {
        return batteryCapacity;
    }

    public static String getBrand() {
        return brand;
    }

    public static String getBikeWeight() {
        return bikeWeight;
    }

    public static String getFrontAndBackLight() {
        return isFrontAndBackLight;
    }

    public static String getColor() {
        return color;
    }

    public static String getPrice() {
        return price;
    }

    public static String getFoldingBike() {
        return FOLDING_BIKE;
    }

    public static String getSpeedelecType() {
        return SPEEDELEC;
    }

    public static String getEBikeType() {
        return E_BIKE;
    }

    public static String getWelcomeMessage() {
        return WelcomeMessage;
    }

    public static String getIsFrontAndBackLight() {
        return isFrontAndBackLight;
    }

    public static String getInputPathMessage() {
        return inputPathMessage;
    }
    public static String getPATH() {
        return PATH;
    }

    public static String getSPEEDELEC() {
        return SPEEDELEC;
    }

    public static String geteBike() {
        return E_BIKE;
    }
}
