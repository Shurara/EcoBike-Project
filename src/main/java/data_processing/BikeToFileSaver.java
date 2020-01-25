package data_processing;

import model.Bike;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class BikeToFileSaver {

    public static void save(List<Bike> list, Path path) {
        list.stream()
                .map(bike -> bike.convertBikeToWrite())
                .forEach(x -> {
                    try {
                        Files.write(path, x.getBytes());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });

    }

}


