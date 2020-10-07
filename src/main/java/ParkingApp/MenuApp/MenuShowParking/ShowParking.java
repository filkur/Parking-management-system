package ParkingApp.MenuApp.MenuShowParking;

import ParkingApp.Model.Space.Space;
import ParkingApp.Model.Space.SpaceRepository;

import java.util.List;
import java.util.Optional;

public class ShowParking {
    public static boolean showAllSpaces() {
        SpaceRepository spaceRepository = new SpaceRepository();
        Optional<List<Space>> spaces = spaceRepository.findEmptySpaces();
        if (spaces.isPresent()) {
            List<Space> spaceList = spaces.get();
            if (spaceList.isEmpty()){
                System.out.println("No free parking spaces");
                return false;
            }
            else{
                StringBuilder freeSpaces = new StringBuilder("Available parking spaces: \n");
                for (Space space : spaceList)
                    freeSpaces.append(" ").append(space.getId());
                System.out.println(freeSpaces);
            return true;
        }
        }
        else
            System.out.println("Connection problem"); return false;
    }
}