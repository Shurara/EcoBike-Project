package data_processing;

import model.Bike;
import java.util.List;
import java.util.stream.Collectors;

public class ListToFileSaver {
    public static List<String> listSaver(List<Bike> list) {
        return list.stream()
                .map(bike -> bike.convertBikeToWrite())
                .collect(Collectors.toList());

    }


}


