

import data_processing.DataWriter;
import data_processing.StringToBikeParser;
import model.Bike;
import model.Speedelec;
import ui.UserInterface;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        //Bike bike = listFromFile.get(1);
        //System.out.println(bike.getClass());

        UserInterface userInterface = new UserInterface();
        userInterface.createStartMenu();
        userInterface.getUserSelection();


    }
}
