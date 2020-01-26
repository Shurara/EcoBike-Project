package data_processing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import model.Product;

import static data_processing.Fields.BATTERYCAPACITY;
import static data_processing.Fields.BIKEWEIGHT;
import static data_processing.Fields.BRAND;
import static data_processing.Fields.COLOR;
import static data_processing.Fields.EBIKE;
import static data_processing.Fields.FOLDINGBIKE;
import static data_processing.Fields.GEARSNUMBER;
import static data_processing.Fields.ISFRONTANDBACKLIGHT;
import static data_processing.Fields.MAXSPEED;
import static data_processing.Fields.PRICE;
import static data_processing.Fields.SPEEDELEC;
import static data_processing.Fields.TYPE;
import static data_processing.Fields.WHEELSSIZEINCH;

public class ParseStringToProduct {

    static Product parseProperties(String input) {
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

        return createProduct(bikeType, properties);

    }

    private static Product createProduct(String bikeType, String[] properties) {
        Map<String, String> result = new HashMap<String, String>();
        if (bikeType.equalsIgnoreCase("FOLDING BIKE")) {
            result = getFeaturesForFoldingBike(properties);
        } else if (bikeType.equalsIgnoreCase("SPEEDELEC")) {
            Map<String, String> featuresForSpeedelecBike = getFeaturesForSpeedelecAndEbikeBike(properties);
            featuresForSpeedelecBike.put(TYPE.getName(), SPEEDELEC.getName());
            result = featuresForSpeedelecBike;
        } else if (bikeType.equalsIgnoreCase("E-BIKE")) {
            Map<String, String> featuresForEbikeBike = getFeaturesForSpeedelecAndEbikeBike(properties);
            featuresForEbikeBike.put(TYPE.getName(), EBIKE.getName());
            result = featuresForEbikeBike;
        }
        return new Product(result);
    }


    private static Map<String, String> getFeaturesForFoldingBike(String[] properties) {
        Map<String, String> result = new HashMap<>();
        result.put(TYPE.getName(), FOLDINGBIKE.getName());
        result.put(BRAND.getName(), properties[0].trim());
        result.put(WHEELSSIZEINCH.getName(), properties[1].trim());
        result.put(GEARSNUMBER.getName(), properties[2].trim());
        result.put(BIKEWEIGHT.getName(), properties[3].trim());
        result.put(ISFRONTANDBACKLIGHT.getName(), properties[4].trim());
        result.put(COLOR.getName(), properties[5].trim());
        result.put(PRICE.getName(), properties[6].trim());

        return result;
    }

    private static Map<String, String> getFeaturesForSpeedelecAndEbikeBike(String[] properties) {
        Map<String, String> result = new LinkedHashMap<>();
        result.put(BRAND.getName(), properties[0].trim());
        result.put(MAXSPEED.getName(), properties[1].trim());
        result.put(BIKEWEIGHT.getName(), properties[2].trim());
        result.put(ISFRONTANDBACKLIGHT.getName(), properties[3].trim());
        result.put(BATTERYCAPACITY.getName(), properties[4].trim());
        result.put(COLOR.getName(), properties[5].trim());
        result.put(PRICE.getName(), properties[6].trim());

        return result;
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
