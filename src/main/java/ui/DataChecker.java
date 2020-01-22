package ui;

import java.util.Scanner;
import java.util.function.Predicate;

public class DataChecker {

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
        return input;
    }


    public static String getSearchParameters(String parameter) {
        System.out.printf("Would you like add the %s to search parametrs? \n", parameter);
        System.out.println("Please enter yes or no");
        String value = "";
        String ansver = getStringValue(str -> "yes".equalsIgnoreCase(str) && "no".equalsIgnoreCase(str), "Don't rush! Only yes or no!");
        switch (ansver) {
            case "yes": {
                System.out.printf("Please input %s parametr \n", parameter);
                value = getStringValue(str -> str == null || str.trim().isEmpty(), "String must be not empty");
                break;
            }
            case "no": {
                System.out.printf("parametr %s skipped \n", parameter);
                break;
            }
        }
        return value;
    }
}






