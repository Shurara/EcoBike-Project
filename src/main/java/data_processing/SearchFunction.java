package data_processing;

import ui.DataChecker;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SearchFunction {
    public static Map<String, String> getSearchValues() {
        Map<String, String> requestMap = new HashMap<>();
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


        requestMap.put(brand, DataChecker.getSearchParameters(brand));
        requestMap.put(wheelsSizeInch, DataChecker.getSearchParameters(wheelsSizeInch));
        requestMap.put(gearsNumber, DataChecker.getSearchParameters(gearsNumber));
        requestMap.put(bikeWeight, DataChecker.getSearchParameters(bikeWeight));
        requestMap.put(isFrontAndBackLight, DataChecker.getSearchParameters(isFrontAndBackLight));
        requestMap.put(color, DataChecker.getSearchParameters(color));
        requestMap.put(price, DataChecker.getSearchParameters(price));
        requestMap.put(maxSpeed, DataChecker.getSearchParameters(maxSpeed));
        requestMap.put(batteryCapacity, DataChecker.getSearchParameters(batteryCapacity));
        System.out.println(requestMap);
        return requestMap;
    }


}
