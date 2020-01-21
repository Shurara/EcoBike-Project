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
        System.out.println("Enter number from 1 to 7 :   ");
        Scanner scanner = new Scanner(System.in);
        int inputValue;
        inputValue = scanner.nextInt();
           /* */

        while(inputValue >7||inputValue <1){
            System.out.println("Please enter number from 1 to 7 :   ");
            inputValue = scanner.nextInt();
        }

        // Switch construct
        switch (inputValue) {
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
            default:
                System.out.println("Invalid selection, please select option");
                break; // This break is not really necessary
        }
    }
}

