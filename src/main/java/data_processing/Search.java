package data_processing;

import model.Product;
import ui.FilePathGetter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Search {
    private static List<Product> productList;

    public static void initialProductList() {
        productList = getProduct();
    }

    public static List<Product> getProduct() {
        return new DataWriter().getDataFromFile(FilePathGetter.getPath())
                .stream()
                .map(string -> ParseStringToProduct.parseProperties(string))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static List<Product> getProductFromList() {
        return BikeCatalog.getList()
                .stream()
                .map(bike -> bike.convertBikeToSring())
                .map(string -> ParseStringToProduct.parseProperties(string))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static void searchBike(Map<String, String> searchValue) {
        List<Product> collect = productList.parallelStream()
                .filter(item -> filterByFeatures(searchValue, item.getFeatures()))
                .collect(Collectors.toList());
        if (collect.isEmpty()) {
            System.out.println("No matches found.. Try change your search parameters ");
        } else {
            collect.forEach(x -> System.out.println("According to your search parameters found: " + x));
        }

    }

    private static boolean filterByFeatures(Map<String, String> filter, Map<String, String> features) {
        return filter.entrySet().stream()
                .filter(param -> param.getValue() != null)
                .filter(param -> !param.getValue().isEmpty())
                .allMatch(param -> param.getValue().equalsIgnoreCase(features.get(param.getKey())));
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
