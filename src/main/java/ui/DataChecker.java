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
            /*while (!sc.hasNext()) {
                System.out.println("String is empty! Try again)");
                sc.next(); // this is important!
            }*/
            input = sc.nextLine();
        } while (breakPredicate.test(input));
        System.out.println("Thank you!");
        return input;
    }

   /* public static String getSearchParameters() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Thank you! Yo");
        return input.isEmpty() ? null : input;
    }*/

    public static String getSearchParameters(String parameter) {
        System.out.printf("Would you like add the %s for searching? Please enter yes or no. ", parameter);
        String ansver = getStringValue(str -> !"yes".equals(str) || !"no".equals(str), "Don't rush! Only yes or no!");
        System.out.println("Thank you!");
        String value = "";

        switch (ansver.toLowerCase()) {
            case "yes":
                value = DataChecker.getStringValue(str -> str == null || str.isEmpty(), "String must be not empty");
            case "no":
                value = null;
        }
        return value;
    }

}


