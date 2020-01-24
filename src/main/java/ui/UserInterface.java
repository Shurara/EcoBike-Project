package ui;

import data_processing.BikeCatalog;
import factories.BikeFactory;

public class UserInterface {
    public void createStartMenu() {

        System.out.println("=========================================================");
        System.out.println("|               Please make your choice                 |");
        System.out.println("|                       Options:                        |");
        System.out.println("=========================================================");
        System.out.println("|        1.  Show the entire EcoBike catalog            |");
        System.out.println("=========================================================");
        System.out.println("|        2.  Add a new folding bike                     |");
        System.out.println("=========================================================");
        System.out.println("|        3.  Add a new speedelec                        |");
        System.out.println("=========================================================");
        System.out.println("|        4.  Add a new e-bike                           |");
        System.out.println("=========================================================");
        System.out.println("|        5.  Find the first item of a particular brand  |");
        System.out.println("=========================================================");
        System.out.println("|        6.  Write to file                              |");
        System.out.println("=========================================================");
        System.out.println("|        7.  Stop the program                           |");
        System.out.println("=========================================================");

        getUserSelection();
    }

    public void getUserSelection() {
        int taskNumber = InputDataChecker.getNubmerValue(i -> i < 1 || i > 7, "Please enter the number of task from 1 to 7");
        // Switch construct
        switch (taskNumber) {
            case 1:
                System.out.println("You selected - Show the entire EcoBike catalog");
                System.out.println("*********************************************************");
                pressEnterToContinue();
                BikeCatalog.showCatalog();
                returnToMineMenu();
                System.out.println("*********************************************************");
                break;
            case 2:
                System.out.println("You selected - Add a new folding bike");
                System.out.println("*********************************************************");
                pressEnterToContinue();
                System.out.println("Ok! Lets add a new folding bike instance");
                InputBikeData data = new InputBikeData();
                data.setFullFoldingBikeData();
                BikeCatalog.addBikeToList(BikeFactory.getBike(TextConstants.getFoldingBike(), data));
                System.out.println("*********************************************************");
                returnToMineMenu();
                break;
            case 3:
                System.out.println("You selected - Add a new speedelec");
                System.out.println("*********************************************************");
                pressEnterToContinue();
                System.out.println("Ok! Lets add a new speedelec bike instance");
                InputBikeData spData = new InputBikeData();
                spData.setFullElectroBikeData();
                BikeCatalog.addBikeToList(BikeFactory.getBike(TextConstants.getFoldingBike(), spData));
                System.out.println("*********************************************************");
                pressEnterToContinue();
                returnToMineMenu();
                break;
            case 4:
                System.out.println("You selected - Add a new e-bike");
                System.out.println("*********************************************************");
                pressEnterToContinue();
                System.out.println("Ok! Lets add a new e-bike bike instance");
                InputBikeData eData = new InputBikeData();
                eData.setFullElectroBikeData();
                BikeCatalog.addBikeToList(BikeFactory.getBike(TextConstants.getFoldingBike(), eData));
                System.out.println("*********************************************************");
                returnToMineMenu();
                break;
            case 5:
                System.out.println("You selected - Find the first item of a particular brand");
                System.out.println("*********************************************************");
                System.out.println("Ok! Lets start finding");
                InputSearchParams.getSearchValues();
                returnToMineMenu();
                break;
            case 6:
                System.out.println("You selected - Write to file");
                returnToMineMenu();
                break;

            case 7:
                System.out.println("You selected - Stop the program");
                System.out.println("*********************************************************");
                System.out.println("Thank you for using our software! Good luck!");
                pressEnterToContinue();
                System.exit(0);
                break;
        }

    }

    private void pressEnterToContinue() {
        System.out.println("Press Enter key to continue...");
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }

    private void returnToMineMenu() {
        System.out.println();
        System.out.println("*********************************************************");
        System.out.println("To return to Main menu press Enter");
        try {
            System.in.read();
            createStartMenu();
        } catch (Exception e) {
        }
    }

}

