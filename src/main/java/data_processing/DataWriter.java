package data_processing;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DataWriter {

    static List<String> getDataFromFile(Path path) {

        List<String> stringList = new ArrayList<>();
        try {
            stringList = Files.lines(path).collect(Collectors.toCollection(ArrayList::new));
        } catch (IOException e) {
            System.out.println("File not found, default file uploaded");
        }
        return stringList;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
