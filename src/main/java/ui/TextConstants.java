package ui;

public class TextConstants {
    //PATH
    private static final String PATH = "\"src/ecobike.txt\"";

    //TYPES OF BIKES
    private static final String FOLDING_BIKE = "FOLDING BIKE";
    private static final String SPEEDELEC = "SPEEDELEC";
    private static final String E_BIKE = "E-BIKE";

    //MESSAGE
    private static final String WELCOME_MESSAGE = "Please input %s of Bike.. \n";
    private static final String INPUT_PATH_MESSAGE = "Please set path to data file. For example %s \n";
    private static final String NOT_EMPTY_STRING_MESSAGE = "String must be not empty \n";
    private static final String POSITIVE_NUMBER_MESSAGE = "Entered number must be > 0 \n";
    private static final String BOOLEAN_VALUE_MESSAGE = "Value can be only true or false! \n";
    private static final String SELECTED_VALUE_MESSAGE = "You selected  parameters for search:  ";


    //FOLDING BIKE
    private static final String WHEELS_SIZE_INCH = "size of the wheels (in inch)";
    private static String GEARS_NUMBER = "number of gears ";

    //ELECTROBIKE
    private static final String MAX_SPEED = "maximum speed (in km/h)";
    private static final String BATTERY_CAPACITY = "battery capacity (in mAh)";

    //BIKE
    private static final String BRAND = "brand";
    private static final String BIKE_WEIGHT = "weight of the bike (in grams)";
    private static final String IS_FRONT_AND_BACK_LIGHT = "availability of lights at front and back (TRUE/FALSE) \n";
    private static final String COLOR = "color ";
    private static final String PRICE = "price ";

    public static String getInputWelcomeMessage() {
        return WELCOME_MESSAGE;
    }

    public static String getNotEmptyStringMessage() {
        return NOT_EMPTY_STRING_MESSAGE;
    }

    public static String getPositiveNumberMessage() {
        return POSITIVE_NUMBER_MESSAGE;
    }

    public static String getBooleanValueMessage() {
        return BOOLEAN_VALUE_MESSAGE;
    }

    public static String getWheelsSizeInch() {
        return WHEELS_SIZE_INCH;
    }

    public static String getGearsNumber() {
        return GEARS_NUMBER;
    }

    public static String getMaxSpeed() {
        return MAX_SPEED;
    }

    public static String getBatteryCapacity() {
        return BATTERY_CAPACITY;
    }

    public static String getBrand() {
        return BRAND;
    }

    public static String getBikeWeight() {
        return BIKE_WEIGHT;
    }

    public static String getFrontAndBackLight() {
        return IS_FRONT_AND_BACK_LIGHT;
    }

    public static String getColor() {
        return COLOR;
    }

    public static String getPrice() {
        return PRICE;
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
        return WELCOME_MESSAGE;
    }

    public static String getIsFrontAndBackLight() {
        return IS_FRONT_AND_BACK_LIGHT;
    }

    public static String getInputPathMessage() {
        return INPUT_PATH_MESSAGE;
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

    public static String getSelectedValueMessage() {
        return SELECTED_VALUE_MESSAGE;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
