import file_processing.FileWriter;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("src/ecobike.txt");
        new FileWriter().getDataFromFile(path).stream().forEach(System.out::println);

    }
}
