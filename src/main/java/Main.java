import ui.FilePathGetter;
import ui.UserInterface;

public class Main {
    public static void main(String[] args) {


        UserInterface userInterface = new UserInterface();
       /* FilePathGetter filePathGetter = new FilePathGetter();
        while(!filePathGetter.isPathPresent()){
            filePathGetter.getUserFilePath();
        }
*/

        userInterface.createStartMenu();
        userInterface.getUserSelection();


    }
}