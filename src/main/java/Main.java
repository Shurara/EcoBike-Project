

import data_processing.DataWriter;
import data_processing.StringToBikeParser;
import model.Bike;
import ui.UserInterface;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("src/ecobike.txt");
        //Path path = Paths.get("src/test.txt");
        List<Bike> listFromFile = new DataWriter().getDataFromFile(path)
                .stream()
                .map(string -> StringToBikeParser.parseModels(string))
                .collect(Collectors.toList());
                //.forEach(System.out::println);

        //listFromFile.stream().forEach(System.out::println);



        new UserInterface().createStartMenu();


    }
}
