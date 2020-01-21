package data_processing;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DataWriter {

    public static List<String> getDataFromFile(Path path) {

        List<String> stringList = new ArrayList<>();
        try {
            stringList = Files.lines(path).collect(Collectors.toCollection(ArrayList::new));
        } catch (IOException e) {
            System.out.println("Файл не найден, проверьте его месторасположение");
        }
        return stringList;
    }


}
