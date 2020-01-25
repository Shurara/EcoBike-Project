package data_processing;

import model.Bike;
import model.Product;
import ui.FilePathGetter;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BikeCatalog {
    private static List<Bike> list;
    private static boolean isChanged;

    public static void initialCatalog(){
        list = getList();
    }

    public static void showCatalog() {
        list = getList();
        list.stream().forEach(x -> System.out.println(x.showBikeInCatalog()));
    }

    public static List<Bike> getListFromFile() {
        List<Bike>createdList = new DataWriter().getDataFromFile(FilePathGetter.getPath())
                .stream()
                .map(string -> StringToBikeParser.parseProperties(string))
                .collect(Collectors.toCollection(ArrayList::new));
        return createdList;
    }

    public static void addBikeToList(Bike bike) {
        System.out.printf("The catalog contained %d models \n",  getList().size());
        getList().add(bike);
        setCatalogChanged(true);
        System.out.println("Bike was added to catalog");
        System.out.printf("Now the catalog contains %d \n",  getList().size());
    }

    public static boolean catalogIsChanged() {
        return isChanged;
    }

    public static void setCatalogChanged(boolean isChanged) {
        BikeCatalog.isChanged = isChanged;
    }

    public static List<Bike> getList() {
        return list == null ? getListFromFile() : list;
    }

}