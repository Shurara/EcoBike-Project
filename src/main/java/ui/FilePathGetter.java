package ui;

import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePathGetter {

    private static Path path;
    private static boolean pathPresent;

    public static boolean isPathPresent() {
        return pathPresent;
    }

    public static void setPathPresent(boolean pathPresent) {
        pathPresent = pathPresent;
    }

    public static Path getPath() {
        return path;
    }

    public static void setPath(Path fullPath) {
        path = fullPath;
    }

    public static Path getUserFilePath() {
        String value = UserInterface.getUserPathVariant();
        //Path path = Paths.get("src/ecobike.txt");
        switch (value) {
            case "b":
                System.out.println("Вариант с файлом по умолчанию");
                setPath(path);
                setPathPresent(true);
                break;
            case "n":
                System.out.println("Вариант с файлом юзера не работает");
                String input = InputDataChecker.getStringValue(str -> str == null || str.trim().isEmpty(), "Your input should contain path to your source file");
                if (isValidPath(input)) {
                    setPath(Paths.get(input));
                    pathPresent = true;
                }else{
                    UserInterface.getUserPathVariant();
                }
                break;
        }
        return path;
    }

    public static boolean isValidPath(String path) {
        try {
            Paths.get(path);
        } catch (InvalidPathException | NullPointerException ex) {
            return false;
        }
        return true;
    }


}
