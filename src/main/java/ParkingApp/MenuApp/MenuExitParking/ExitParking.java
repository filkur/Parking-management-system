package ParkingApp.MenuApp.MenuExitParking;

import ParkingApp.Model.Space.Space;
import ParkingApp.Model.Space.SpaceRepository;

import java.util.Optional;
import java.util.Scanner;

public class ExitParking {
    private static final Scanner scan = new Scanner(System.in);
    public static void  exitParkingSpace () {
        System.out.println("Enter the number of the parking space that you are leaving");
        int number = scan.nextInt();
        SpaceRepository spaceRepository = new SpaceRepository();
        Optional<Space> space = spaceRepository.findById(number);
        space.ifPresentOrElse(element -> {
            element.setHired(false);
            spaceRepository.updateSpace(element);
        },
                () -> System.out.println("Number of parking space doesn't exist"));
    }
}
