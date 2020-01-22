package ui;

import java.util.Scanner;

public class InputFoldingBikeData {

    public static String[] getBikeProperties() {
        String[] properties = new String[6];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input brand of Folding Bike..");
        String brand = scanner.nextLine();

        System.out.println("Please input the size of the wheels (in inch) for Folding Bike..");
        int wheelsSizeInch = DataChecker.getNubmerValue(i -> i > 0, "Please enter the number of task from 1 to 7");

        System.out.println("Please input the number of gears for Folding Bike..");
        int gearsNumber = scanner.nextInt();

        System.out.println("Please input the weight of the bike (in grams) for Folding Bike..");
        int bikeWeight = scanner.nextInt();

        System.out.println("Please input the availability of lights at front and back (TRUE/FALSE) for Folding Bike..");
        boolean isFrontAndBackLight = scanner.nextBoolean();

        System.out.println("Please input the color for Folding Bike..");
        String color = scanner.nextLine();

        System.out.println("Please input the price for Folding Bike..");
        int price = scanner.nextInt();

        return properties;
    }
}
