package data_processing;

import ui.DataChecker;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SearchFunction {
    public static Map<String, String> getSearchValues() {
        Map<String, String> searchParameters = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        //FOLDING BIKE
        String brand = "brand";
        String wheelsSizeInch = "wheelsSizeInch";
        String gearsNumber = "gearsNumber";
        String bikeWeight = "bikeWeight";
        String isFrontAndBackLight = "isFrontAndBackLight";
        String color = "color";
        String price = "price";

        searchParameters.put(brand, DataChecker.getSearchParameters(brand));

        searchParameters.put(wheelsSizeInch, DataChecker.getSearchParameters(wheelsSizeInch));

        searchParameters.put(gearsNumber, DataChecker.getSearchParameters(gearsNumber));

        searchParameters.put(bikeWeight, DataChecker.getSearchParameters(bikeWeight));

        searchParameters.put(isFrontAndBackLight, DataChecker.getSearchParameters(isFrontAndBackLight));

        searchParameters.put(color, DataChecker.getSearchParameters(color));

        searchParameters.put(price, DataChecker.getSearchParameters(price));

        return searchParameters;
    }


}
