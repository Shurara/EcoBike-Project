

import ui.UserInterface;

public class Main {
    public static void main(String[] args) {


        //Bike bike = listFromFile.get(1);
        //System.out.println(bike.getClass());

        UserInterface userInterface = new UserInterface();
        userInterface.createStartMenu();
        userInterface.getUserSelection();

       /*int n = DataChecker.getNubmerProperty(i -> i>0);
        System.out.println(n);*/


    }
}
