package ui;

import javax.tools.ForwardingJavaFileManager;
import javax.tools.JavaFileManager;
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

    /*public static String getStringValue(Predicate<String> predicate, String mistakeMessage){
        Scanner sc = new Scanner(System.in);
        String input;
        do {
            System.out.println(mistakeMessage);
            while (!sc.hasNext()) {
                System.out.println("That's not a number! Try again)");
                sc.next(); // this is important!
            }
            input = sc.nextLine();
        } while (predicate.test(predicate.test(input)));
        System.out.println("Thank you!");
        return input;
    }*/
}


