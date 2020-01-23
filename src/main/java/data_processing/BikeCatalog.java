package data_processing;

import model.Bike;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BikeCatalog {
    private static boolean isChanged;
    static Path path = Paths.get("src/ecobike.txt");
    //Path path = Paths.get("src/test.txt");

    public static void showCatalog(){
        List<Bike> originalList = getListOfBikes();
        originalList.stream().forEach(System.out::println);
    }

    public static List<Bike> getListOfBikes() {
        return new DataWriter().getDataFromFile(path)
                .stream()
                .map(string -> StringToBikeParser.parseProperties(string))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static boolean isChanged() {
        return isChanged;
    }

    public static void setChanged(boolean isChanged) {
        BikeCatalog.isChanged = isChanged;
    }
}