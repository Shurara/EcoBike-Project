package model;

import java.util.Map;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(features, product.features);
    }

    @Override
    public int hashCode() {
        return Objects.hash(features);
    }
}
