import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DataWriter {
    public static void main(String[] args) {
        Path path = Paths.get("src/ecobike.txt");
        getDataFromFile(path).stream().forEach(System.out::println);
    }

    public static void parseModels(String input) {

        if (input.startsWith("FOLDING BIKE")) {
            String[] foldingBikeProps = input.substring(13).trim().split(";");
            System.out.println(foldingBikeProps.length);
        }
        if (input.startsWith("SPEEDELEC")) {
            String[] speedelecProps = input.substring(10).trim().split(";");
            System.out.println(speedelecProps);
        }
        if (input.startsWith("E-BIKE")) {
            String[] eBikeProps = input.substring(7).trim().split(";");
            System.out.println(eBikeProps);

        }

    }

    public static List<String> getDataFromFile(Path path) {

        List<String> stringList = new ArrayList<>();
        try {
            stringList = Files.lines(path).collect(Collectors.toCollection(ArrayList::new));
        } catch (IOException e) {
            System.out.println("Файл не найден, введите еще раз");

        }
        return stringList;
    }


}
