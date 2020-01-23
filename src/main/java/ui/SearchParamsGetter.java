package ui;

import java.util.HashMap;
import java.util.Map;

public class SearchParamsGetter {
    public static Map<String, String> getSearchValues() {
        Map<String, String> requestMap = new HashMap<>();

        //FOLDING BIKE
        String wheelsSizeInch = Message.getWheelsSizeInch();
        String gearsNumber = Message.getGearsNumber();

        //ELECTROBIKE
        String maxSpeed = "maximum speed (in km/h)";
        String batteryCapacity = "battery capacity (in mAh)";

        //BIKE
        String brand = Message.getBrand();
        String bikeWeight = Message.getBikeWeight();
        String isFrontAndBackLight = Message.getFrontAndBackLight();
        String color = Message.getColor();
        String price = Message.getPrice();

        switch (InputDataChecker.getBykeType()) {
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
        requestMap.put("maxSpeed", InputDataChecker.getSearchParameters(maxSpeed));
        requestMap.put("batteryCapacity", InputDataChecker.getSearchParameters(batteryCapacity));
        return requestMap;
    }

    private static Map<String, String> addBaseSearchParams(Map<String, String> requestMap, String brand, String bikeWeight, String isFrontAndBackLight, String color, String price) {
        requestMap.put("brand", InputDataChecker.getSearchParameters(brand));
        requestMap.put("bikeWeight", InputDataChecker.getSearchParameters(bikeWeight));
        requestMap.put("isFrontAndBackLight", InputDataChecker.getSearchParameters(isFrontAndBackLight));
        requestMap.put("color", InputDataChecker.getSearchParameters(color));
        requestMap.put("price", InputDataChecker.getSearchParameters(price));
        return requestMap;
    }

    private static Map<String, String> addFoldingBikeSearсhParams(Map<String, String> requestMap, String wheelsSizeInch, String gearsNumber) {
        requestMap.put("wheelsSizeInch", InputDataChecker.getSearchParameters(wheelsSizeInch));
        requestMap.put("gearsNumber", InputDataChecker.getSearchParameters(gearsNumber));
        return requestMap;
    }


}
