import data_processing.BikeCatalog;
import ui.FilePathGetter;
import ui.UserInterface;

public class Main {
    public static void main(String[] args) {
        FilePathGetter.getUserFilePath();
        BikeCatalog.initialCatalog();
        UserInterface userInterface = new UserInterface();
        userInterface.createStartMenu();
        userInterface.getUserSelection();


    }
}