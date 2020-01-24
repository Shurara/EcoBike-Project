package ui;

import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePathGetter {

    private static Path path;

    public static Path getPath() {
        return path;
    }

    public static void setPath(Path fullPath) {
        path = fullPath;
    }

    public static Path getUserFilePath() {
        System.out.println("========================================================================================");
        System.out.println("Please specify the path to the file");
        System.out.println("Original ecobike.txt file has path - \"src/ecobike.txt\" ");
        System.out.println("if you specify an invalid path, the default file will be uploaded - \"src/ecobike.txt\" ");
        System.out.println("========================================================================================");
        System.out.println("");
        String stringValue = InputDataChecker.getStringValue(str -> !"B".equalsIgnoreCase(str) && !"N".equalsIgnoreCase(str), "Don't rush! You can choose only B or N!");
        return isValidPath(stringValue) ? Paths.get(stringValue) : Paths.get("src/ecobike.txt");


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
