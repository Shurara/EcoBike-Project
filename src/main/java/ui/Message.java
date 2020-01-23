package ui;

public class Message {
    //
    private static final String inputWelcomeMessage = "Please input %s of Folding Bike..";
    private static final String notEmptyStringMessage = "String must be not empty";
    private static final String positiveNumberMessage = "Entered number must be > 0";
    private static final String booleanValueMessage = "Value can be only true or false!";


    //FOLDING BIKE
    private static final String wheelsSizeInch = "size of the wheels (in inch)";
    private static String gearsNumber = "number of gears";

    //ELECTROBIKE
    private static final String maxSpeed = "maximum speed (in km/h)";
    private static final String batteryCapacity = "battery capacity (in mAh)";

    //BIKE
    private static final String brand = "brand";
    private static final String bikeWeight = "weight of the bike (in grams)";
    private static final String isFrontAndBackLight = "availability of lights at front and back (TRUE/FALSE)";
    private static final String color = "color";
    private static final String price = "price";

    public static String getInputWelcomeMessage() {
        return inputWelcomeMessage;
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
}
