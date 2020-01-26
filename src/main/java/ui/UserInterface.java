package ui;

import data_processing.BikeCatalog;
import data_processing.BikeToFileSaver;
import data_processing.Search;
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

    static String getUserPathVariant() {

        System.out.println("Please press B if you want upload data from basic file - \"src/ecobike.txt\" ");
        System.out.println("Please press N if you want specify path to new data file");
        System.out.println("");
        return InputDataChecker.getStringValue(str -> !"B".equalsIgnoreCase(str) && !"N".equalsIgnoreCase(str), "Don't rush! You can choose only B or N!");
    }


    public void getUserSelection() {
        int taskNumber = InputDataChecker.getNubmerValue(i -> i < 1 || i > 7, "Please enter the number of task from 1 to 7");
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
                System.out.printf("The catalog contains %d models \n", BikeCatalog.getList().size());
                BikeCatalog.addBikeToList(BikeFactory.getBike(TextConstants.getFoldingBike(), data));
                pressEnterToContinue();
                System.out.println("Bike was added to catalog");
                System.out.printf("Now the catalog contains %d \n", BikeCatalog.getList().size());
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
                System.out.printf("The catalog contains %d models \n", BikeCatalog.getList().size());
                BikeCatalog.addBikeToList(BikeFactory.getBike(TextConstants.getSpeedelecType(), spData));
                pressEnterToContinue();
                System.out.println("Bike was added to catalog");
                System.out.printf("Now the catalog contains %d \n", BikeCatalog.getList().size());
                System.out.println("*********************************************************");
                returnToMineMenu();
                break;
            case 4:
                System.out.println("You selected - Add a new e-bike");
                System.out.println("*********************************************************");
                pressEnterToContinue();
                System.out.println("Ok! Lets add a new e-bike bike instance");
                InputBikeData eData = new InputBikeData();
                eData.setFullElectroBikeData();
                System.out.printf("The catalog contains %d models \n", BikeCatalog.getList().size());
                BikeCatalog.addBikeToList(BikeFactory.getBike(TextConstants.getEBikeType(), eData));
                pressEnterToContinue();
                System.out.println("Bike was added to catalog");
                System.out.printf("Now the catalog contains %d \n", BikeCatalog.getList().size());
                returnToMineMenu();
                break;
            case 5:
                System.out.println("You selected - Find the first item of a particular brand");
                System.out.println("*********************************************************");
                System.out.println("Ok! Ok let's start search");
                InputSearchParams inputParameters = new InputSearchParams();
                inputParameters.getSearchValues();
                inputParameters.showSelectedParams();
                pressEnterToContinue();
                Search.searchBike(inputParameters.getRequestParameters());
                System.out.println("*********************************************************");
                returnToMineMenu();
                break;
            case 6:
                System.out.println("You selected - Write to file");
                System.out.println("*********************************************************");
                if (BikeCatalog.catalogIsChanged()) {
                    BikeToFileSaver.save(BikeCatalog.getList(), FilePathGetter.getPath());
                    System.out.println("Your data have been saved in " + FilePathGetter.getPath());

                } else {
                    System.out.println("Your data has not changed");
                    returnToMineMenu();
                }
                System.out.println("*********************************************************");
                returnToMineMenu();
                break;

            case 7:
                System.out.println("You selected - Stop the program");
                System.out.println("*********************************************************");
                if (BikeCatalog.catalogIsChanged()) {
                    System.out.println("Your data have been changed. Save it?");
                    String answer = InputDataChecker.getYesOrNoAnswer();
                    switch (answer) {
                        case "y": {
                            System.out.println("Your data saved in " + FilePathGetter.getPath());
                            BikeToFileSaver.save(BikeCatalog.getList(), FilePathGetter.getPath());
                        }
                        case "n": {
                            System.out.println("No problem!");
                        }
                    }
                }
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

