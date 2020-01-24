

import data_processing.BikeCatalog;
import factories.BikeFactory;
import ui.InputBikeData;
import ui.TextConstants;

public class Main {
    public static void main(String[] args) {


        //Bike bike = listFromFile.get(1);
        //System.out.println(bike.getClass());

       /* UserInterface userInterface = new UserInterface();
        userInterface.createStartMenu();
        userInterface.getUserSelection();*/

        InputBikeData spData = new InputBikeData();
        spData.setFullElectroBikeData();
        System.out.println(spData.getBrand());
        System.out.println(spData.getColor());
        System.out.println(spData.getPrice());

        BikeCatalog.addBikeToList(BikeFactory.getBike(TextConstants.getFoldingBike(), spData));



    }
}
