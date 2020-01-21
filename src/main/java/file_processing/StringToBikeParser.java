package file_processing;

public class StringToBikeParser {
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
}
