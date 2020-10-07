package ParkingApp.MenuApp.MenuEnterParking;

import ParkingApp.MenuApp.MenuBuyTicket.BuyTicket;
import ParkingApp.MenuApp.MenuShowParking.ShowParking;
import ParkingApp.MenuApp.SelectNumber;

public class EnterParking {
    public static void enterParkingMenu() {
        System.out.println("1.Buy a ticket");
        System.out.println("2.I already have a ticket");
        switch (SelectNumber.getNumber()){
            case 1:{
                BuyTicket.takeTicket();
                SpaceParking.selectParkingSpace();
                break;
            }
            case 2:{
                if (!TicketParking.checkTicket()){
                    System.out.println("Ticket has not been purchased!");
                    break;
                }
                ShowParking.showAllSpaces();
                SpaceParking.selectParkingSpace();
                break;
            }
            default:
                System.out.println("Didn't select");
        }
    }
}
