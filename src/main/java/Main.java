import data_processing.BikeCatalog;
import data_processing.Search;
import ui.FilePathGetter;
import ui.UserInterface;

public class Main {
    public static void main(String[] args) {
        FilePathGetter.getUserFilePath();
        BikeCatalog.initialCatalog();
        Search.initialProductList();
        UserInterface userInterface = new UserInterface();
        userInterface.createStartMenu();
        userInterface.getUserSelection();


    }
}