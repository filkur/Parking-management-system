package ParkingApp.MenuApp.MenuEnterParking;

import ParkingApp.MenuApp.SelectNumber;
import ParkingApp.Model.Space.Space;
import ParkingApp.Model.Space.SpaceRepository;

import java.util.Optional;


public class SpaceParking {
    public static void selectParkingSpace(){
        System.out.println("Enter the number of parking space that you want to hire");
        int spaceNumber = SelectNumber.getNumber();
        Optional<Space> space = new SpaceRepository().findById(spaceNumber);
        space.ifPresentOrElse(element -> {
            if (!element.isHired()){
                element.setHired(true);
                new SpaceRepository().updateSpace(element);
            }
            else
                System.out.println("You selected a hired parking space. Please try again");
            },
                () -> System.out.println("You selected a parking space that doesn't exist. Please try again"));
    }
}
