package ui;

import java.util.HashMap;
import java.util.Map;

import data_processing.Search;

public class InputSearchParams {
    public static void getSearchValues() {

        Map<String, String> requestParameters = new HashMap<>();

        //FOLDING BIKE
        String wheelsSizeInch = TextConstants.getWheelsSizeInch();
        String gearsNumber = TextConstants.getGearsNumber();

        //ELECTROBIKE
        String maxSpeed = "maximum speed (in km/h)";
        String batteryCapacity = "battery capacity (in mAh)";

        //BIKE
        String brand = TextConstants.getBrand();
        String bikeWeight = TextConstants.getBikeWeight();
        String isFrontAndBackLight = TextConstants.getFrontAndBackLight();
        String color = TextConstants.getColor();
        String price = TextConstants.getPrice();

        inputParameters(requestParameters, wheelsSizeInch, gearsNumber, maxSpeed, batteryCapacity);

        addBaseSearchParameters(requestParameters, bikeWeight, isFrontAndBackLight, color, price);

        //call search
        Search.searchBike(requestParameters);
    }

    private static void inputParameters(Map<String, String> requestParameters, String wheelsSizeInch, String gearsNumber, String maxSpeed, String batteryCapacity) {
        String bikeType = InputDataChecker.getBikeType();
        switch (bikeType) {
            case "f":
                System.out.println("Great! Let's search Folding Bikes)");
                getBrandForSearch(requestParameters, "brand", InputDataChecker.getBrandFromUser());
                addFoldingBikeSearсhParameters(requestParameters, wheelsSizeInch, gearsNumber);
                break;
            case "e":
                System.out.println("Cool! Let's search E-Bikes)");
                getBrandForSearch(requestParameters, "brand", InputDataChecker.getBrandFromUser());
                addElectroBikeSearchParameters(requestParameters, maxSpeed, batteryCapacity);
                break;
            case "s":
                System.out.println("Cool! Let's search Speedelecs)");
                getBrandForSearch(requestParameters, "brand", InputDataChecker.getBrandFromUser());
                addElectroBikeSearchParameters(requestParameters, maxSpeed, batteryCapacity);
                break;
        }
    }

    private static void getBrandForSearch(Map<String, String> requestParameters, String brand2, String brandFromUser) {
        requestParameters.put(brand2, brandFromUser);
    }


    private static Map<String, String> addBaseSearchParameters(Map<String, String> requestParameters, String bikeWeight, String isFrontAndBackLight,
                                                               String color, String price) {
        checkBox(requestParameters, bikeWeight, "bikeWeight");
        checkBox(requestParameters, isFrontAndBackLight, "isFrontAndBackLight");
        checkBox(requestParameters, color, "color");
        checkBox(requestParameters, price, "price");
        return requestParameters;
    }


    private static Map<String, String> addElectroBikeSearchParameters(Map<String, String> requestParameters, String maxSpeed, String batteryCapacity) {
        checkBox(requestParameters, maxSpeed, "maxSpeed");
        checkBox(requestParameters, batteryCapacity, "batteryCapacity");
        return requestParameters;
    }


    private static Map<String, String> addFoldingBikeSearсhParameters(Map<String, String> requestParameters, String wheelsSizeInch, String gearsNumber) {
        checkBox(requestParameters, wheelsSizeInch, "wheelsSizeInch");
        checkBox(requestParameters, gearsNumber, "gearsNumber");
        return requestParameters;
    }

    private static Map<String, String> checkBox(Map<String, String> requestParameters, String parameter, String name) {
        String value = InputDataChecker.getSearchParameters(parameter);
        if (!value.isEmpty()) {
            requestParameters.put(name, value);
        }
        return requestParameters;
    }

    /*private static void continueOrNot(Consumer consumer, Map<String, String> requestParameters ){
        System.out.println("Would you like to add additional parameters for your search?");
        String answer = InputDataChecker.getYesOrNoAnswer();
        switch(answer){
            case "y" :{
                System.out.println("Ok, let’s add the additional parameters");
                consumer.accept(requestParameters);
                break;
            }
            case "n" :{
                System.out.println("Ok, let’s skip the additional parameters");
                break;
            }
        }
    }*/
}
