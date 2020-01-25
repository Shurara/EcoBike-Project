package data_processing;

import model.Bike;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class BikeToFileSaver {

    public static void save(List<Bike> list, Path path) {
        List<String> strings = list.stream()
                .map(bike -> bike.convertBikeToSring())
                .collect(Collectors.toList());
        try {
            Files.write(path, strings, Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("file not found");
        }
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


