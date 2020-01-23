package ui;

import java.util.HashMap;
import java.util.Map;

public class SearchParamsGetter {
    public static Map<String, String> getSearchValues() {
        Map<String, String> requestMap = new HashMap<>();

        //FOLDING BIKE
        String wheelsSizeInch = "size of the wheels (in inch)";
        String gearsNumber = "number of gears";

        //ELECTROBIKE
        String maxSpeed = "maximum speed (in km/h)";
        String batteryCapacity = "battery capacity (in mAh)";

        //BIKE
        String brand = "brand";
        String bikeWeight = "weight of the bike (in grams)";
        String isFrontAndBackLight = "availability of lights at front and back (TRUE/FALSE)";
        String color = "color";
        String price = "price";

        switch (DataChecker.getBykeType()) {
            case "f":
                System.out.println("Great! Let's search Folding Bikes)");
                addFoldingBikeSearсhParams(requestMap, wheelsSizeInch, gearsNumber);
                break;
            case "e":
                System.out.println("Cool! Let's search Folding E-Bikes or Speedelecs)");
                addElectroBikeSearchParams(requestMap, maxSpeed, batteryCapacity);
                break;
        }

        addBaseSearchParams(requestMap, brand, bikeWeight, isFrontAndBackLight, color, price);

        System.out.println(requestMap);
        return requestMap;
    }

    private static Map<String, String> addElectroBikeSearchParams(Map<String, String> requestMap, String maxSpeed, String batteryCapacity) {
        requestMap.put("maxSpeed", DataChecker.getSearchParameters(maxSpeed));
        requestMap.put("batteryCapacity", DataChecker.getSearchParameters(batteryCapacity));
        return requestMap;
    }

    private static Map<String, String> addBaseSearchParams(Map<String, String> requestMap, String brand, String bikeWeight, String isFrontAndBackLight, String color, String price) {
        requestMap.put("brand", DataChecker.getSearchParameters(brand));
        requestMap.put("bikeWeight", DataChecker.getSearchParameters(bikeWeight));
        requestMap.put("isFrontAndBackLight", DataChecker.getSearchParameters(isFrontAndBackLight));
        requestMap.put("color", DataChecker.getSearchParameters(color));
        requestMap.put("price", DataChecker.getSearchParameters(price));
        return requestMap;
    }

    private static Map<String, String> addFoldingBikeSearсhParams(Map<String, String> requestMap, String wheelsSizeInch, String gearsNumber) {
        requestMap.put("wheelsSizeInch", DataChecker.getSearchParameters(wheelsSizeInch));
        requestMap.put("gearsNumber", DataChecker.getSearchParameters(gearsNumber));
        return requestMap;
    }
}
