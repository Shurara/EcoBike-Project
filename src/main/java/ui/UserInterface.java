package ui;

import data_processing.BikeCatalog;

import java.util.Scanner;

public class UserInterface {
    public void createStartMenu(){

        System.out.println("=========================================================");
        System.out.println("|               Please make your choice                 |");
        System.out.println("=========================================================");
        System.out.println("|                       Options:                        |");
        System.out.println("|        1.  Show the entire EcoBike catalog            |");
        System.out.println("|        2.  Add a new folding bike                     |");
        System.out.println("|        3.  Add a new speedelec                        |");
        System.out.println("|        4.  Add a new e-bike                           |");
        System.out.println("|        5.  Find the first item of a particular brand  |");
        System.out.println("|        6.  Write to file                              |");
        System.out.println("|        7.  Stop the program                           |");
        System.out.println("=========================================================");

        getUserSelection();
    }

    public void getUserSelection() {
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
        System.out.println("Thank you!");


        // Switch construct
        switch (number) {
            case 1:
                System.out.println("You selected - Show the entire EcoBike catalog");
                System.out.println("**********************************************");
                pressAnyKeyToContinue();
                BikeCatalog.showCatalog();
                returnToMineMenu();
                break;
            case 2:
                System.out.println("You selected - Add a new folding bike");
                break;
            case 3:
                System.out.println("You selected - Add a new speedelec");
                break;
            case 4:
                System.out.println("You selected - Add a new e-bike");
                break;
            case 5:
                System.out.println("You selected - Find the first item of a particular brand");
                break;
            case 6:
                System.out.println("You selected - Write to file");
                break;
            case 7:
                System.out.println("You selected - Stop the program");
                System.out.println("**********************************************");
                System.out.println("Thank you for using our software! Good luck!");
                pressAnyKeyToContinue();
                System.exit(0);
                break;
        }

    }
    private void pressAnyKeyToContinue(){
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }
    private void returnToMineMenu(){
        System.out.println("To return to mine menu press any key");
        try
        {
            System.in.read();
            createStartMenu();
        }
        catch(Exception e)
        {}
    }

}

