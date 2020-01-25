package data_processing;

import model.Bike;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class BikeToFileSaver {

    public static void save(List<Bike> list, Path path) {
        List<String> strings = list.stream()
                .map(bike -> bike.convertBikeToWrite())
                .collect(Collectors.toList());
        try {
            Files.write(path, strings, Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("file not found");
        }
    }

}


