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

    public static void getUserFilePath() {
        System.out.println("========================================================================================");
        System.out.println("Please specify the path to the file");
        System.out.println("Original ecobike.txt file has path - \"src/ecobike.txt\" ");
        System.out.println("If you specify an invalid path, the default file will be uploaded - \"src/ecobike.txt\" ");
        System.out.println("========================================================================================");
        System.out.println("");
        String stringValue = inputPath(TextConstants.getInputPathMessage(), TextConstants.getPATH(), TextConstants.getNotEmptyStringMessage());
        if (isValidPath(stringValue)) {
            setPath(Paths.get(stringValue));
            System.out.println(stringValue + " loaded");
        } else {
            setPath(Paths.get("src/ecobike.txt"));
            System.out.println(TextConstants.getPATH() + " loaded");
        }


    }

    public static boolean isValidPath(String path) {
        try {
            Paths.get(path);
        } catch (InvalidPathException | NullPointerException ex) {
            return false;
        }
        return true;
    }

    private static String inputPath(String welcomeMessage, String param, String mistakeMessage) {
        System.out.printf(welcomeMessage, param);
        return InputDataChecker.getStringValue(str -> str == null || str.trim().isEmpty(), mistakeMessage);
    }


}
