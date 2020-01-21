package data_processing;

import factories.BikeFactory;
import model.Bike;

public class StringToBikeParser {
    public static Bike parseProperties(String input) {
        String bikeType = "";
        String[] properties = new String[6];

        if (input.startsWith("FOLDING BIKE")) {
            bikeType = "FOLDING BIKE";
            properties = input.substring(13).trim().split("; ");
        }
        if (input.startsWith("SPEEDELEC")) {
            bikeType = "SPEEDELEC";
            properties = input.substring(10).trim().split("; ");
        }
        if (input.startsWith("E-BIKE")) {
            bikeType = "E-BIKE";
            properties = input.substring(7).trim().split("; ");
        }

        return new BikeFactory().getBike(bikeType, properties);

    }
}
