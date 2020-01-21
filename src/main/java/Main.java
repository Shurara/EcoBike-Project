

import file_processing.DataWriter;
import file_processing.StringToBikeParser;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("src/ecobike.txt");
        new DataWriter().getDataFromFile(path)
                .stream()
                .map(string ->StringToBikeParser.parseModels(string))
                .collect(Collectors.toList());


    }
}
