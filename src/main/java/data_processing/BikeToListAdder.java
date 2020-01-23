package data_processing;

import factories.BikeFactory;
import model.Bike;
import java.util.List;

public class BikeToListAdder {
    List<Bike> list;
    BikeFactory bikeFactory;

    public BikeToListAdder(List<Bike> list, BikeFactory bikeFactory) {
        this.list = list;
        this.bikeFactory = bikeFactory;
    }

    public List<Bike> addBikeToList(List<Bike> list, String bikeType) {
        List<Bike> listOfBikes = BikeCatalog.getListOfBikes();
        BikeCatalog.getListOfBikes().add(bikeFactory.getBike(bikeType));
        BikeCatalog.setChanged(true);
        return listOfBikes;
    }
}
