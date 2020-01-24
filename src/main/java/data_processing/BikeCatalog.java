package data_processing;

import model.Bike;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BikeCatalog {
    private static List<Bike> list;
    private static boolean isChanged;
    static Path path = Paths.get("src/ecobike.txt");

    //Path path = Paths.get("src/test.txt");

    public static void showCatalog() {
        list = getList();
        list.stream().forEach(x -> System.out.println(x.showBikeInCatalog()));
    }

    public static List<Bike> getListFromFile(Path path) {
        return new DataWriter().getDataFromFile(path)
                .stream()
                .map(string -> StringToBikeParser.parseProperties(string))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static void addBikeToList(Bike bike) {
        System.out.println(getList().size());
        getList().add(bike);
        setCatalogChanged(true);
        System.out.println("Bike was added to catalog");
        System.out.println(getList().size());
        //showCatalog();
    }

    public static boolean catalogIsChanged() {
        return isChanged;
    }

    public static void setCatalogChanged(boolean isChanged) {
        BikeCatalog.isChanged = isChanged;
    }

    public static List<Bike> getList() {
        return list == null ? getListFromFile(path) : list;
    }
}