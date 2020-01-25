package ui;

import java.util.Scanner;
import java.util.function.Predicate;

public class InputDataChecker {

    public static int getNubmerValue(Predicate<Integer> predicate, String mistakeMessage) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println(mistakeMessage);
            while (!sc.hasNextInt()) {
                System.out.println("That's not a number! Try again)");
                sc.next(); // this is important!
            }
            number = sc.nextInt();
        } while (predicate.test(number));
        System.out.println("Thank you!");
        System.out.println();
        return number;
    }

    public static String getStringValue(Predicate<String> breakPredicate, String mistakeMessage) {
        Scanner sc = new Scanner(System.in);
        String input;
        do {
            System.out.println(mistakeMessage);
            input = sc.nextLine();
        } while (breakPredicate.test(input));
        System.out.println("Thank you!");
        System.out.println("");
        return input;
    }

    public static boolean getBooleanValue(Predicate<String> breakPredicate, String mistakeMessage) {
        Scanner sc = new Scanner(System.in);
        String input;
        do {
            System.out.println(mistakeMessage);
            input = sc.next();
        } while (breakPredicate.test(input));
        System.out.println("Thank you!");
        System.out.println("");
        return Boolean.parseBoolean(input);
    }


    public static String getSearchParameters(String parameter) {
        String value = "";
        System.out.printf("Would you like add the %s to search parameters? \n", parameter);

        switch (getYesOrNoAnswer()) {
            case "y": {
                System.out.printf("Please input %s parameter \n", parameter);
                value = getStringValue(str -> str == null || str.trim().isEmpty(), "String must be not empty");
                break;
            }
            case "n": {
                System.out.printf("parameter %s skipped \n", parameter);
                break;
            }
        }
        return value;
    }

    static String getYesOrNoAnswer() {
        System.out.println("Please enter  y (yes) or n (no)");
        return getStringValue(str -> !"y".equalsIgnoreCase(str) && !"n".equalsIgnoreCase(str), "Don't rush! Only y or n!");
    }

    static String getBikeType() {
        System.out.println("What type of bike will you look for?");
        System.out.println("Please press F if it will be Folding Bike");
        System.out.println("Please press E if it will be E-Bike");
        System.out.println("Please press S if it will be Speedelec");
        System.out.println("");
        return getStringValue(str -> !"f".equalsIgnoreCase(str) && !"e".equalsIgnoreCase(str) && !"s".equalsIgnoreCase(str), "Don't rush! You can choose only F or E or S!");
    }

    public static String getBrandFromUser() {
        System.out.println("Please input brand parameter ");
        return getStringValue(str -> str == null || str.trim().isEmpty(), "String must be not empty");
    }


}


