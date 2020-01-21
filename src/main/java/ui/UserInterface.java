package ui;

import java.util.Scanner;

public class UserInterface {
    public void createStartMenu(){


        System.out.println("=========================================================");
        System.out.println("|          Please make your choice                      |");
        System.out.println("=========================================================");
        System.out.println("|                 Options:                              |");
        System.out.println("|        1.  Show the entire EcoBike catalog            |");
        System.out.println("|        2.  Add a new folding bike                     |");
        System.out.println("|        3.  Add a new speedelec                        |");
        System.out.println("|        4.  Add a new e-bike                           |");
        System.out.println("|        5.  Find the first item of a particular brand  |");
        System.out.println("|        6.  Write to file                              |");
        System.out.println("|        7.  Stop the program                           |");
        System.out.println("=========================================================");

        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Please enter the number of task from 1 to 7");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a number! Try again)");
                sc.next(); // this is important!
            }
            number = sc.nextInt();
        } while (number < 1 || number > 7);
        System.out.println("Thank you! Got " + number);


        // Switch construct
        switch (number) {
            case 1:
                System.out.println("Option 1 selected");
                break;
            case 2:
                System.out.println("Option 2 selected");
                break;
            case 3:
                System.out.println("Option 2 selected");
                break;
            case 4:
                System.out.println("Option 2 selected");
                break;
            case 5:
                System.out.println("Option 2 selected");
                break;
            case 6:
                System.out.println("Option 2 selected");
                break;
            case 7:
                System.out.println("Exit selected");
                break;
           /* default:
                System.out.println("Invalid selection, please select option");
                break; // This break is not really necessary*/
        }
    }
}

