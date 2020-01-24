package model;

import java.util.Map;

public class Product {
    private Map<String, String> features;

    public Map<String, String> getFeatures() {
        return features;
    }

    public Product(Map<String, String> features) {
        this.features = features;
    }

    @Override
    public String toString() {
        return features.toString();
    }
}
