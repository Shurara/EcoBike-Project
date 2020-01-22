package data_processing;

import ui.DataChecker;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SearchFunction {
    public static Map<String, String> getSearchValues() {
        Map<String, String> searchParameters = new HashMap<>();
        //BIKE
        String brand = "brand";
        String bikeWeight = "weight of the bike (in grams)";
        String isFrontAndBackLight = "availability of lights at front and back (TRUE/FALSE)";
        String color = "color";
        String price = "price";

        //FOLDING BIKE
        String wheelsSizeInch = "size of the wheels (in inch)";
        String gearsNumber = "number of gears";

        //ELECTROBIKE
        String maxSpeed = "maximum speed (in km/h)";
        String batteryCapacity = "battery capacity (in mAh)";


        searchParameters.put(brand, DataChecker.getSearchParameters(brand));
        searchParameters.put(wheelsSizeInch, DataChecker.getSearchParameters(wheelsSizeInch));
        searchParameters.put(gearsNumber, DataChecker.getSearchParameters(gearsNumber));
        searchParameters.put(bikeWeight, DataChecker.getSearchParameters(bikeWeight));
        searchParameters.put(isFrontAndBackLight, DataChecker.getSearchParameters(isFrontAndBackLight));
        searchParameters.put(color, DataChecker.getSearchParameters(color));
        searchParameters.put(price, DataChecker.getSearchParameters(price));
        searchParameters.put(maxSpeed, DataChecker.getSearchParameters(maxSpeed));
        searchParameters.put(batteryCapacity, DataChecker.getSearchParameters(batteryCapacity));
        System.out.println(searchParameters);
        return searchParameters;
    }


}
