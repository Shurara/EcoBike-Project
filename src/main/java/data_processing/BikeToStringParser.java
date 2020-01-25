package data_processing;

import model.Bike;

public class BikeToStringParser {
    public static String getStringFromBike(Bike bike){

        String result = bike.convertBikeToWrite();;
        /*String bikeType ="";
        if("FoldingBike".equals(bike.getClass().getSimpleName())){
            bike.convertBikeToWrite();
        }
        if("EBike".equals(bike.getClass().getSimpleName())){

        }
        if("Speedelec".equals(bike.getClass().getSimpleName())){

        }*/
        return result;
    }
}
