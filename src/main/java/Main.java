import data_processing.BikeCatalog;
import data_processing.ListToFileSaver;
import factories.BikeFactory;
import ui.InputBikeData;
import ui.UserInterface;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        UserInterface userInterface = new UserInterface();
        userInterface.createStartMenu();
        userInterface.getUserSelection();

    /*    InputBikeData spData = new InputBikeData();
        spData.setFullElectroBikeData();
        System.out.println(spData.getBrand());
        System.out.println(spData.getColor());
        System.out.println(spData.getPrice());

        BikeCatalog.addBikeToList(BikeFactory.getBike(TextConstants.getFoldingBike(), spData));
*/        /*InputBikeData data = new InputBikeData();
        data.setFullFoldingBikeData();
        String folding_bike = BikeFactory.getBike("FOLDING BIKE", data).getClass().getSimpleName();
        System.out.println(folding_bike);*/

       /* List list = BikeCatalog.getList();
        ListToFileSaver.listSaver(list).stream()
                .forEach(System.out::println);*/

    }
}
