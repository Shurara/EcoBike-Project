package file_processing;

import factories.BikeFactory;
import model.Bike;

public class StringToBikeParser {
    public static Bike parseModels(String input) {
        String bikeType = "";
        String[] properties = new String[6];
        BikeFactory bikeFactory = new BikeFactory();

        if (input.startsWith("FOLDING BIKE")) {
            bikeType = "FOLDING BIKE";
            properties = input.substring(13).trim().split(";");
        }
        if (input.startsWith("SPEEDELEC")) {
            bikeType = "SPEEDELEC";
            properties = input.substring(10).trim().split(";");
        }
        if (input.startsWith("E-BIKE")) {
            bikeType = "E-BIKE";
            properties = input.substring(7).trim().split(";");
        }

        return bikeFactory.getBike(bikeType, properties);

    }
}
