package data_processing;

import model.Bike;

import java.util.List;

public class FileChangeChecker {
    private static List<Bike> startValue;
    private static List<Bike> finishValue;

    public static boolean changeCheck(){
        return getStartValue().equals(getFinishValue());
    }


    public static List<Bike> getStartValue() {
        return startValue;
    }

    public static void setStartValue(List<Bike> startValue) {
        startValue = startValue;
    }

    public static List<Bike> getFinishValue() {
        return finishValue;
    }

    public static void setFinishValue(List<Bike> finishValue) {
        finishValue = finishValue;
    }
}
