package factories;

import model.Bike;

public interface Factory {
    Bike getBike(String bikeType, String[]properties);
}
